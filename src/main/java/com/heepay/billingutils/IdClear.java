package com.heepay.billingutils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/***
 * 
 * 
 * 描    述：清算流水号的生成规则（0：通道；1：商户；2：个人用户）
 *
 * 创 建 者： wangl
 * 创建时间：  2016年9月9日下午2:03:30
 * 创建描述：
 * 
 * 修 改 者：  wangl
 * 修改时间： Nov 16, 20162:49:39 PM 
 * 修改描述： 代表清算日期没有当前天数
 * 
 * 审 核 者：
 * 审核时间：
 * 审核描述：
 *
 */

public class IdClear {

	//length表示生成字符串的长度
	//18 20160729 023658963 1（18 代表清算单据类型，所有清算单据都是 18 开头；20160729 代表清算日期，023658963 系统系统随机生成，最后一位代表商户清算）
	//18 20160914 204590035 1
	public static String getRandomString(int num) { 
		
		Date date =new Date();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		String Datestring = format.format(date);
		
		// 清算流水号由18开头改为79开头 2016-11-7
		return 79 + Datestring + ClearIdGenerate.getClearId() + num;

	}
	
}
