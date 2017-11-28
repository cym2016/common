package com.heepay.enums;


import java.util.HashMap;
import java.util.Map;

/**
 * @author lm
 * SettleType 本金结算周期
 */
public enum SettlePeriod {
	T("T+1T+1", "T+1"),
	MONTH("MONTHS", "月"),
	SEASON("SEASON", "季"),
	YEAR("YEARSS", "年");

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
	SettlePeriod(String value, String content) {  
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
  
   public static SettlePeriod getBean(String value) {
     for (SettlePeriod e : SettlePeriod.values()) {
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
		for (SettlePeriod e : SettlePeriod.values()) {
			lookup.put(e.getContent(), e.getValue());
		}
	}

	public static String getLabel(String value) {
		return lookup.get(value);
	}
}
