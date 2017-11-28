package com.heepay.enums;


import java.util.HashMap;
import java.util.Map;

/**
 * RateBankcardType费率银行卡类型
 * @author ly
 *
 */
public enum RateBankcardType {
	/**
	 * 未知
	 */
    DEBITCARD("SAVING", "储蓄卡"),
	CREDITCARD("CREDIT", "信用卡");

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
	RateBankcardType(String value, String content) {  
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
   * 根据值取得内容
   * @return 内容
   */
	
	 public static RateBankcardType getBean(String value) {
     for (RateBankcardType e : RateBankcardType.values()) {
       if (value.equals(e.getValue())) {
         return e;
       }
     }
     return null;
   }

   public static String labelOf(String val) {
     if (getBean(val) != null) {
       return getBean(val).getContent();
     }
     return null;
   }

	private static final Map<String, String> lookup = new HashMap<>();

	static {
		for (RateBankcardType e : RateBankcardType.values()) {
			lookup.put(e.getContent(), e.getValue());
		}
	}
	public static String getLabel(String value){
		return lookup.get(value);
	}
}
