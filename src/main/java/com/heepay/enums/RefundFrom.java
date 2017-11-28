package com.heepay.enums;

public enum RefundFrom {
	/**
	 * 未知
	 */
	INTERFACE("ITFACE", "接口申请"),
	MERCHANT("MERCHT", "商家申请"),
	MANAGE("MANAGE", "管理平台申请"),
	BILLING("BILLIN", "清结算申请");
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
	RefundFrom(String value, String content) {  
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
