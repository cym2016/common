package com.heepay.enums;


/**
 * 提现状态值
     * 
     * 名称：WithdrawStatus.java
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
public enum WithdrawStatus {
	
	AUDING("AUDING","审核中"),
	AUDREJ("AUDREJ","审核失败"),
	PENDNG("PENDNG","待处理"),
	DRAING("DRAING","处理中"),
	SUCCESS("SUCCES","成功"),
	FAILED("FAILED","失败");
  
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
	WithdrawStatus(String value, String content) {  
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

	public static String getContentByValue(String value){
		WithdrawStatus[] statusList = WithdrawStatus.values();
		for(WithdrawStatus status : statusList){
			if(status.getValue().equals(value)){
				return status.getContent();
			}
		}
		return "";
	}
}
