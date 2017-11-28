package com.heepay.enums;


/**
 * 账户申请状态
 * @author 王亚洪
 *
 */
public enum MerchantTransferStatus {

  AUDING("AUDING", "未审核"),
  REVOKE("REVOKE", "已撤销"),
  REFUSE("REFUSE", "审核拒绝"),
  ADOPT("ADOPT", "审核通过");

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
	MerchantTransferStatus(String value, String content) {
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
  
   public static String labelOf(String value) {
     for (MerchantTransferStatus e : MerchantTransferStatus.values()) {
       if (value.equals(e.getValue())) {
         return e.getContent();
       }
     }
     return null;
   }
	
	
}
