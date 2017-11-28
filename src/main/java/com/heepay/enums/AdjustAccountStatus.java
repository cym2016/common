package com.heepay.enums;


/**
 * 调账申请状态
 * @author 王亚洪
 *
 */
public enum AdjustAccountStatus {

  AUDING("AUDING", "未复核"),
  REVOKE("REVOKE", "已撤销"),
  ADOPT("ADOPT", "复核成功");

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
	AdjustAccountStatus(String value, String content) {
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
  
   public static String labelOf(String value) {
     for (AdjustAccountStatus e : AdjustAccountStatus.values()) {
       if (value.equals(e.getValue())) {
         return e.getContent();
       }
     }
     return null;
   }
	
	
}
