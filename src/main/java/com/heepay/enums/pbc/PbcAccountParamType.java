package com.heepay.enums.pbc;

/**
 * 
 *
 * 描    述：关联全支付账号查询-明细查询传入参数的类型
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
public enum PbcAccountParamType {

	/**
	 * 证件号
	 */
	ACCOUNT_PARAM_TYPE_2("02","证件号"),
	/**
	 * 手机号
	 */
	ACCOUNT_PARAM_TYPE_3("03","手机号"),
	/**
	 * 银行卡号
	 */
	ACCOUNT_PARAM_TYPE_4("04","银行卡号"),
	/**
	 * 登录帐号
	 */
	ACCOUNT_PARAM_TYPE_5("05","登录帐号"),
	/**
	 * 商户号
	 */
	ACCOUNT_PARAM_TYPE_6("06","商户号");
	
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
	PbcAccountParamType(String value, String content) {  
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

	public static PbcAccountParamType getBean(String value) {
		for (PbcAccountParamType e : PbcAccountParamType.values()) {
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
