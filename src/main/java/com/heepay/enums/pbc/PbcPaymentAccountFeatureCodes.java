package com.heepay.enums.pbc;

/**
 * *
 * 
* 
* 描    述：PbcPaymentAccount 表 事件特征码
*
* 创 建 者： wangl
* 创建时间：  2016年12月13日下午4:27:48
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
public enum PbcPaymentAccountFeatureCodes {
	
	/**
	 * 同一支付账号当日累计消费超过10000元且当日虚拟商品批量买入占购物数量比超过90%
	 */
	PBC_TOID("1001","同一支付账号当日累计消费超过10000元且当日虚拟商品批量买入占购物数量比超过90%"),
	/**
	 * 同一支付账号当日转入账户金额超过30000元且为线下充值卡充值消费金额超过转入金额80%
	 */
	PBC_TRANSTYPECODE("1002","同一支付账号当日转入账户金额超过30000元且为线下充值卡充值消费金额超过转入金额80%"),
	
	/**
	 * 5日内同证件号不同支付账号互转资金超过10万元
	 */
	PBC_REPORTCODES("1003","5日内同证件号不同支付账号互转资金超过10万元"),
	
	/**
	 * 支付机构自定义异常事件
	 */
	PBC_NUMBER("9999","支付机构自定义异常事件");
	
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
	PbcPaymentAccountFeatureCodes(String value, String content) {  
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

	public static PbcPaymentAccountFeatureCodes getBean(String value) {
		for (PbcPaymentAccountFeatureCodes e : PbcPaymentAccountFeatureCodes.values()) {
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
