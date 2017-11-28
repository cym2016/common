package com.heepay.enums;


/**
 * CertificateType 证件类型
 * @author ly
 *
 */
public enum CertificateType {
	/**
	 * 未知
	 */
  ORDINARY("ORDINA","普通证件"),
  MULTIPLE("MULTIP","多证合一"),
  INDIVIDUAL("INDIVI","个体商户");

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
	CertificateType(String value, String content) {  
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
  
   public static CertificateType getBean(String value) {
     for (CertificateType e : CertificateType.values()) {
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

	//查看是否存在某值
	public static boolean contains(String type){
		for(CertificateType certificateType : CertificateType.values()){
			if(certificateType.name().equals(type)){
				return true;
			}
		}
		return false;
	}
}
