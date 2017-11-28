package com.heepay.enums;


/**
 * AccountMark 记账标识
 * @author ZhangJunxin
 *
 */
public enum AccountCheckSide {
	/**
	 * 未知
	 */
	MERCHANT_DAYEND("A","商户日终"),
	CHANNEL_DAYEND("B", "通道日终");

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
	AccountCheckSide(String value, String content) {
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
