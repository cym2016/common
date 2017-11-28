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
public enum CollectionRecordDetailStatus {
	/**
	 * 未知
	 */

	COLING("COLING","收款中"),

	SUCCESS("SUCCES","收款成功"),

	FAILED("FAILED","收款失败"),

	PRECOL("PRECOL","待收款"),

	AUDING("AUDING","审核中"),

	AUDREJ("AUDREJ","审核不通过");

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
	CollectionRecordDetailStatus(String value, String content) {
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

	public static String getContentByValue(String value) {
		CollectionRecordDetailStatus[] statuses = CollectionRecordDetailStatus.values();
		for(CollectionRecordDetailStatus cur : statuses) {
			if(cur.getValue().equals(value)) {
				return cur.getContent();
			}
		}
		return "";
	}

}
