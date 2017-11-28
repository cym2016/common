package com.heepay.enums;


/**
 * AccountStatus 账号状态值
 * @author houjianchun
 *
 */
public enum AccountStatus {
	/**
	 * 未知
	 */
	NORMAL("NORMAL","正常"),
	FREEZED("FREZED","冻结"),	
	CLOSED("CLOSED","关闭"),	
	UNKNOWNED("UNKNOW","未知");

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
	AccountStatus(String value, String content) {  
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
	 * 根据值取得内容
	 * @return 内容
	 */

	public static AccountStatus getBean(String value) {
		for (AccountStatus e : AccountStatus.values()) {
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
