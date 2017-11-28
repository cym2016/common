package com.heepay.enums;


/**
 * 批量付款单状态值
     * 
     * 名称：BatchPayStatus.java
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
public enum BatchPayStatus {
	/**
	 * 未知
	 */
 

	PREAUD("PREAUD","待审核"),//批次--商家待审核
	PROCES("PROCES","处理中"),//批次--商家显示处理中
	PENDNG("PENDNG","处理中"),//批次--后台审核通过后状态
	
	SUCCESS("SUCCES","付款成功"),	
	FAILED("FAILED","付款失败"),	
	
  AUDREJ("AUDREJ","审核失败"),
  PREPAY("PREPAY","待付款"),
  PAYING("PAYING","付款中"),
  
  
  FINISH("FINISH","处理完成"),	
	SERVER_ERROR("SVRERR","服务器错误");
	
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
	BatchPayStatus(String value, String content) {  
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
	  BatchPayStatus[] statusList = BatchPayStatus.values();
    for(BatchPayStatus status : statusList){
      if(status.getValue().equals(value)){
        return status.getContent();
      }
    }
    return "";
  }
	
}
