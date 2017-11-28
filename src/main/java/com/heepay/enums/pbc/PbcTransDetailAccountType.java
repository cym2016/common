package com.heepay.enums.pbc;

/**
 * 
 *
 * 描    述：账户交易明细中的账户类型
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
public enum PbcTransDetailAccountType {

	/**
	 * 个人一类账户
	 */
	TRANS_DETAIL_ACCOUNT_1("01","个人一类账户"),
	/**
	 * 个人二类账户
	 */
	TRANS_DETAIL_ACCOUNT_2("02","个人二类账户"),
	/**
	 * 个人三类账户
	 */
	TRANS_DETAIL_ACCOUNT_3("03","个人三类账户"),
	/**
	 * 商户类
	 */
	TRANS_DETAIL_ACCOUNT_4("04","商户类"),
	/**
	 * 其他
	 */
	TRANS_DETAIL_ACCOUNT_9("09","其他");
	
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
	PbcTransDetailAccountType(String value, String content) {  
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

	public static PbcTransDetailAccountType getBean(String value) {
		for (PbcTransDetailAccountType e : PbcTransDetailAccountType.values()) {
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
