package com.heepay.enums;


/**
 * WeChatRecord微信交易单状态值
 * @author houjianchun
 *
 */
public enum WeChatRecordStatus {

	PREPAY("PREPAY","待支付"),
	PAYING("PAYING","处理中"),
	SUCCESS("SUCCES","成功"),
	FREEZED("FREZED","冻结"),
	FAILED("FAILED","失败"),
	TIMOUT("TIMOUT","超时"),
	REFUND("REFUND","已退款"),
	ORDCLS("ORDCLS","订单关闭");
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
	WeChatRecordStatus(String value, String content) {  
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
	
	/**
	 * 根据value取得Content
	 * @param value
	 * @return Content
	 */
	public static String getContentByValue(String value){
		for(WeChatRecordStatus status : WeChatRecordStatus.values()){
			if (status.getValue().equals(value)){
				return status.getContent();
			}
		}
		return "";
	}
	
}
