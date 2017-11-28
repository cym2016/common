package com.heepay.enums;


/**
 * 调拨审核状态
 * @author 王亚洪
 *
 */
public enum AllocateStatus {

  AUDING("AUDING", "待审核"),
  AUDREJ("AUDREJ", "审核拒绝"),
  ADOPT("ADOPT", "审核成功");

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
	AllocateStatus(String value, String content) {
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
   public static AllocateStatus getBean(String value) {
     for (AllocateStatus e : AllocateStatus.values()) {
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
