package com.heepay.enums.pcac;

/**
 * *
 * 
* 
* 描    述：法定代表人证件类型
*
* 创 建 者： wangjie
* 创建时间：  2017年3月6日下午4:19:35
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
public enum LegDocType {

	/**                                                
	 * 01:身份证  
	 */
	PCAC_SFZ("01", "身份证"),
	/**
	 * 02:军官证
	 */
	PCAC_JGZ("02", "军官证"),
	/**
	 * 03:护照
	 */
	PCAC_HZ("03", "护照"),
	/**
	 * 04:户口簿
	 */
	PCAC_HKB("04", "户口簿"),
	/**
	 * 05:士兵证
	 */
	PCAC_SBZ("05", "士兵证"),
	/**
	 * 06:港澳来往内地通行证
	 */
	PCAC_GATXZ("06", "港澳来往内地通行证"),
	/**
	 * 07:台湾同胞来往内地通行证
	 */
	PCAC_TWTXZ("07", "台湾同胞来往内地通行证"),
	/**
	 *08:临时身份证
	 */
	PCAC_LSSFZ("08", "临时身份证"),
	/**
	 * 09:外国人居留证
	 */
	PCAC_WGJZZ("09", "外国人居留证"),
	/**
	 * 10:警官证
	 */
	PCAC_JINGZ("10", "警官证"),
	/**
	 * 99:其他
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
	LegDocType(String value, String content) {
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

	public static LegDocType getBean(String value) {
		for (LegDocType e : LegDocType.values()) {
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
