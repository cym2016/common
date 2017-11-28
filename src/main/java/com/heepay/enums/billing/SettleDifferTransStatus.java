package com.heepay.enums.billing;
/**
 * 
 *
 * 描    述：差异表中的支付状态
 *
 * 创 建 者：   wangdong
 * 创建时间：2016年10月27日 下午5:00:12
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
public enum SettleDifferTransStatus {
	
	/**
	 * 待支付
	 */
	PAYMENTSTATUS_PRE("PREPAY","待支付"),
	/**
	 * 处理中
	 */
	PAYMENTSTATUS_ING("PAYING","处理中"),
	/**
	 * 支付失败
	 */
	PAYMENTSTATUS_FAI("FAILED","支付失败"),
	/**
	 * 支付超时
	 */
	PAYMENTSTATUS_TIM("TIMOUT","支付超时"),
	/**
	 * 支付成功
	 */
	PAYMENTSTATUS_SUC("SUCCES","支付成功");

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
	SettleDifferTransStatus(String value, String content) {  
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

	public static SettleDifferTransStatus getBean(String value) {
		for (SettleDifferTransStatus e : SettleDifferTransStatus.values()) {
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
