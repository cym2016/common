package com.heepay.enums.risk;

/**
 * 
 *
 * 描    述：
 *
 * 创 建 者：   wangdong
 * 创建时间：2016年12月27日 下午12:44:24
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
public enum RuleDetailType {
	/**
	 * 限额
	 */
	QUOTA("10001","限额"),
	/**
	 * 禁用
	 */
	DISABLE("10002","禁用"),
	BLACK("10003","黑名单"),
	CHANNEL("10004","通道限额"),
	INCOME("10005","入金限额");
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
	RuleDetailType(String value, String content) {  
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
