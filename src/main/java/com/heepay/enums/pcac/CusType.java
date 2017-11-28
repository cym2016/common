/**
 * 
 */
package com.heepay.enums.pcac;

/**
 * 描 述：商户类型
 * 创 建 者： 李震 
 * 创建时间： 2017-03-16
 * 修 改 者： 
 * 修改时间：
 * 修改描述：
 * 
 * 审 核 者：
 * 审核时间： 
 * 审核描述：
 */
public enum CusType {
	

	HUMAN("01", "自然人"),
	MERCHANT("02", "企业商户"),
	OWNED_MERCHANT("03", "个体工商户");

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
	CusType(String value, String content) {
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

	public static CusType getBean(String value) {
		for (CusType e : CusType.values()) {
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
