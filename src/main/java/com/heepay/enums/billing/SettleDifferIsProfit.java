package com.heepay.enums.billing;
/**
 * 
 *
 * 描    述：差异表中的分润标识
 *
 * 创 建 者：   wangl
 * 创建时间：2016年10月27日 下午5:08:05
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
public enum SettleDifferIsProfit {

	/**
	 * 否
	 */
	ACCOUNTFLGN("N","否"),
	/**
	 * 是
	 */
	ACCOUNTFLGY("Y","是");

	/**
	 * 取值
	 */
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
	SettleDifferIsProfit(String value, String content) {  
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

	public static SettleDifferIsProfit getBean(String value) {
		for (SettleDifferIsProfit e : SettleDifferIsProfit.values()) {
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
