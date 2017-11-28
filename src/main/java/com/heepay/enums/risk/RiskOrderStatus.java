package com.heepay.enums.risk;


/***
 * 
* 
* 描    述：风险订单状态
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
public enum RiskOrderStatus {
	/**
	 * 已阻断
	 */
	RISK_ORDER_STATUS_BLOCK("BLOCK","已阻断"),
	/**
	 * 预警
	 */
	RISK_ORDER_STATUS_WARN("WARN","预警"),
	/**
	 * 已人工放行
	 */
	RISK_ORDER_STATUS_ARTRELEA("ARTRELEA","已人工放行"),
	/**
	 * 已人工阻断
	 */
	RISK_ORDER_STATUS_ARTBLOCK("ARTBLOCK","已人工阻断"),
	/**
	 * 人工审核
	 */
	RISK_ORDER_STATUS_ARTAUDIT("ARTAUDIT","人工审核");
	
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
	RiskOrderStatus(String value, String content) {  
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

	public static RiskOrderStatus getBean(String value) {
		for (RiskOrderStatus e : RiskOrderStatus.values()) {
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
