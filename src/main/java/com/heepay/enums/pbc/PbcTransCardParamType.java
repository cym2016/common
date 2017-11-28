package com.heepay.enums.pbc;

/**
 * 
 *
 * 描    述：按交易流水号查询银行卡/支付帐号-查询传入参数的类型
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
public enum PbcTransCardParamType {

	/**
	 * 按外部银行流水号止付
	 */
	TRANS_CARD_PARAM_TYPE_A1("A1","按外部银行流水号止付"),
	/**
	 * 支付机构订单号
	 */
	TRANS_CARD_PARAM_TYPE_A2("A2","支付机构订单号"),
	/**
	 * 收单POS刷卡流水号
	 */
	TRANS_CARD_PARAM_TYPE_A3("A3","收单POS刷卡流水号");
	
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
	PbcTransCardParamType(String value, String content) {  
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

	public static PbcTransCardParamType getBean(String value) {
		for (PbcTransCardParamType e : PbcTransCardParamType.values()) {
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
