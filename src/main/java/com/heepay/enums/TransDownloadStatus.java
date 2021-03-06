package com.heepay.enums;


/**
 * TransDownloadStatus交易单下载日志状态
 * @author TW
 *
 */
public enum TransDownloadStatus {
	/**
	 * 未知
	 */
	PENDING("PENDIN", "处理中"),
	SUCCESS("SUCCES", "成功"),
	FAIL("FAILED", "失败");

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
	TransDownloadStatus(String value, String content) {
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
  
   public static TransDownloadStatus getBean(String value) {
     for (TransDownloadStatus e : TransDownloadStatus.values()) {
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
