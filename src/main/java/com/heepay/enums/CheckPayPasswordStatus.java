package com.heepay.enums;


/**
 * CheckPayPasswordStatus 校验支付密码
 * @author houjianchun
 *
 */
public enum CheckPayPasswordStatus {
	/**
	 * 未知
	 */
  FREEZED("FREZED","支付密码输入错误三次，锁定两小时"), 
  SUCCESS("SUCCES","成功"),
  PAYPASSWORDONE("PAYONE","输入错误，还可输入1次"),
  PAYPASSWORDTWO("PAYTWO","输入错误，还可输入2次"),
  PAYPASSWORDTHREE ("PAYTRE","输入错误3次，请稍后重试！");
  
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
	CheckPayPasswordStatus(String value, String content) {  
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

	public static CheckPayPasswordStatus getBean(String value) {
		for (CheckPayPasswordStatus e : CheckPayPasswordStatus.values()) {
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
