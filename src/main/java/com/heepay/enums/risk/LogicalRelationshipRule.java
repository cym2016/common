package com.heepay.enums.risk;


/***
 * 
* 
* 描    述：风控规则-逻辑关系
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
public enum LogicalRelationshipRule {
	/**
	 * 名单匹配 matching
	 */
	LOGICAL_RELATION_SHIP_RULE_1("MATCHING","名单匹配"),
	/**
	 * 一致性检查 check
	 */
	LOGICAL_RELATION_SHIP_RULE_2("CHECK","一致性检查"),
	/**
	 * 数量比较 number 
	 */
	LOGICAL_RELATION_SHIP_RULE_3("NUMBER","数量比较"),
	/**
	 * 金额比较 amount
	 */
	LOGICAL_RELATION_SHIP_RULE_4("AMOUNT","金额比较");
	
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
	LogicalRelationshipRule(String value, String content) {  
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

	public static LogicalRelationshipRule getBean(String value) {
		for (LogicalRelationshipRule e : LogicalRelationshipRule.values()) {
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
