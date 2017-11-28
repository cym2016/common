/**
 * 
 */
package com.heepay.enums.pcac;

/**
 * @author Administrator
 *
 */
public enum PcacProvince {

	HUNAN("430000", "湖南省"),

	HENAN("410000", "河南省"),

	JIANGSU("320000", "江苏省"),

	GUANGXI("450000", "广西壮族自治区"),

	YUNNAN("530000", "云南省"),

	XIZANG("540000", "西藏自治区"),

	BEIJING("110000", "北京市"),

	NINGXIA("640000", "宁夏回族自治区"),

	ZHEJIANG("330000", "浙江省"),

	FUJIAN("350000", "福建省"),

	SICHUAN("510000", "四川省"),

	XIANGGANG("810000", "香港特别行政区"),

	SHANXI("140000", "山西省"),

	SHANXI2("610000", "陕西省"),

	HEBEI("130000", "河北省"),

	ANHUI("340000", "安徽省"),

	SHANGHAI("310000", "上海市"),

	AOMEN("820000", "澳门特别行政区"),

	QINGHAI("630000", "青海省"),

	GUANGDONG("440000", "广东省"),

	LIAONING("210000", "辽宁省"),

	JAINGXI("360000", "江西省"),

	GANSU("620000", "甘肃省"),

	HUBEI("420000", "湖北省"),

	GUIZHOU("520000", "贵州省"),

	SHANDONG("370000", "山东省"),

	TAIWAN("710000", "台湾省"),

	NEIMENGGU("150000", "内蒙古自治区"),

	HAINAN("460000", "海南省"),

	XINJIANG("650000", "新疆维吾尔自治区"),

	TIANJIN("120000", "天津市"),

	HEILONGJIANG("230000", "黑龙江省"),

	CHONGQING("500000", "重庆市"),

	JILIN("220000", "吉林省");

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
	PcacProvince(String value, String content) {
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

	public static PcacProvince getBean(String value) {
		for (PcacProvince e : PcacProvince.values()) {
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
