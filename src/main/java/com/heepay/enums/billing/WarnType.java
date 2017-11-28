package com.heepay.enums.billing;

/**
 * *
 * 
* 
* 描    述：告警记录处理方式枚举类
*
* 创 建 者： wangjie
* 创建时间：  2016年11月29日上午10:18:14
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
public enum WarnType {
	
	/**
	 * 发邮件
	 */
	SENDEMAIL("EMAIL","发邮件"),
	/**
	 * 发短信
	 */
	SENDMESSAGE("MESSAGE","发短信");

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
	WarnType(String value, String content) {  
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

	public static WarnType getBean(String value) {
		for (WarnType e : WarnType.values()) {
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
