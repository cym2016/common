package com.heepay.enums.pbc;

/**
 * 
 *
 * 描    述：账户交易明细中的账户状态
 *
 * 创 建 者：   wangdong
 * 创建时间：2016年12月26日 下午7:38:36
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
public enum PbcAccountStatus {

	/**
	 * 正常
	 */
	ACCOUNT_STATUS_1("1","正常"),
	/**
	 * 止付
	 */
	ACCOUNT_STATUS_2("2","止付"),
	/**
	 * 只收不付冻结
	 */
	ACCOUNT_STATUS_3("3","只收不付冻结"),
	/**
	 * 金额冻结
	 */
	ACCOUNT_STATUS_4("4","金额冻结"),
	/**
	 * 其他
	 */
	ACCOUNT_STATUS_9("9","其他");
	
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
	PbcAccountStatus(String value, String content) {  
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

	public static PbcAccountStatus getBean(String value) {
		for (PbcAccountStatus e : PbcAccountStatus.values()) {
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
