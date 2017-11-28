package com.heepay.enums.risk;


/***
 * 
* 
* 描    述：风控规则-触发方式
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
public enum TriggeredRule {
	/**
	 * 订单请求 request
	 */
	TRIGGERED_RULE_1("REQUEST","订单请求"),
	/**
	 * 支付成功 pay success
	 */
	TRIGGERED_RULE_2("PAYSUCCESS","支付成功"),
	/**
	 * 日终结算 day end
	 */
	TRIGGERED_RULE_3("DAYEND","日终结算"),
	/**
	 * 登录验证 login check
	 */
	TRIGGERED_RULE_4("LOGINCHECK","登录验证");
	
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
	TriggeredRule(String value, String content) {  
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

	public static TriggeredRule getBean(String value) {
		for (TriggeredRule e : TriggeredRule.values()) {
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
