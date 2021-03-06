package com.heepay.enums.pbc;

/**
 * *
 * 
* 
* 描    述： 措施类型
*
* 创 建 者： wangdong
* 创建时间：  2016年12月13日下午4:27:48
* 创建描述：
* 
* 修 改 者：  
* 修改时间： 
* 修改描述： 
* 
* 审 核 者：
* 审核时间：
* 审核描述：
*
 */
public enum PbcMeasureType {
	
	/**
	 * 只收不付
	 */
	MEASURE_TYPE_1("1","只收不付"),
	/**
	 * 不收不付
	 */
	MEASURE_TYPE_2("2","不收不付"),
	/**
	 * 限额冻结
	 */
	MEASURE_TYPE_3("3","限额冻结"),
	/**
	 * 其他
	 */
	MEASURE_TYPE_9("9","其他");
	
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
	PbcMeasureType(String value, String content) {  
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

	public static PbcMeasureType getBean(String value) {
		for (PbcMeasureType e : PbcMeasureType.values()) {
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
