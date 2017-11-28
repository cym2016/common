package com.heepay.billingutils;


/**
 * 规则控制账单类型
 * @author zc
 *
 */
public enum FileType {
	/**
	 * 未知
	 */
	BRULETYPEE("EXCEL", "EXCEL"),
	BRULETYPET("TXT", "TXT"),
	BRULETYPEC("CSV", "CSV"),
	BRULETYPETXML("xml", "xml"),
	BRULETYPXLSX("xlsx", "xlsx"),
	BRULETYPEO("OTHER", "OTHER");
	
	
	String _value; 
	
	/**
	 * 存放内容
	 */
	String _content;
	
	/**
	 * 私有构造函数
	 * @param value 枚举值
	 * @param content 缓存内容
	 * @return 
	 */
	FileType(String value, String content) {  
		this._value = value;  
		this._content = content;  
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
		return this._content;
	}

	/**
	 * 根据值取得内容
	 * 
	 * @return 内容
	 */

	public static FileType getBean(String value) {
		for (FileType e : FileType.values()) {
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
