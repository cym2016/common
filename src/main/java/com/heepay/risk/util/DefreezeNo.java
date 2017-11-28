package com.heepay.risk.util;

import java.text.SimpleDateFormat;
import java.util.Date;



/***
 * 
* 
* 描    述：冻结单号 defreeze_no
*
* 创 建 者：wangl
* 创建时间：  Nov 21, 20163:52:01 PM
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
public class DefreezeNo {
	
	
	public static String getRandomString() { 
		Date date =new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		String Datestring = format.format(date);

	    return Datestring;   
	   
	 }  

}
