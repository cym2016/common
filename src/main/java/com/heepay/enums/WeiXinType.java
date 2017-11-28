/**
 * 
 */
package com.heepay.enums;


/**
 * 
* 
* 描    述： 发送微信时所用的枚举类
*
* 创 建 者： 王亚洪  
* 创建时间： 2016年12月26日 下午3:21:12 
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
public enum WeiXinType {
	
  
	NOTNULL("NOTNULL", "发送的内容不允许为空"),
	FAILED("FAILED", "发送微信失败"),
  SUCCESS("SUCCESS", "发送微信成功");
	

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
	WeiXinType(String value, String content) {  
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
  
   public static WeiXinType getBean(String value) {
     for (WeiXinType e : WeiXinType.values()) {
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
