package com.heepay.enums.pbc;

/**
 * 
 *
 * 描    述：交易类型
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
public enum PbcTransType {

	/**
	 * 支付账户充值
	 */
	TRANS_TYPE_1("1","支付账户充值"),
	/**
	 * 支付账户对支付账户转账
	 */
	TRANS_TYPE_2("2","支付账户对支付账户转账"),
	/**
	 * 支付账户提现/转账至银行卡
	 */
	TRANS_TYPE_3("3","支付账户提现/转账至银行卡"),
	/**
	 * 支付账户消费
	 */
	TRANS_TYPE_4("4","支付账户消费"),
	/**
	 * 代收
	 */
	TRANS_TYPE_5("5","代收"),
	/**
	 * 代付
	 */
	TRANS_TYPE_6("6","代付"),
	/**
	 * 其他
	 */
	TRANS_TYPE_9("9","其他");
	
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
	PbcTransType(String value, String content) {  
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

	public static PbcTransType getBean(String value) {
		for (PbcTransType e : PbcTransType.values()) {
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
