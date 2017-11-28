package com.heepay.enums;

public enum ShareRecordStatus {
  PRESHA("PRESHA", "待分润"),
	SHAREING("SHAING", "分润中"),
	SUCCESS("SUCCES", "分润完成"),
	FAILED("FAILED", "失败");

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
	ShareRecordStatus(String value, String content) {  
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
	 * 根据value取得Content
	 * @param value
	 * @return Content
	 */
	public static String getContentByValue(String value){
		for(ShareRecordStatus status : ShareRecordStatus.values()){
			if (status.getValue().equals(value)){
				return status.getContent();
			}
		}
		return "";
	}
}
