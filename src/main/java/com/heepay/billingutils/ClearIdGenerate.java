/***
 * 
* 
* 描    述：
*
* 创 建 者： xuangang
* 创建时间：  2016年12月9日上午11:26:12
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
package com.heepay.billingutils;

import java.text.NumberFormat;

import org.apache.commons.lang3.StringUtils;

import com.heepay.enums.ClearSequenceEnums;
import com.heepay.redis.JedisClusterUtil;

import redis.clients.jedis.JedisCluster;

/***
 * 
 * 
 * 描    述：
 *
 * 创 建 者： xuangang
 * 创建时间：  2016年12月9日上午11:26:12
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
public class ClearIdGenerate {
	
	private static JedisCluster jc = JedisClusterUtil.getJedisCluster();
	
	static{
		jc.setnx(ClearSequenceEnums.CLEARSEQUENCE.getValue(),"1");
		jc.setnx(ClearSequenceEnums.BATCHSEQUENCE.getValue(),"1");
		//若redius不存在该key，则需要重新设置key，初始值为1
	}
	/**
	 * 
	 * @方法说明：获取redius id，每次增1, 长度为9位
	 * @author xuangang
	 * @return
	 * @时间：2016年12月9日上午10:13:12
	 */
	public static String getClearId(){
		
			//若redius不存在该key，则需要重新设置key，初始值为1
			if(StringUtils.isBlank(jc.get(ClearSequenceEnums.CLEARSEQUENCE.getValue()))){
				jc.set(ClearSequenceEnums.CLEARSEQUENCE.getValue(),"1");
			}
			
			long id = jc.incr(ClearSequenceEnums.CLEARSEQUENCE.getValue());		
			
			NumberFormat formatter = NumberFormat.getNumberInstance();
			formatter.setMinimumIntegerDigits(9);
			formatter.setGroupingUsed(false);
			String s = formatter.format(id);
			//为避免长度大于9位，截取字符串的后9位
			if(s.length() > 9){
				return s.substring(s.length() - 9, s.length());
			}
			return s;
	}
	
	/**
	 * 
	 * @方法说明：通过redius获取结算批次id的中间6位
	 * @author xuangang
	 * @return
	 * @时间：2016年12月9日上午11:30:20
	 */
	public static String getSettleBatchId(){		
		
		//若redius不存在该key，则需要重新设置key，初始值为1
		if(StringUtils.isBlank(jc.get(ClearSequenceEnums.BATCHSEQUENCE.getValue()))){
			jc.set(ClearSequenceEnums.BATCHSEQUENCE.getValue(),"1");
		}
		long id = jc.incr(ClearSequenceEnums.BATCHSEQUENCE.getValue());		
		
		NumberFormat formatter = NumberFormat.getNumberInstance();
		formatter.setMinimumIntegerDigits(6);
		formatter.setGroupingUsed(false);
		String s = formatter.format(id);
		//为避免长度大于9位，截取字符串的后9位
		if(s.length() > 6){
			return s.substring(s.length() - 6, s.length());
		}
		return s;
	}
	/**
	 * 
	 * @方法说明：
	 * @author xuangang
	 * @param key
	 * @时间：2016年12月8日下午5:34:17
	 */
	public static void removeRediusKey(String key){
		jc.del(key);
	}
	/**
	 * 
	 * @方法说明：
	 * @author xuangang
	 * @param key
	 * @param value
	 * @时间：2016年12月8日下午5:42:04
	 */
	public static void setRediusKeyValue(String key, String value){
		
		if(StringUtils.isBlank(jc.get(key))){
			jc.set(key,value);
		}else{
			removeRediusKey(key);
			jc.set(key,value);
		}
	}
	
	/**
	 * 
	 * @方法说明：清算流水号的生成规则（0：通道；1：商户；2：个人用户）
	 * @author xuangang
	 * @param num
	 * @return
	 * @时间：2016年12月8日下午5:46:51
	 */
//	public static String getClearSequence(int num) { 
//	
//		Date date = new Date();	
//	
//		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
//		String Datestring = format.format(date);
//
//		// 清算流水号由18开头改为79开头 2016-11-7
//		return 79 + Datestring + getClearId() + num;
//
//	}
}
