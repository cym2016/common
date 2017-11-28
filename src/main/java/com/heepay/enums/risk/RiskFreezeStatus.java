package com.heepay.enums.risk;


/***
 * 
* 
* 描    述：
*
* 创 建 者：wangl
* 创建时间：  Nov 21, 201610:05:43 AM
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
public enum RiskFreezeStatus {

	
	/**
	 * 冻结/解冻  1：解冻成功 2：解冻成功
	 */
	
	RISK_RREEZE_STATUS_1("1","解冻成功"),
	RISK_RREEZE_STATUS_2("2","解冻成功");
	
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
	RiskFreezeStatus(String value, String content) {  
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

	public static RiskFreezeStatus getBean(String value) {
		for (RiskFreezeStatus e : RiskFreezeStatus.values()) {
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
