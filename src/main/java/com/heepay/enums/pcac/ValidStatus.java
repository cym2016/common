package com.heepay.enums.pcac;

/**
 * *
 * 
* 
* 描    述：有效性
*
* 创 建 者： wangjie
* 创建时间：  2017年3月6日下午4:34:59
* 创建描述：
* 
* 修 改 者：  
* 修改时间： 
* 修改描述： 
* 
* 审 核 者：
* 审核时间：
* 审核描述：
*
 */
public enum ValidStatus {

	
	/**
	 * 01:有效
	 */
	PCAC_YX("01", "有效"),
	/**
	 * 02：失效
	 */
	PCAC_SX("02", "失效");
	
	

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
	ValidStatus(String value, String content) {
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

	public static ValidStatus getBean(String value) {
		for (ValidStatus e : ValidStatus.values()) {
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
