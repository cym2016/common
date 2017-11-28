package com.heepay.enums;

public enum RefundScope {

	REFALL("3", "实时退款(全部)"),
	REFHAL("4", "实时退款(部分)");

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
	RefundScope(String value, String content) {
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
	
	
	public static String getContentByValue(String value){
		RefundScope[] enums = RefundScope.values();
		for(RefundScope e : enums){
			if(e.getValue().equals(value)){
				return e.getContent();
			}
		}
		return "";
	}
	
}
