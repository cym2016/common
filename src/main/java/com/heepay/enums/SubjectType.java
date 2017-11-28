/**
 * 
 */
package com.heepay.enums;

/**
 * 
* 
* 描    述：科目类型枚举类
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
public enum SubjectType {

	  /**
	   * 
	   */
    ASSET("ASSET","资产类"),
    DEBT("DEBT","负债类"),
    COMMON("COMMON","共同类");

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
	  SubjectType(String value, String content) {  
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
	  
	   public static SubjectType getBean(String value) {
	     for (SubjectType e : SubjectType.values()) {
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
