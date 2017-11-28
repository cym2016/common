package com.heepay.enums;

public enum RequestFrom {
	/**
	 * 未知
	 */
  WEB("WEB","WEB接入"),
	API("API","API接口接入"),
	SDK("SDK","SDK接入"),
	BILLINGCLEAR("BLC","清结算接入"),
	APP("APP","APP接入"),
	HTML5("HM5","H5接入");

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
	RequestFrom(String value, String content) {  
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
