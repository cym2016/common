package com.heepay.enums;


/**
 * Notify通知状态值
 * @author zc
 *
 */
public enum NotifyRecordStatus {
  UNKNOWNED("UNKNOW","未通知"),
  SUCCESS("SUCCES","通知成功"),
  ERRORS("ERRORS","错误"),//此类型数据不通知商户，只记录到库里
  FAILED("FAILED","通知失败");
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
	NotifyRecordStatus(String value, String content) {  
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
