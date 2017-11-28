package com.heepay.enums.risk;


/***
 * 
* 
* 描    述：风控规则-处理方式
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
public enum HandlingRule {
	/**
	 * 预警
	 */
	HANDLING_RULE_TYPE_1("WARN","预警"),
	/**
	 * 统计 statis
	 */
	HANDLING_RULE_TYPE_2("STATIS","统计"),
	/**
	 * 阻断 block
	 */
	HANDLING_RULE_TYPE_3("BLOCK","阻断"),
	/**
	 * 审核 audit
	 */
	HANDLING_RULE_TYPE_4("AUDIT","审核");
	
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
	HandlingRule(String value, String content) {  
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

	public static HandlingRule getBean(String value) {
		for (HandlingRule e : HandlingRule.values()) {
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
