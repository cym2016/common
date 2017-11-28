package com.heepay.enums.risk;


/***
 * 
* 
* 描    述：风控规则-作用域
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
public enum ScopeRule {
	/**
	 * 交易系统
	 */
	SCOPE_RULE_1("TRANS","交易系统"),
	/**
	 * 网关系统
	 */
	SCOPE_RULE_2("GATEWAY","网关系统"),
	/**
	 * 清结算系统
	 */
	SCOPE_RULE_3("BILLING","清结算系统"),
	/**
	 * 账务系统
	 */
	SCOPE_RULE_4("ACCOUNT","账务系统"),
	/**
	 * 运营系统
	 */
	SCOPE_RULE_5("OPERAT","运营系统"),
	/**
	 * 商家站点
	 */
	SCOPE_RULE_6("MERCHANT","商家站点");
	
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
	ScopeRule(String value, String content) {  
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

	public static ScopeRule getBean(String value) {
		for (ScopeRule e : ScopeRule.values()) {
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
