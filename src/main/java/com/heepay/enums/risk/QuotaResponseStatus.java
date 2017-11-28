package com.heepay.enums.risk;

/**
 * 
 *
 * 描    述：风控系统-限额返回状态
 *
 * 创 建 者：   wangdong
 * 创建时间：2016年12月27日 下午12:37:04
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
public enum QuotaResponseStatus {
	/**
	 * 成功
	 */
	SUCCESS(1000, "success"),
	/**
	 *失败
	 */
	FAIL(2000, "fail"),
	DISABLE(3000, "商户产品被禁用"),
	/**
	 * 产品没有限额规则
	 */
	QUOTAVALID(4000, "产品限额规则为空");
	
	
	Integer _value; 
	
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
	QuotaResponseStatus(Integer value, String content) {  
		this._value = value;  
		this._content = content;  
	}  
	
	/**
	 * 取得枚举对象值
	 * @return 枚举对象值
	 */
	public Integer getValue() {
		return this._value;
	}
	
	/**
	 * 取得内容
	 * @return 内容
	 */
	public String getContent() {
		return this._content;
	}

}
