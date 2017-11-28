/**
 * 
 */
package com.heepay.enums;

/**
 * <p>Title:CostType.java</p> 
 * <p>Description:结算至枚举类</p>
 * <p>Company:hy</p>
 * @author ly
 * @date 2016年9月2日18:00:47
 */
public enum SettlementTo {

	  /**
	   * 
	   */
	  ACCOUNTBALANCE("ACCBAL","账户余额");
	  //BANKCARD("BANKCD","银行卡");

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
	  SettlementTo(String value, String content) {  
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
	  
	   public static SettlementTo getBean(String value) {
	     for (SettlementTo e : SettlementTo.values()) {
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
