package com.heepay.enums;


/**
 * 充值状态值
     * 
     * 名称：ChargeRecordStatus.java
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
public enum ChargeRecordStatus {
	
	PRECHARGE("PRECAG","待支付"),
	CHARGEING("CAGING","处理中"),
	DEAL_SUCCESS("DESUCS","处理成功"),
	DEAL_FAILED("DEFAIL","处理失败"),
	SUCCESS("SUCCES","成功"),
	UN_CONFIRM("UNCONF","待确认"),
	CONFIRM("CONFIR","已确认"),
	AUDING("PREAUD","待审核"),
	AUDREJ("AUDREJ","审核拒绝"),
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
	ChargeRecordStatus(String value, String content) {  
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
		ChargeRecordStatus[] statusList = ChargeRecordStatus.values();
    for(ChargeRecordStatus status : statusList){
      if(status.getValue().equals(value)){
        return status.getContent();
      }
    }
    return "";
  }
}
