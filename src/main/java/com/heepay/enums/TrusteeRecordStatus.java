package com.heepay.enums;


/**
 * Trans交易单状态值
 * @author houjianchun
 *
 */
public enum TrusteeRecordStatus {
	
	PREPAY("PREPAY","待支付"),
	PAYING("PAYING","支付完成-待放款"),
	FAILED("FAILED","支付失败"),
	SUCCESS("SUCCES","处理成功-已放款");
	
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
	TrusteeRecordStatus(String value, String content) {  
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
