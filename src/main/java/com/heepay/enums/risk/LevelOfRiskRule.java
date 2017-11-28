package com.heepay.enums.risk;


/***
 * 
* 
* 描    述：风控规则-风险级别-风险越高，数值越大
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
public enum LevelOfRiskRule {
	/**
	 * 1级
	 */
	LEVEL_OF_RISK_RELE_1("1","1级"),
	/**
	 * 2级
	 */
	LEVEL_OF_RISK_RELE_2("2","2级"),
	/**
	 * 3级
	 */
	LEVEL_OF_RISK_RELE_3("3","3级"),
	/**
	 * 4
	 */
	LEVEL_OF_RISK_RELE_4("4","4级"),
	/**
	 * 5级
	 */
	LEVEL_OF_RISK_RELE_5("5","5级"),
	/**
	 * 6级
	 */
	LEVEL_OF_RISK_RELE_6("6","6级"),
	/**
	 * 7级
	 */
	LEVEL_OF_RISK_RELE_7("7","7级"),
	/**
	 * 8级
	 */
	LEVEL_OF_RISK_RELE_8("8","8级"),
	/**
	 * 9级
	 */
	LEVEL_OF_RISK_RELE_9("9","9级");
	
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
	LevelOfRiskRule(String value, String content) {  
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

	public static LevelOfRiskRule getBean(String value) {
		for (LevelOfRiskRule e : LevelOfRiskRule.values()) {
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
