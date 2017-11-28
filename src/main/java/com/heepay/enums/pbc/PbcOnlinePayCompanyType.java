package com.heepay.enums.pbc;

/**
 * 
 *
 * 描    述：按交易流水号查询银行卡/支付帐号-支付机构类型
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
public enum PbcOnlinePayCompanyType {

	/**
	 * 有支付帐号网络支付体系
	 */
	ONLINE_PAY_COMPANY_TYPE_1("01","有支付帐号网络支付体系"),
	/**
	 * 无支付帐号网络支付体系
	 */
	ONLINE_PAY_COMPANY_TYPE_2("02","无支付帐号网络支付体系"),
	/**
	 * POS收单体系
	 */
	ONLINE_PAY_COMPANY_TYPE_3("03","POS收单体系");
	
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
	PbcOnlinePayCompanyType(String value, String content) {  
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

	public static PbcOnlinePayCompanyType getBean(String value) {
		for (PbcOnlinePayCompanyType e : PbcOnlinePayCompanyType.values()) {
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
