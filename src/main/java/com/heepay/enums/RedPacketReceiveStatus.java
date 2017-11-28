package com.heepay.enums;

/**
 * 
* 
* 描    述：
*
* 创 建 者： 杨春龙  
* 创建时间： 2017年7月20日 下午2:51:07 
* 创建描述：红包业务支付方式枚举类
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
public enum RedPacketReceiveStatus {
	
    RECING("RECING","领取中"),
    
    RECEND("RECEND","领取完毕");
	
	String _value;

	/**
	 * 存放内容
	 */
	String _Content;

	/**
	 * 私有构造函数
	 * 
	 * @param value
	 *            枚举值
	 * @param content
	 *            缓存内容
	 * @return
	 */
	RedPacketReceiveStatus(String value, String content) {
		this._value = value;
		this._Content = content;
	}

	/**
	 * 取得枚举对象值
	 * 
	 * @return 枚举对象值
	 */
	public String getValue() {
		return this._value;
	}

	/**
	 * 取得内容
	 * 
	 * @return 内容
	 */
	public String getContent() {
		return this._Content;
	}
}
