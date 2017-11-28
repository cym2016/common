package com.heepay.enums;


/**
 *
 * 描述：允许登陆的系统类型
 *
 * 创建者  B.HJ
 * 创建时间 2016-12-27-17:00
 * 创建描述：允许登陆的系统类型
 *
 * 审核者：
 * 审核时间：
 * 审核描述：
 *
 * 修改者：
 * 修改时间：
 * 修改内容：
 */
public enum AllowSystemType {
	/**
	 *  tpds01 
	 *  
	 *  资金存管
	 */
	TPDS("tpds01","资金存管"),

	/**
	 * 未知
	 */
	NGP_WEB("ngpweb","商家站点"),
	CROSS_BORDER("cbpays","跨境系统"),
	POS_OFFLINE("offlin","线下系统"),
	HGMS("huigms","汇聚财"),
	AGENT_WEB("agtweb","代理商系统"),
	FINANCIAL("financ","金融系统"),
	WALLET("wallet","钱包系统"),
	MANAGE_WEB("mgeweb","汇付宝后台"),
	TRUSTEE("truste","托管系统");

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
	AllowSystemType(String value, String content) {
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
  
   public static AllowSystemType getBean(String value) {
     for (AllowSystemType e : AllowSystemType.values()) {
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
		for(AllowSystemType certificateType : AllowSystemType.values()){
			if(certificateType.name().equals(type)){
				return true;
			}
		}
		return false;
	}
}
