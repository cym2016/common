package com.heepay.common.util;

import com.heepay.enums.OnOffStatus;
import com.heepay.redis.JedisClusterUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import redis.clients.jedis.JedisCluster;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


/**
 * 发送邮件
 * <p>Title: EMailInterface.java</p>
 * <p>Description: 描述</p>
 * <p>Copyright: Copyright (c) 2010</p>
 * <p>Company: firstdata</p>
 *
 * @author W.X
 * @version 1.0
 * @created
 */
public class SendMailUtil {
    /**
     * 定义日志对象
     */
    private static final Logger logger = LogManager.getLogger();

    private static JedisCluster jedis = JedisClusterUtil.getJedisCluster();

    private static Properties pros = null;

    static {
        pros = new Properties();
        try {
            pros.load(SmsUtils.class
                    .getResourceAsStream("/smtpserver.properties"));
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("获取smtp邮箱配置文件失败", e);
        }
    }

    //mail.9186.com
    private static final String smtpServer = pros.getProperty("smtpServer");
    private static final String username = pros.getProperty("username");
    private static final String psw = pros.getProperty("psw");
    private static final String emailOnOffStatus = Constants.RedisKey.EMAIL_ON_OFF_STATUS;

    private static SendMailUtil eMailInterface = null;

    /**
     * 伪单构
     *
     * @return
     * @author 彭阳
     * @version 1.1
     */
    public static SendMailUtil getInstance() {
        if (eMailInterface == null)
            eMailInterface = new SendMailUtil();
        return eMailInterface;
    }

    /**
     * 功能：相同邮件的群发,有用户名和密码，带附件功能
     *
     * @param fromMail String　发件人邮件地址
     * @param toMail   String　接收邮件的邮件地址，可以是多个，以逗号分开
     * @param subject  String　标题
     * @param context  String　邮件正文
     * @param altFds   ArrayList　包含所有附件的ArrayList，附件用DataSource 封装
     * @return boolean 成功返回true，否则返回false
     */
    public boolean sendMail(String fromMail, String toMail, String subject, String context, ArrayList altFds) {
        return this.mailSend(fromMail, toMail, subject, context, altFds);
    }

    /**
     * @param toMail  接收人EMAIL 多个EMAIL地址用","分隔
     * @param subject 主题
     * @param context 信件内容
     * @param altFds  封装了公文信息的DATASOURCE数组,没有附件就直接留空或者NULL
     * @return
     * @author 彭阳
     * @version 1.1
     */
    public boolean sendMail(String toMail, String subject, String context, ArrayList altFds) {
        return this.mailSend(username, toMail, subject, context, altFds);
    }


    /**
     * 功能：发送带附件的邮件
     *
     * @param fromMail      String 发送人EMAIL
     * @param toMail        String　　接收人EMAIL 多个EMAIL地址用","分隔
     * @param subject       String　主题
     * @param strContext    String　信件内容
     * @param altDataSource ArrayList　封装了公文信息的DATASOURCE数组
     * @return boolean
     */
    private boolean mailSend(String fromMail, String toMail, String subject, String strContext, ArrayList altDataSource) {
        try {
            String email = jedis.get(emailOnOffStatus);
            if(OnOffStatus.ENABLE.getValue().equals(email)) {
                Properties props = new Properties();
                props.put("mail.transport.protocol", "smtp");
                props.put("mail.smtp.host", smtpServer); //例如：202.108.44.206 smtp.163.com
                props.put("mail.smtp.auth", "true"); //认证是否设置
                props.put("mail.host", smtpServer);
                //建立会话并且认证
                Authenticator auth1 = new Authenticator() {//封装用户名 密码
                    public PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, psw);
                    }
                };
                javax.mail.Session session = javax.mail.Session.getInstance(props, auth1);
                Message msg = new MimeMessage(session);
                //昵称                                                                       //
                String nick = javax.mail.internet.MimeUtility.encodeText("汇付宝");
                //发送源地址
                msg.setFrom(new InternetAddress(nick+" <"+fromMail+">"));
                //发送目的地址
                ArrayList<String> altMail = this.parseMailAddress(toMail);
                InternetAddress[] tos = new InternetAddress[altMail.size()];
                for (int j = 0; j < altMail.size(); j++) {
                    tos[j] = new InternetAddress(altMail.get(j).toString());
                }
                if (tos.length == 0) return false;
                msg.setRecipients(Message.RecipientType.TO, tos);
                //主题
                msg.setSubject(subject);
                //邮件体
                Multipart mp = new MimeMultipart();
                //邮件内容
                //把信件内容放入mp内，和附件一样的放发，作为一个整体发送。
                MimeBodyPart mbps = new MimeBodyPart();
                mbps.setContent(strContext, "text/html;charset=UTF-8");//正文内容
                //mbps.setText(strContext);//正文内容
                mp.addBodyPart(mbps);
                //设置附件
                if (altDataSource != null) {
                    int altDataSourceSize = altDataSource.size();//附件数组长度
                    for (int i = 0; i < altDataSourceSize; i++) {
                        MimeBodyPart mbp = new MimeBodyPart();
                        //得到附件本身并至入BodyPart
                        DataSource fds = (DataSource) altDataSource.get(i);
                        mbp.setDataHandler(new DataHandler(fds));
                        //得到文件名同样至入BodyPart
                        mbp.setFileName(fds.getName());
                        mp.addBodyPart(mbp);
                    }
                }
                //Multipart加入到信件
                msg.setContent(mp);
                msg.saveChanges();

                //发送
                Transport transport = session.getTransport("smtp");
                transport.connect(smtpServer, username, psw);
                transport.sendMessage(msg, msg.getAllRecipients());
                transport.close();
            }
            return true;
        } catch (Exception e) {
            logger.error("在给{}发邮件时出错{}",toMail,e);
            return false;
        }
    }

    private boolean mailSend(final String fromMail, final String pwd, String toMail, String subject, String strContext, ArrayList altDataSource) {
        try {
            String email = jedis.get(emailOnOffStatus);
            if(OnOffStatus.ENABLE.getValue().equals(email)){
                Properties props = new Properties();
                props.put("mail.transport.protocol", "smtp");
                props.put("mail.smtp.host", smtpServer); //例如：202.108.44.206 smtp.163.com
                props.put("mail.smtp.auth", "true"); //认证是否设置
                props.put("mail.host", smtpServer);
                //建立会话并且认证
                Authenticator auth1 = new Authenticator() {//封装用户名 密码
                    public PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(fromMail, pwd);
                    }
                };
                javax.mail.Session session = javax.mail.Session.getInstance(props, auth1);
                Message msg = new MimeMessage(session);
                //昵称
                String nick = javax.mail.internet.MimeUtility.encodeText("汇付宝");
                //发送源地址
                msg.setFrom(new InternetAddress(nick+" <"+fromMail+">"));
                //发送目的地址
                ArrayList<String> altMail = this.parseMailAddress(toMail);
                InternetAddress[] tos = new InternetAddress[altMail.size()];
                for (int j = 0; j < altMail.size(); j++) {
                    tos[j] = new InternetAddress(altMail.get(j).toString());
                }
                if (tos.length == 0) return false;
                msg.setRecipients(Message.RecipientType.TO, tos);
                //主题
                msg.setSubject(subject);
                //邮件体
                Multipart mp = new MimeMultipart();
                //邮件内容
                //把信件内容放入mp内，和附件一样的放发，作为一个整体发送。
                MimeBodyPart mbps = new MimeBodyPart();
                mbps.setContent(strContext, "text/html;charset=UTF-8");//正文内容
                mp.addBodyPart(mbps);
                //设置附件
                if (altDataSource != null) {
                    int altDataSourceSize = altDataSource.size();//附件数组长度
                    for (int i = 0; i < altDataSourceSize; i++) {
                        MimeBodyPart mbp = new MimeBodyPart();
                        //得到附件本身并至入BodyPart
                        DataSource fds = (DataSource) altDataSource.get(i);
                        mbp.setDataHandler(new DataHandler(fds));
                        //得到文件名同样至入BodyPart
                        mbp.setFileName(fds.getName());
                        mp.addBodyPart(mbp);
                    }
                }
                //Multipart加入到信件
                msg.setContent(mp);
                msg.saveChanges();

                //发送
                Transport transport = session.getTransport("smtp");
                transport.connect(smtpServer, fromMail, pwd);
                transport.sendMessage(msg, msg.getAllRecipients());
                transport.close();
            }
            return true;
        } catch (Exception e) {
            logger.error("在给{}发邮件时出错{}",toMail,e);
            return false;
        }
    }

    public boolean sendMail(String fromMail, String pwd, String toMail, String subject, String context, ArrayList altFds) {
        return this.mailSend(fromMail, pwd, toMail, subject, context, altFds);
    }

    /**
     * 将字符串转化为 ArrayList,该字符串用,分隔。 带有邮件地址的初步检验。
     *
     * @param mailAddress
     * @return
     */
    private ArrayList<String> parseMailAddress(String mailAddress) {
        ArrayList<String> altResult = new ArrayList<String>();
        String[] aryTemp = mailAddress.split(",");
        for (int i = 0; i < aryTemp.length; i++) {
            if (aryTemp[i].trim().equals("")) continue;
            if (aryTemp[i].indexOf("@") == -1) continue;
            altResult.add(aryTemp[i].trim());
        }
        return altResult;
    }


    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
    }

}//end class
