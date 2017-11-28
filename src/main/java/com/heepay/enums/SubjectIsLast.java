package com.heepay.enums;


/**
 * SubjectIsLast是否是最底层科目
 * @author wangyahong
 *
 */
public enum SubjectIsLast {
	/**
	 * 未知
	 */
  YES("Y","是"),
  NO("N","否");

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
	SubjectIsLast(String value, String content) {  
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

	public static SubjectIsLast getBean(String value) {
		for (SubjectIsLast e : SubjectIsLast.values()) {
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
