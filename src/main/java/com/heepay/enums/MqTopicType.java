package com.heepay.enums;


/**
 * 消息队列类型
* 
* 描    述：
*
* 创 建 者：zhangchen
* 创建时间： 2016年8月25日 下午5:17:07 
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
public enum MqTopicType {

 
  ChargeResultsTopic("ChargeResultsTopic", "充值"),
  PayResultsTopic("PayResultsTopic", "支付"),
  RefundResultsTopic("RefundResultsTopic", "退款"),
  CollectionResultsTopic("CollectionResultsTopic", "代收"),
  BatpayResultsTopic("BatpayResultsTopic", "转账"),
  WithdrawResultsTopic("WithdrawResultsTopic", "提现");
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
	MqTopicType(String value, String content) {  
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
	 * 取得缓存内容
	 * @return 缓存内容
	 */
	public String getContent() {
		return this._Content;
	}
}
