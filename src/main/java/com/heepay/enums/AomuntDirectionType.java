package com.heepay.enums;


/**
 *
 * 描    述：在商户角度，资金的方向
 *
 * 创 建 者： 张俊新
 * 创建时间： 2016年9月12日 下午3:30:28
 * 创建描述：资金方向
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

public enum AomuntDirectionType {

	INSCREASE("0","入账"),
	SUBTRACT("1","出账");

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
	AomuntDirectionType(String value, String content) {
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
