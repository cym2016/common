package com.heepay.risk;

import org.apache.logging.log4j.Logger;

import com.heepay.common.util.DateUtil;
import com.heepay.common.util.JsonMapperUtil;
import com.heepay.common.util.StringUtil;

/**
 * 
 * 
 * 描 述：描述
 *
 * 创 建 者：dongzhengjiang
 * 创建时间： 2017年5月24日 上午11:32:26
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
public class RiskChannelLogUtil {
	public static void logChannelRisk(Logger log,RiskChannelLogVo riskChannelLogVo){
		  
		  if(log==null||riskChannelLogVo==null){
		    log.info("风控日志记录异常:{},{}",log,riskChannelLogVo);
	      return;
	    }
			StringBuffer sb = new StringBuffer();
			//以下顺序不能调换，因为是按正则表达式进行解析
			sb.append("risk_message:");
			sb.append("{payment_id:");    //必添
			sb.append(riskChannelLogVo.getPaymentId());
			sb.append(",channel_code:"); //必添
			sb.append(riskChannelLogVo.getChannelCode());
			sb.append(",channel_partner_code:");//必添
			sb.append(riskChannelLogVo.getChannelPartnerCode());
			sb.append(",channel_partner_name:");//必添
			sb.append(riskChannelLogVo.getChannelPartnerName());
			sb.append(",channel_type_code:");//必添
			sb.append(riskChannelLogVo.getChannelTypeCode());
			sb.append(",channel_type_name:");//必添
			sb.append(riskChannelLogVo.getChannelTypeName());
			sb.append(",card_type_code:");//必添
			sb.append(riskChannelLogVo.getCardTypeCode());
			sb.append(",card_type_name:");//必添
			sb.append(riskChannelLogVo.getCardTypeName());
			sb.append(",bank_no:");//必添
			sb.append(riskChannelLogVo.getBankNo());
			sb.append(",bank_name:");//必添
			sb.append(riskChannelLogVo.getBankName());
			sb.append(",account_type:");//必添
			sb.append(riskChannelLogVo.getAccountType());
			sb.append(",business_type:");//必添
			sb.append(riskChannelLogVo.getBusinessType());
			sb.append(",amount:");//必添
			sb.append(riskChannelLogVo.getAmount());
			sb.append(",day_limit_amount:");//必添
		    if(!StringUtil.isBlank(riskChannelLogVo.getDaylimitAmount()))
			sb.append(riskChannelLogVo.getDaylimitAmount());
		    else
		    	sb.append("0");
			sb.append(",month_limit_amount:");//必添
		    if(!StringUtil.isBlank(riskChannelLogVo.getMonlimitAmount()))
			sb.append(riskChannelLogVo.getMonlimitAmount());
		    else
				sb.append("0");
			sb.append(",req_time:"); 
			sb.append(String.valueOf(DateUtil.stringToDate(riskChannelLogVo.getReqTime(),"yyyyMMddHHmmssSSS").getTime()));
			sb.append(",resp_time:"); //必添
			sb.append(String.valueOf(DateUtil.stringToDate(riskChannelLogVo.getRespTime(),"yyyyMMddHHmmssSSS").getTime()));
			sb.append(",request_status:"); 
			if (!StringUtil.isBlank(riskChannelLogVo.getRequestStatus()))
			sb.append(riskChannelLogVo.getRequestStatus());
			else
			sb.append("null");
			sb.append(",result:"); 			
			if (!StringUtil.isBlank(riskChannelLogVo.getResult()))
				sb.append(riskChannelLogVo.getResult());
			else
				sb.append("null");
			sb.append(",url:");	
			if (!StringUtil.isBlank(riskChannelLogVo.getUrl()))
				sb.append(riskChannelLogVo.getUrl());
			else
				sb.append("null");			
			sb.append("}");
			log.info(sb.toString());
		}

}

 