package com.heepay.enums;


/**
 * MerchantType 商户类型
 * @author ly
 *
 */
public enum MerchantType {
	/**
	 * 未知
	 */
  ENTERPRISE("ENTERP", "企业"),
  PUBLICINSTITUTION("PUBINS", "事业单位"),
  PRIVATENONENTERPRISEENTITIES("PRIENT", "民办非企业单位"),
  INDIVIDUALBUSINESSES("INDBUS", "个体工商户"),
  SOCIALGROUPS("SOCGRO", "社会团体"),
  PARTYPOLICYSTATEORGANS("PPSORG", "党政及国家机关");

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
	MerchantType(String value, String content) {  
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
  
   public static MerchantType getBean(String value) {
     for (MerchantType e : MerchantType.values()) {
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
		for(MerchantType merchantType : MerchantType.values()){
			if(merchantType.name().equals(type)){
				return true;
			}
		}
		return false;
	}

}
