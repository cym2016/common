package com.heepay.enums;


/**
 * AuthenticationStatus认证状态值
 * @author LY
 *
 */
public enum AuthenticationStatus {
	/**
	 * 未知
	 */
	PENDING("PENDIN", "待认证"),
	SUCCESS("SUCCES", "认证成功"),
	FAIL("FAILED", "认证失败");

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
	AuthenticationStatus(String value, String content) {  
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
   * 根据值取得内容
   * @return 内容
   */
  
   public static AuthenticationStatus getBean(String value) {
     for (AuthenticationStatus e : AuthenticationStatus.values()) {
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
}
