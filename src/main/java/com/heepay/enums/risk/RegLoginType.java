/**
 * 
 */
package com.heepay.enums.risk;

/**
 * @author Administrator
 *
 */
public enum RegLoginType {
	//1商户注册2商户后台登录3用户注册4用户后台登录
	/**
	 * 商户注册
	 */
	MER_REG("1", "商户注册"),
	/**
	 * 商户后台登录
	 */
	MER_LOGIN_BACK("2", "商户后台登录"),
	
	/**
	 * 用户注册
	 */
	USER_REG("3", "用户注册"),
	
	/**
	 * 用户后台登录
	 */
	USER_LOGIN_BACK("4", "用户后台登录"),

	/**
	 * 商户交易
	 */
	MER_TRANS("5", "商户交易");
	
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
	RegLoginType(String value, String content) {  
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

	public static RegLoginType getBean(String value) {
		for (RegLoginType e : RegLoginType.values()) {
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
