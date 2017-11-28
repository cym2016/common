package com.heepay.enums.billing;


/**
 * 
 *
 * 描    述：差异类型
 *
 * 创 建 者：   wangdong
 * 创建时间：2016年10月9日
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
public enum BillingDifferType {
	/**
	 * 长款差异
	 */
	BDTYPEC("CK", "长款差异"),
	/**
	 * 短款差异
	 */
	BDTYPED("DK", "短款差异"),
	/**
	 * 金额不一致
	 */
	BDTYPEJ("JE", "金额不一致"),
	/**
	 * 其他差异
	 */
	BDTYPEO("QT", "其他差异"),
	/**
	 * 未知差异
	 */
	BDTYPEW("WZ", "未知差异");
	
	
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
	BillingDifferType(String value, String content) {  
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

	public static BillingDifferType getBean(String value) {
		for (BillingDifferType e : BillingDifferType.values()) {
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
