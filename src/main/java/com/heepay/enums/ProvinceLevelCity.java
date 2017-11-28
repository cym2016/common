package com.heepay.enums;


/**
 * 
* 
* 描    述：直辖市
*
* 创 建 者： yanxb  
* 创建时间： 2016年9月26日 下午2:36:04 
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
public enum ProvinceLevelCity {
	/**
	 * 未知
	 */
	BEIJING("BJ", "北京"),
	SHANGHAI("SH", "上海"),
	TIANJIN("TJ", "天津"),
	CHONGQING("CQ", "重庆");

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
	ProvinceLevelCity(String value, String content) {  
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
	
	 public static ProvinceLevelCity getBean(String value) {
     for (ProvinceLevelCity e : ProvinceLevelCity.values()) {
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
