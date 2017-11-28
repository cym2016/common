package com.heepay.common.util;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.heepay.codec.Md5;

/***
 * 
 * 
* 
* 描    述：
*
* 创 建 者： 杨春龙  
* 创建时间： 2016年12月15日 下午3:35:50 
* 创建描述：快捷支付返回商户统一签名
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
public class QuickPayMD5Sign {

	public static  String  getSign(Map<String,String> map){
	    StringBuilder sb = new StringBuilder(256);
	    sb.append("successAmount=").append(map.get("successAmount"));
	    sb.append("&payAmount=").append(map.get("payAmount"));
	    sb.append("&transNo=").append(map.get("transNo"));
	    sb.append("&result=").append(map.get("result"));
	    sb.append("&merchantId=").append(map.get("merchantId"));
	    sb.append("&merchantOrderNo=").append(map.get("merchantOrderNo"));
	    sb.append("&version=").append(map.get("version"));
	    sb.append("&key=").append(map.get("key"));
	    System.out.println(sb.toString());
	    String sign = Md5.encode(sb.toString());
	    return sign;
	}
}
