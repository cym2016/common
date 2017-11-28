package com.heepay.enums;


/**
 *
 * 描述：上传证件照片的类型
 *
 * 创建者  B.HJ
 * 创建时间 2016-12-22-11:30
 * 创建描述：上传证件照片的类型
 *
 * 审核者：
 * 审核时间：
 * 审核描述：
 *
 * 修改者：
 * 修改时间：
 * 修改内容：
 */
public enum ImageType {
	/**
	 * 未知
	 */
	PERMITS_ACCOUNTS("permits_accounts","开户许可证"),
	LEGAL_CERTIFICATE_FRONT("legal_certificate_front","法人代表证件照(正)"),
	LEGAL_CERTIFICATE_BACK("legal_certificate_back","法人代表证件照(反)"),
	CONTACTOR_CERTIFICATE_FRONT("contactor_certificate_front","法人代表证件照(正)"),
	CONTACTOR_CERTIFICATE_BACK("contactor_certificate_back","法人代表证件照(反)"),
	TAX_REGISTRATION_CERTIFICATE("tax_registration_certificate","税务登记证"),
	ORGANIZATION_CODE_CERTIFICATE("organization_code_certificate","组织机构代码证"),
	AUTHORIZATION_LETTER("authorization_letter","委托授权书"),
	BUSINESS_LICENSE_FILE("business_license_file","营业执照");

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
	ImageType(String value, String content) {
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
  
   public static ImageType getBean(String value) {
     for (ImageType e : ImageType.values()) {
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
		for(ImageType certificateType : ImageType.values()){
			if(certificateType.name().equals(type)){
				return true;
			}
		}
		return false;
	}
}
