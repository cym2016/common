package com.heepay.enums.billing;


/**
 * 
 *
 * 描    述：清结算字典中结算区间维护
 *
 * 创 建 者：   wangdong
 * 创建时间：2016年12月27日 下午1:57:08
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
public enum SettleDicTypeEnum {
	/**
	 * 结算区间
	 */
	SETTLEAREA("SETTLE_AREA","结算区间");
	
	
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
	SettleDicTypeEnum(String value, String content) {  
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

	public static SettleDicTypeEnum getBean(String value) {
		for (SettleDicTypeEnum e : SettleDicTypeEnum.values()) {
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
