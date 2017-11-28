package com.heepay.enums;


/**
 * 内部转账状态值
     * 
     * 名称：InnerTransferRecordStatus.java
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
public enum InnerTransferRecordStatus {
	/**
	 * 未知
	 */
	SUCCESS("SUCCES","转账成功"),
	TRAING("TRAING","转账发起"),
	FAILED("FAILED","转账失败");

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
	InnerTransferRecordStatus(String value, String content) {  
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
}
