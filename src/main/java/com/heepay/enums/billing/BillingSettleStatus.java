package com.heepay.enums.billing;


/**
 * 
 *
 * 描    述：结算状态
 *
 * 创 建 者：   wangdong
 * 创建时间：2016年12月27日 下午1:50:05
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
public enum BillingSettleStatus {
	/**
	 * 已结算
	 */
	SETTLESTATUSY("Y","已结算"),
	/**
	 * 结算中
	 */
	SETTLESTATUSD("D","结算中"),
	/**
	 * 未结算
	 */
	SETTLESTATUSN("N","未结算"),

	/**
	 * 处理中
	 */
	SETTLE_STATUS_C("C","处理中"),
	/**
	 * 不结算
	 */
	SETTLE_STATUS_S("S","不结算");
	
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
	BillingSettleStatus(String value, String content) {  
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

	public static BillingSettleStatus getBean(String value) {
		for (BillingSettleStatus e : BillingSettleStatus.values()) {
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
