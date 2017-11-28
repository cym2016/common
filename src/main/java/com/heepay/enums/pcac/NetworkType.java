/**
 * 
 */
package com.heepay.enums.pcac;

/**
 * @author Administrator
 *
 */
public enum NetworkType {
	UNION_PAY("01", "中国银联"),
	NETPAY_PLAT("02", "网络支付清算平台"),
	CLEAR_CENTER("03","清算总中心"),
	VILLAGE_BANK("04","农信银"),
	CITY_BANK("05","城商行"),
	SAME_CITY_CLEAR_CENTER("06","同城结算中心"),
	OTHER("99","其他");

	String _value;

	/**
	 * 存放内容
	 */
	String _content;

	/**
	 * 私有构造函数
	 * 
	 * @param value
	 *            枚举值
	 * @param content
	 *            缓存内容
	 * @return
	 */
	NetworkType(String value, String content) {
		this._value = value;
		this._content = content;
	}

	/**
	 * 取得枚举对象值
	 * 
	 * @return 枚举对象值
	 */
	public String getValue() {
		return this._value;
	}

	/**
	 * 取得内容
	 * 
	 * @return 内容
	 */
	public String getContent() {
		return this._content;
	}

	/**
	 * 根据值取得内容
	 * 
	 * @return 内容
	 */

	public static NetworkType getBean(String value) {
		for (NetworkType e : NetworkType.values()) {
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
