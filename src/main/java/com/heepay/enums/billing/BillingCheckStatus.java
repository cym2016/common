package com.heepay.enums.billing;


/**
 * 
 *
 * 描    述：对账日志状态
 *
 * 创 建 者：   wangdong
 * 创建时间：2016年12月27日 下午1:46:50
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
public enum BillingCheckStatus {
	/**
	 * 未开始
	 */
	CHECKSTATUSWS("WS","未开始"),
	/**
	 * 未开始中(为防止并发添加的中间状态)
	 */
	CHECKSTATUSWSD("WS-D","未开始中"),
	/**
	 * 对账中
	 */
	CHECKSTATUSCD("CD","对账中"),
	/**
	 * 对账中的中间状态(为防止并发添加的中间状态)
	 */
	CHECKSTATUSCDD("CD-D","对账中的中间状态"),
	/**
	 * 已对账
	 */
	CHECKSTATUSCE("CE","已对账");
	
	
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
	BillingCheckStatus(String value, String content) {  
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

	public static BillingCheckStatus getBean(String value) {
		for (BillingCheckStatus e : BillingCheckStatus.values()) {
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
