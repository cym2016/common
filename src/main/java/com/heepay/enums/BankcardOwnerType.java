package com.heepay.enums;


/**
 * BankcardOwnerType状态
 * @author zc
 *
 */
public enum BankcardOwnerType {
	/**
	 * 未知
	 */
  PERSONAL("0","个人"),
  ENTERPRISE("1","企业"),
  UNKNOW("-1","未知");
  

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
	BankcardOwnerType(String value, String content) {  
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
	 * 
	 * @description 根据值获取内容
	 * @author TianYanqing      
	 * @created 2016年9月23日 上午11:57:33     
	 * @param value
	 * @return
	 */
	public static String getContentByValue(byte value){
		BankcardOwnerType[] types = BankcardOwnerType.values();
		String content=BankcardOwnerType.UNKNOW.getContent();
		for(BankcardOwnerType type:types){
			if(Byte.valueOf(type.getValue()).equals(value)){
				content = type.getContent();
				break;
			}
		}
		return content;
	}
}
