package com.heepay.enums.risk;

/***
 * 
* 
* 描    述：风险订单处理方式
*
* 创 建 者：wangdong
* 创建时间： 2016年11月22日14:21:04
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
public enum RiskOrderDealType {
	/**
	 * 阻断
	 */
	RISK_ORDER_DEAL_BLOCK("BLOCK","阻断"),
	/**
	 * 预警
	 */
	RISK_ORDER_DEAL_WARN("WARN","预警"),
	/**
	 * 人工审核
	 */
	RISK_ORDER_DEAL_AUDIT("AUDIT","人工审核");
	
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
	RiskOrderDealType(String value, String content) {  
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

	public static RiskOrderDealType getBean(String value) {
		for (RiskOrderDealType e : RiskOrderDealType.values()) {
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
