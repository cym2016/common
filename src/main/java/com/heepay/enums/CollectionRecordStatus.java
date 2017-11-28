package com.heepay.enums;


/**
 * 代扣状态值
     * 
     * 名称：CollectionRecordStatus.java
     * 
     * 创建者： yanxb
     * 创建时间：2016年8月19日
     * 创建描述：
     * 
     * 修改者：
     * 修改时间：
     * 修改描述：
     * 
     *
     * 审核者：
     * 审核时间：
     * 审核描述：
     * 
     *
 */
public enum CollectionRecordStatus {
	/**
	 * 未知
	 */


	PROCES("PROCES","处理中"),
	FINISH("FINISH","处理完成"),
	NOT_SIGN("NOSIGN","未签约");
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
	CollectionRecordStatus(String value, String content) {  
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
	
	
	public static String getContentByValue(String value){
		CollectionRecordStatus[] statusList = CollectionRecordStatus.values();
		for(CollectionRecordStatus status : statusList){
			if(status.getValue().equals(value)){
				return status.getContent();
			}
		}
		return "";
	}
	
}
