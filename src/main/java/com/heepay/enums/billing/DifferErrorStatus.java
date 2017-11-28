package com.heepay.enums.billing;



/***
 * 
* 
* 描    述：记账差错状态
*
* 创 建 者：wangl
* 创建时间：  Nov 14, 20163:10:56 PM
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
public enum DifferErrorStatus {
	/**
	 * 未记账
	 */
	BBSTATUSN("N", "未记账"),
	/**
	 * 记账中
	 */
	BBSTATUSD("D", "记账中"),
	/**
	 * 已记账
	 */
	BBSTATUSY("Y", "已记账");
	
	
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
	DifferErrorStatus(String value, String content) {  
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

	public static DifferErrorStatus getBean(String value) {
		for (DifferErrorStatus e : DifferErrorStatus.values()) {
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
