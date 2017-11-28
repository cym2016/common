package com.heepay.billingutils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/***
 * 
* 
* 描    述：用正则表达式 判断是不是数字
*
* 创 建 者： wangl
* 创建时间：  Nov 15, 20161:10:09 PM
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

public class IsNumeric {
	public static boolean isNumeric(String str){ 
		   Pattern pattern = Pattern.compile("[0-9]*"); 
		   Matcher isNum = pattern.matcher(str);
		   if( !isNum.matches() ){
		       return false; 
		   } 
		   return true; 
		}
}
