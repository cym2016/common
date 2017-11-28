package com.heepay.enums;


/**
 * BankcardAuth状态
 * @author zc
 *
 */
public enum BankcardAuthStatus {

	PRESIGN("PRESGN","未签约"),
	REJECT("REJECT","审核拒绝"),
	SIGNING("SGNING","处理中"),
	FAILED("FAILED","签约失败"),
	SUCCES("SUCCES","签约成功"),
	DELETE("DELETE","逻辑删除");

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
	BankcardAuthStatus(String value, String content) {  
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
