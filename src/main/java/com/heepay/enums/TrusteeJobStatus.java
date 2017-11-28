package com.heepay.enums;


/**
 * 托管定时任务状态
 * @author houjianchun
 *
 */
public enum TrusteeJobStatus {
	
	PRWAIT("PRWAIT","待处理"),
	FAILED("FAILED","处理失败"),
	SUCCESS("SUCCES","处理成功");
	
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
	TrusteeJobStatus(String value, String content) {  
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
	 * 取得缓存内容
	 * @return 缓存内容
	 */
	public String getContent() {
		return this._Content;
	}
}
