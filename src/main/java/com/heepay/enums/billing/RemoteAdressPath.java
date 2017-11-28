package com.heepay.enums.billing;


/**
 * 文件下载的方式
 * @author wangl
 * @时间：2016年9月23日14:27:03
 */
public enum RemoteAdressPath {
	/**
	 * ftp
	 */
	FTP("ftp","ftp"),
	/**
	 * sftp
	 */
	SFTP("sftp","sftp");
	
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
	RemoteAdressPath(String value, String content) {  
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

	public static RemoteAdressPath getBean(String value) {
		for (RemoteAdressPath e : RemoteAdressPath.values()) {
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
