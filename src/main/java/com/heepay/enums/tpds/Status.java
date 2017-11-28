package com.heepay.enums.tpds;

/***
 * 
* 
* 描    述：状态  ENABLE(启用) DISABL(禁用)
*
* 创 建 者： wangl
* 创建时间：  18 Feb 201718:19:09
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
public enum Status {
	
	/**
	 * 启用
	 */
	ENABLE("ENABLE","启用"),
	
	/**
	 * 禁用
	 */
	DISABL("DISABL", "禁用");

	
	String _value;

	/**
	 * 存放内容
	 */
	String _Content;

	/**
	 * 私有构造函数
	 * @param value 枚举值
	 * @param content 缓存内容
	 * @return
	 */
	Status(String value, String content) {
		this._value = value;  
		this._Content = content;  
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
		return this._Content;
	}

	/**
	 * 根据值取得内容
	 * 
	 * @return 内容
	 */

	public static Status getBean(String value) {
		for (Status e : Status.values()) {
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
