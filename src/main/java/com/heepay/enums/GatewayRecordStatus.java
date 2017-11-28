package com.heepay.enums;


/**
 * GatewayRecord交易单状态值
 * @author houjianchun
 *
 */
public enum GatewayRecordStatus {

	PREPAY("PREPAY","待支付"),
	PAYING("PAYING","处理中"),
	SUCCESS("SUCCES","成功"),
	FREEZED("FREZED","冻结"),
	ALLREF("ALLREF","全部退款"),
	HALFREF("HALREF","部分退款"),
	FAILED("FAILED","失败"),
	//网联状态
	ABNORMAL_SUCCESS("ABNSUC","异常成功"),
	ABNORMAL_FAILED("ABNFAI","异常失败");
	
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
	GatewayRecordStatus(String value, String content) {  
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
	
	/**
	 * 根据value取得Content
	 * @param value
	 * @return Content
	 */
	public static String getContentByValue(String value){
		for(GatewayRecordStatus status : GatewayRecordStatus.values()){
			if (status.getValue().equals(value)){
				return status.getContent();
			}
		}
		return "";
	}
	
}
