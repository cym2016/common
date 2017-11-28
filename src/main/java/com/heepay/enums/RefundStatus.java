package com.heepay.enums;

public enum RefundStatus {

	PREAUTH("PREAUT", "待审核"),
	PREREFUND("PRERFD", "待处理"),
	REFUNDING("RFDING", "处理中"),
	SUCCESS("SUCCES", "成功"),
	FAILED("FAILED", "失败"),
	REJECT("REJECT", "审核失败");

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
	RefundStatus(String value, String content) {  
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
	 * 根据value取得Content
	 * @param value
	 * @return Content
	 */
	public static String getContentByValue(String value){
		for(RefundStatus status : RefundStatus.values()){
			if (status.getValue().equals(value)){
				return status.getContent();
			}
		}
		return "";
	}
}
