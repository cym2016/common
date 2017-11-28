package com.heepay.enums.billing;

/**
 * 
 *
 * 描    述：报警状态
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
public enum BillingWaringStatus {
	/**
	 * 未处理
	 */
	STATUSN("N", "未处理"),
	/**
	 * 处理失败
	 */
	STATUSE("E", "处理失败"),
	/**
	 * 处理成功
	 */
	STATUSY("Y", "处理成功");
	
	
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
	BillingWaringStatus(String value, String content) {  
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

	public static BillingWaringStatus getBean(String value) {
		for (BillingWaringStatus e : BillingWaringStatus.values()) {
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
