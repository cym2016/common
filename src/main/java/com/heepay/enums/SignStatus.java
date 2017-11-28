package com.heepay.enums;


/**
 * Trans交易类型
 * @author houjianchun
 *
 */
public enum SignStatus {
	/**
	 * 未知
	 */
	INIT("INIT","初始状态"),
	SUCCESS("SUCCES","签约成功"),
	FAILED("FAILED","签约失败");

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
	SignStatus(String value, String content) {  
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
}
