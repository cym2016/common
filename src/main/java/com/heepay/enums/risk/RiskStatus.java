package com.heepay.enums.risk;


/***
 * 
* 
* 描    述：冻结/解冻状态
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
public enum RiskStatus {

	
	/**
	 * 冻结/解冻状态  0:冻结待审核 1：冻结审核通过  2：冻结审核拒绝 3:解冻待审核 4：解冻审核通过 5：解冻审核拒绝
	 */
	RISK_STATUS_0("0","冻结待审核"),
	RISK_STATUS_1("1","冻结审核通过"),
	RISK_STATUS_2("2","冻结审核拒绝"),
	RISK_STATUS_3("3","解冻待审核"),
	RISK_STATUS_4("4","解冻审核通过"),
	RISK_STATUS_5("5","解冻审核拒绝");
	
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
	RiskStatus(String value, String content) {  
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

	public static RiskStatus getBean(String value) {
		for (RiskStatus e : RiskStatus.values()) {
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
