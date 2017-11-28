package com.heepay.enums;

import java.util.LinkedHashMap;
import java.util.Map;

public enum TrialBalanceCategory {
  
	  LESSZORE("LSZORE","余额,变化金额小于零"),
	  TERROR("TERROR","两笔账对比结果不对");

	String _value;
	
	/**
	 * 存放内容
	 */
	String _Content;
	
	/**
	 * 私有构造函数
	 * @param value 枚举值
	 * @param content 缓存内容
	 * @return 
	 */
	TrialBalanceCategory(String value, String content) {  
		this._value = value;  
		this._Content = content;  
	}  
	
	/**
	 * 取得枚举对象值
	 * @return 枚举对象值
	 */
	public String getValue() {
		return this._value;
	}
	
	/**
	 * 取得内容
	 * @return 内容
	 */
	public String getContent() {
		return this._Content;
	}

	/**
	 * 
	 * @description 根据value获取content,用于页面显示
	 * @author TianYanqing      
	 * @created 2016年9月23日 下午12:02:11     
	 * @param value
	 * @return
	 */
	public static String getContentByValue(String value){
		TransType[] types = TransType.values();
		String content="";
		for(TransType type:types){
			if(type.getValue().equals(value)){
				content=type.getContent();
				break;
			}
		}
		return content;
	}

	/**
	 * 查看是否包含参数值
	 * @param value
	 * @return
	 */
	public static Map<String,String> transTypeMap(){
		Map<String,String> map = new LinkedHashMap<String,String>();
		for(TrialBalanceCategory trialBalanceCategory : TrialBalanceCategory.values()){
			map.put(trialBalanceCategory.getValue(),trialBalanceCategory.getContent());
		}
		return map;
	}
	
	/**
	 * 根据值取得内容
	 * 
	 * @return 内容
	 */
	public static TrialBalanceCategory getBean(String value) {
		for (TrialBalanceCategory e : TrialBalanceCategory.values()) {
			if (value.equals(e.getValue())) {
				return e;
			}
		}
		return null;
	}

	public static String labelOf(String val) {
		if (getBean(val) != null) {
			return getBean(val).getContent();
		}
		return null;
	}
}
