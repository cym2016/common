package com.heepay.billingutils;

import java.text.SimpleDateFormat;
import java.util.Date;

/***
 * 
 * 
 * 描    述：结算批次号生成规则（0：通道；1：商户；2：个人用户）
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

public class IdBatch {
	
	//19 20160729 023658 1（19 代表结算批次单据类型，中间八位代表结算日期，中间 6 位系统系统随机生成，最后一位代表商户结算）
	//19 20160914 091481 1
	/**
	 * 
	 * @方法说明：19 代表结算批次单据类型，中间八位代表结算日期，中间 6 位系统系统随机生成，最后一位代表商户结算
	 * @author xuangang
	 * @param num
	 * @return
	 * @时间：2016年12月9日下午1:27:03
	 */
	public static String getRandomString(int num) { 
		
		Date date =new Date();
		
		SimpleDateFormat format=new SimpleDateFormat("yyyyMMdd");
		String Datestring = format.format(date);		
  
	    return 19+Datestring + ClearIdGenerate.getSettleBatchId() + num;   
	   
	 }  
	
	//GZ 20160729 023658 1（GZ 代表结算批次单据类型，中间八位代表结算日期，中间 6 位系统系统随机生成，最后一位代表商户结算）
	//GZ 20160914 091481 1
	/**
	 * 
	 * @方法说明：
	 * @author xuangang
	 * @param num
	 * @return
	 * @时间：2016年12月9日下午1:26:54
	 */
    public static String getSettleBathString(int num) { 
		
		Date date =new Date();
		
		SimpleDateFormat format=new SimpleDateFormat("yyyyMMdd");
		String Datestring = format.format(date);		

	    return "GZ"+Datestring + ClearIdGenerate.getSettleBatchId() + num;   
	   
	 }  	

}
