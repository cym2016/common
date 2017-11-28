package com.heepay.enums.billing;
/**
 * 
 *
 * 描    述：订单结算周期
 *
 * 创 建 者：   wangdong
 * 创建时间：2016年11月17日 下午8:36:04
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
public enum SettleCyc {

	/**
	 * 实时
	 */
	SETTLECYC_T0("0","实时"),
	/**
	 * 周期
	 */
	SETTLECYC_T1("1","周期");

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
	SettleCyc(String value, String content) {  
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

	public static SettleCyc getBean(String value) {
		for (SettleCyc e : SettleCyc.values()) {
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
