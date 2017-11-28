package com.heepay.enums;


/**
 * Trans交易类型
 * @author houjianchun
 *
 */
public enum BankcardType {
	/**
	 * 未知
	 */
  	UNKNOWNED("UNKNOW","未知"),//网银支付时，第一次生成数据无法得知卡类型
    QUANBU("QUANBU","全部"),
	SAVINGCARD("SAVING","储蓄卡"),
	CREDITCARD("CREDIT","信用卡");

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
	BankcardType(String value, String content) {  
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
   * 根据值取得内容
   * @return 内容
   */
//	public static BankcardType getBean(String value) {
//        for (BankcardType e : BankcardType.values()) {
//            if (e.getValue().equals(value)) {
//                return e;
//            }
//        }
//        return null;
//    }

    public static String labelOf(String val) {
        for (BankcardType e : BankcardType.values()) {
            if (e.getValue().equals(val)) {
                return e.getContent();
            }
        }
        return "";
    }
}
