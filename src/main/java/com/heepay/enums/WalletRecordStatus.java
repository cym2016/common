package com.heepay.enums;


/**
 * Trans充值交易单状态值
 * @author zc
 *
 */
public enum WalletRecordStatus {
	
	
	PAYING("PAYING","处理中"),
	FAILED("FAILED","支付失败"),
	TIMEOUT("TIMOUT","支付超时"),
	SUCCESS("SUCCES","支付成功"),
	ORDCLS("ORDCLS","订单关闭");
	
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
	WalletRecordStatus(String value, String content) {  
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

	/**
	 * 根据值取得内容
	 *
	 * @return 内容
	 */
	public static WalletRecordStatus getBean(String value) {
		for (WalletRecordStatus e : WalletRecordStatus.values()) {
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
