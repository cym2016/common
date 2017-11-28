package com.heepay.enums.risk;

public enum JobStatus {
	
	/**
	 * 未执行
	 */
	PREDO("PREDO", "未执行"),
	/**
	 * 执行中
	 */
	DOING("DOING", "执行中"),
	/**
	 * 成功
	 */
	SUCCES("SUCCES", "成功"),
	/**
	 * 失败
	 */
	FAILED("FAILED", "失败");
	
	
	
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
	JobStatus(String value, String content) {  
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

	public static JobStatus getBean(String value) {
		for (JobStatus e : JobStatus.values()) {
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
