package com.heepay.enums.pbc;

/**
 * 
 *
 * 描    述：支付类型
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
public enum PbcPaymentType {

	/**
	 * 网关交易
	 */
	PAYMENT_TYPE_1("1","网关交易"),
	/**
	 * 快捷交易
	 */
	PAYMENT_TYPE_2("2","快捷交易"),
	/**
	 * POS收单
	 */
	PAYMENT_TYPE_3("3","POS收单"),
	/**
	 * 支付机构内其他交易
	 */
	PAYMENT_TYPE_4("4","支付机构内其他交易");
	
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
	PbcPaymentType(String value, String content) {  
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

	public static PbcPaymentType getBean(String value) {
		for (PbcPaymentType e : PbcPaymentType.values()) {
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
