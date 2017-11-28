package com.heepay.enums.risk;


/***
 * 
* 
* 描    述：风控规则-监控业务
*
* 创 建 者：wangl
* 创建时间：  Nov 29, 201611:44:53 AM
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
public enum MonitoringRule {
	/**
	 * 交易类型 transType
	 */
	MONITORING_RULE_1("TRANS","交易类型"),
	/**
	 * 通道类型 channelType
	 */
	MONITORING_RULE_2("CHENNEL","通道类型");
	
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
	MonitoringRule(String value, String content) {  
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

	public static MonitoringRule getBean(String value) {
		for (MonitoringRule e : MonitoringRule.values()) {
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
