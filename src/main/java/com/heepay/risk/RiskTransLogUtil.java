package com.heepay.risk;
import java.util.Calendar;
import java.util.Date;

/**
 * 描    述：类说明 交易信息接口定义说明
 *
 * 创 建 者：王英雷  E-mail:wangyl@9186.com
 * 创建时间：创建时间：2016年11月28日 下午5:54:51
 * 创建描述：获取交易系统日志文件
 * 
 * 修 改 者：   王英雷
 * 修改时间：2016年12月22日 
 * 修改描述： 为反欺诈功能增加字段
 * 
 * 审 核 者：
 * 审核时间：
 * 审核描述：
 *
 */


import org.apache.logging.log4j.Logger;

import com.heepay.common.util.DateUtil;
public class RiskTransLogUtil {
  
  
	public static void logTrans4Risk(Logger log,RiskTransLogVo riskTransLogVo){
	  
	  if(log==null||riskTransLogVo==null){
	    log.info("风控日志记录异常:{},{}",log,riskTransLogVo);
      return;
    }
	  log.info("{}风控日志记录开始",riskTransLogVo.getTrans_no().trim());
		StringBuffer sb = new StringBuffer();
		//以下顺序不能调换，因为是按正则表达式进行解析
		sb.append("risk_message:");
		sb.append("{trans_no:");    //必添
		sb.append(riskTransLogVo.getTrans_no().trim());
		sb.append(",pay_time:"); //必添
		sb.append(riskTransLogVo.getPay_time());
		sb.append(",pay_amount:");//必添
		sb.append(riskTransLogVo.getPay_amount());
		sb.append(",trans_type:");//必添
		sb.append(riskTransLogVo.getTrans_type().trim());
		sb.append(",merchant_id:");//必添
		sb.append(riskTransLogVo.getMerchant_id());
		sb.append(",merchant_login_name:");//必添
		sb.append(riskTransLogVo.getMerchant_login_name().trim());
		sb.append(",pay_status:");//必添
		sb.append(riskTransLogVo.getPay_status().trim());
		sb.append(",product_code:");//必添
		sb.append(riskTransLogVo.getProduct_code().trim());
		sb.append(",bankcard_type:");//必添
		sb.append(riskTransLogVo.getBankcard_type().trim());
		sb.append(",bankcard_no:");//必添
		sb.append(riskTransLogVo.getBankcard_no().trim());
		sb.append(",channel_code:");//必添
		sb.append(riskTransLogVo.getChannel_code().trim());
		sb.append(",merchant_order_no:");//必添
		sb.append(riskTransLogVo.getMerchant_order_no().trim());
		sb.append(",bankcard_owner_type:");//必添
		sb.append(riskTransLogVo.getBankcard_owner_type());
		sb.append(",pay_time1:"); 
		sb.append(longDate2String(riskTransLogVo.getPay_time()));
		sb.append(",fee_type:"); //必添
		sb.append(riskTransLogVo.getFee_type());
		sb.append(",fee_amount:"); //必添
		sb.append(riskTransLogVo.getFee_amount());
		
		sb.append(",bank_name:"); //必添
		sb.append(riskTransLogVo.getBank_name());
		sb.append(",trans_id:"); //必添
		sb.append(riskTransLogVo.getTrans_id());
		sb.append(",payment_id:"); //必添
		sb.append(riskTransLogVo.getPayment_id());
		sb.append(",bank_order_id:"); //必添
		sb.append(riskTransLogVo.getBank_order_id());
		sb.append(",transaction_IP:"); //必添
		sb.append(riskTransLogVo.getTransaction_IP());
		sb.append(",transInBank_ID:"); //必添
		sb.append(riskTransLogVo.getTransInBank_ID());
		
		sb.append("}");
		log.info(sb.toString());
	}
	public static String longDate2String(long date)
	{
		Calendar c = Calendar.getInstance();
		c.setTimeInMillis(date);
		Date datetime = c.getTime();
		return DateUtil.dateToString(datetime,"yyyyMMddHHmmss");
		
	}

}
