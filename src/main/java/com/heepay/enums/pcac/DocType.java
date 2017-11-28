package com.heepay.enums.pcac;

/**
 * *
 * 
 * 
 * 描 述：法人证件类型
 *
 * 创 建 者： wangjie 创建时间： 2017年3月6日下午4:12:58 创建描述：
 * 
 * 修 改 者： 修改时间： 修改描述：
 * 
 * 审 核 者： 审核时间： 审核描述：
 *
 */
public enum DocType {

	/**
	 * 01:营业执照编码
	 */
	PCAC_YYZZ("01", "营业执照编码"),
	/**
	 * 02:统一社会信息代码
	 */
	PCAC_TYSHXXDM("02", "统一社会信息代码"),
	/**
	 * 03:组织机构代码证\r\n
	 */
	PCAC_ZZJGDMZ("03", "组织机构代码证"),
	/**
	 * 04:经营许可证\r\n
	 */
	PCAC_JYXKZ("04", "经营许可证"),
	/**
	 * 05：税务登记证\r\n
	 */
	PCAC_SWDJZ("05", "税务登记证"),
	/**
	 * 99:其他\r\n
	 */
	PCAC_QT("99", "其他");

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
	DocType(String value, String content) {
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

	public static DocType getBean(String value) {
		for (DocType e : DocType.values()) {
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
