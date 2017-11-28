package com.heepay.enums;


/**
 *
 * 描    述：手续费类型
 *
 * 创 建 者： 张晨
 * 创建时间： 2016年9月22日 下午3:30:28
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
 *
 */

public enum FeeDeductType {
	
  /**
	 * 未知
	 */
  INNER("INDEDU","坐扣"),
	OUTER("EXDEDU","外扣");
  
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
	FeeDeductType(String value, String content) {
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
}
