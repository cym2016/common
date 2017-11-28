/**
 * 
 */
package com.heepay.enums;

/**
 * 
* 
* 描    述：科目级别枚举类
*
* 创 建 者： 王亚洪  
* 创建时间： 2016年12月28日 上午11:47:07 
* 创建描述：
* 
* 修 改 者：  
* 修改时间： 
* 修改描述： 
* 
* 审 核 者：
* 审核时间：
* 审核描述：
*
 */
public enum SubjectLevel {

	  
    FIRST_SUBJECT("1", "一级科目"),
    SECOND_SUBJECT("2", "二级科目"),
    THREE_SUBJECT("3", "三级科目");

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
	  SubjectLevel(String value, String content) {  
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
	  
	   public static SubjectLevel getBean(String value) {
	     for (SubjectLevel e : SubjectLevel.values()) {
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
