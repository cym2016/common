package com.heepay.billingutils;

import java.text.SimpleDateFormat;
import java.util.Date;

/***
 * 
 * 
 * 描    述：生成清对账单 号生成规则（0：通道；1：商户；2：个人用户）
 *
 * 创 建 者： wangl
 * 创建时间：  2016年9月9日下午2:25:41
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

public class ClarBatch {
	
	//19 20160729 023658 1（19 代表结算批次单据类型，中间八位代表结算日期，中间 6 位系统系统随机生成，最后一位代表商户结算）
	//19 20160914 091481 1
	public static String getRandomString(int num) { 
		
		Date date =new Date();
		
		SimpleDateFormat format=new SimpleDateFormat("yyyyMMHH");
		String Datestring = format.format(date);
   
	    return "DZ"+Datestring+ClearIdGenerate.getSettleBatchId()+num;   
	   
	 }  

}
