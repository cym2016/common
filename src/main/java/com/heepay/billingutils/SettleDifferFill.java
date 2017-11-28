package com.heepay.billingutils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 
 * 
 * 描    述：补账时的差错批次号：位数是17位。差错批次单据号规则：账务类型（补账标记为10，撤账标记为11）+当前通知时日期八位+6位随机码+账务处理对象（0：通道；1：商户；2：个人用户，3：通道和用户）
 *
 * 创 建 者：chenyanming
 * 创建时间： 2016年11月2日下午5:43:19 
 * 创建描述：
 * 
 * 修 改 者：  
 * 修改时间：
 * 修改描述： 
 * 
 * 审 核 者：
 * 审核时间：
 * 审核描述：
 *
 */
public class SettleDifferFill {
	
	public static String getRandomString(int num) { 
		
		Date date =new Date();
		
		SimpleDateFormat format=new SimpleDateFormat("yyyyMMdd");
		String Datestring = format.format(date);
		
		
	    String base = "0123456789";   
	    Random random = new Random();   
	    StringBuffer sb = new StringBuffer();   
	    for (int i = 0; i < 6; i++) {   
	        int number = random.nextInt(base.length());   
	        sb.append(base.charAt(number));   
	    }   
	    return 10+Datestring+sb.toString()+num;   
	   
	 } 
}
