package com.heepay.enums;


/**
 * Trans交易单状态值
 * @author houjianchun
 *
 */
public enum PaymentRecordStatus {
	
	PREPAY("PREPAY","待支付"),
	PAYING("PAYING","处理中"),
	FAILED("FAILED","支付失败"),
	TIMEOUT("TIMOUT","支付超时"),
	SUCCESS("SUCCES","支付成功"),
	ORDCLS("ORDCLS","订单关闭"),
	//payment表新增审核拒绝状态，供统计使用
	AUTREJ("AUTREJ","审核拒绝");
	
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
	PaymentRecordStatus(String value, String content) {  
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
