package com.heepay.enums.pcac;

/**
 * *
 * 
* 
* 描    述：风险信息等级
*
* 创 建 者： wangjie
* 创建时间：  2017年3月6日下午4:29:02
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
public enum RiskLevel {
	
	/**
	 * 01:一级
	 */
	PCAC_YJ("01", "一级"),
	/**
	 * 02：二级
	 */
	PCAC_EJ("02", "二级"),
	/**
	 * 03：三级
	 */
	PCAC_SJ("03", "三级");
	

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
	RiskLevel(String value, String content) {
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

	public static RiskLevel getBean(String value) {
		for (RiskLevel e : RiskLevel.values()) {
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
