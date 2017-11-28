/**
 * 
 */
package com.heepay.enums;

/**
 * <p>Title:RouteStatus.java</p> 
 * <p>Description:路由管理枚举类</p>
 * <p>Company:hy</p>
 * @author M.Z
 * @date 2016年8月5日 上午11:57:10
 */
public enum RouteStatus {
	/**
	 * 
	 */
	AUDIT_SUCCESS("SUCCES", "审核通过"),

	AUDING("AUDING", "待审核"),
	
	AUDREJ("AUDREJ", "审核不通过");
	

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
	RouteStatus(String value, String content) {  
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
  
   public static RouteStatus getBean(String value) {
     for (RouteStatus e : RouteStatus.values()) {
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
