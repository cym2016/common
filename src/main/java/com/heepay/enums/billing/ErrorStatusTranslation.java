package com.heepay.enums.billing;


/**
 * 处理意见翻译类
 * @author wangl
 * @时间：2016年9月23日14:27:03
 */
public enum ErrorStatusTranslation {
	/**
	 * 已补单
	 */
	SETTLESTATUSY("BD","已补单"),
	
	/**
	 * 未知差异
	 */
	SETTLESTATUSYWZ("WZ","未知差异"),
	
	/**
	 * 已撤单
	 */
	SETTLESTATUSD("CD","已撤单"),
	/**
	 * 金额不一致
	 */
	SETTLESTATUJE("JE","金额不一致"),
	/**
	 * 其他差异
	 */
	SETTLESTATUSN("QT","其他差异"),
	/**
	 * 补单失败
	 */
	CHANNEL_S("S","补单失败"),
	/**
	 * 撤单失败
	 */
	CHANNEL_C("C","撤单失败");
	
	
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
	ErrorStatusTranslation(String value, String content) {  
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

	public static ErrorStatusTranslation getBean(String value) {
		for (ErrorStatusTranslation e : ErrorStatusTranslation.values()) {
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
