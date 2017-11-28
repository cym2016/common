package com.heepay.enums;

public enum RefundType {
	
	CONSUM("CONSUM", "消费退款"),
	WECHAT("WECHAT", "微信退款"),
	CHARGE("CHARGE", "充值退款"),
	BATCOL("BATCOL", "代收退款"),
	UNIONP("UNIONP", "银联扫码退款"),
	INSTAL("INSTAL", "量化派退款");
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
	RefundType(String value, String content) {  
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
		RefundType[] enums = RefundType.values();
		for(RefundType e : enums){
			if(e.getValue().equals(value)){
				return e.getContent();
			}
		}
		return "";
	}
	
}
