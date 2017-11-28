package com.heepay.enums.pbc;

/**
 * 
 *
 * 描    述：证件类型
 *
 * 创 建 者：   wangdong
 * 创建时间：2016年12月26日 下午7:38:36
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
public enum PbcCertificateType {

	/**
	 * 支付账号
	 */
	CERTIFICATE_TYPE_1("01","身份证"),
	CERTIFICATE_TYPE_2("02","驾驶证"),
	CERTIFICATE_TYPE_3("03","护照"),
	CERTIFICATE_TYPE_4("04","军官证"),
	CERTIFICATE_TYPE_5("05","士兵证"),
	CERTIFICATE_TYPE_6("06","户口本"),
	CERTIFICATE_TYPE_7("07","港澳居民往来内地通行证"),
	CERTIFICATE_TYPE_8("08","警官证"),
	CERTIFICATE_TYPE_9("09","社会保障号"),
	CERTIFICATE_TYPE_10("10","台湾通报来往内地通行证"),
	CERTIFICATE_TYPE_11("11","临时身份证"),
	CERTIFICATE_TYPE_12("12","外国人居住证"),
	CERTIFICATE_TYPE_13("13","组织机构代码(对公)"),
	CERTIFICATE_TYPE_14("14","统一社会信用代码(对公)"),
	CERTIFICATE_TYPE_15("15","营业执照号(对公)"),
	CERTIFICATE_TYPE_16("16","(原)工商注册号"),
	CERTIFICATE_TYPE_99("99","其他");
	
	String _value; 

	
	/**
	 * 存放内容
	 */
	String _content;

	
	/**
	 * 私有构造函数
	 * @param value 枚举值
	 * @param content 缓存内容
	 * @return 
	 */
	PbcCertificateType(String value, String content) {  
		this._value = value;  
		this._content = content;  
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
		return this._content;
	}


	/**
	 * 根据值取得内容
	 * 
	 * @return 内容
	 */

	public static PbcCertificateType getBean(String value) {
		for (PbcCertificateType e : PbcCertificateType.values()) {
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
