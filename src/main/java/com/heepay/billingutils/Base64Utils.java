package com.heepay.billingutils;

import java.io.UnsupportedEncodingException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.commons.codec.binary.Base64;



/***
 * 
* 
* 描    述：
*
* 创 建 者： wangl
* 创建时间：  2017年1月18日上午10:26:15
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

/***
 * 
* 
* 描    述：对给定的字符串进行base64解码操作
*
* 创 建 者： wangl
* 创建时间：  2017年1月18日上午10:26:15
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
public class Base64Utils {
	
	private static final Logger logger = LogManager.getLogger();

    /**
     * 对给定的字符串进行base64解码操作
     */
    public static String decodeData(String inputData) {
        try {
        	  String string = new String(Base64.decodeBase64(inputData.getBytes("utf-8")), "utf-8");
        	  return string;
        } catch (UnsupportedEncodingException e) {
            logger.error("base64解码操作解码异常", e);
        }

        return null;
    }

    /**
     * 对给定的字符串进行base64加密操作
     */
    public static String encodeData(String inputData) {
        try {
        	String string = new String(Base64.encodeBase64(inputData.getBytes("utf-8")), "utf-8");
        	return string;
        } catch (UnsupportedEncodingException e) {
            logger.error("base64解码操作加密异常", e);
        }
        return null;
    }

}
