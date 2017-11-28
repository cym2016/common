package com.heepay.enums.tpds;

/**
 * 
 *
 * 描    述：日切点
 *
 * 创 建 者：   wangdong
 * 创建时间：2017年2月17日 下午5:31:41
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
public enum CutDay {
	/**
	 * 商户
	 */
	MERCHANT("mer","商户"),
	/*
	 * 客户
	 */
	CUSTOMER("cus", "客户"),
	/*
	 * 银行
	 */
	BANK("ban", "银行");

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
	CutDay(String value, String content) {
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

	public static CutDay getBean(String value) {
		for (CutDay e : CutDay.values()) {
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
