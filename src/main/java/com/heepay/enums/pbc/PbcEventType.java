package com.heepay.enums.pbc;

/**
 * 
 *
 * 描    述：上报事件类型
 *
 * 创 建 者：   wangdong
 * 创建时间：2016年12月9日 下午6:03:47
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
public enum PbcEventType {

	/**
	 * 案件举报
	 */
	CASE_REPORT("CASEREPORT","案件举报"),
	/**
	 * 可疑名单上报-异常消费支付账户
	 */
	ABNORMAL_ACCOUNTS("ABNORMALACCOUNTS","可疑名单上报-异常消费支付账户"),
	/**
	 * 可疑名单上报-涉案账户
	 */
	ACCOUNTS_INVOLVED("ACCOUNTSINVOLVED","可疑名单上报-涉案账户"),
	/**
	 * 可疑名单上报-涉案账户历史明细
	 */
	EXCEPTION_EVENTS("EXCEPTIONEVENTS","可疑名单上报-涉案账户历史明细"),
	
	
	/**
	 * 可疑名单上报-单笔交易
	 */
	SINGLE_TRANSATION("SEXCEPTIONEVENT","可疑名单上报-单笔交易"),
	
	
	/**
	 * 账户涉案/可疑名单验证
	 */
	VERIFY_ACCOUNT("VERIFYACCOUNT","账户涉案/可疑名单验证"),
	/**
	 * 身份涉案/可疑名单验证
	 */
	IDENTITY_ACCOUNT("IDENTITYACCOUNT","身份涉案/可疑名单验证");
	
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
	PbcEventType(String value, String content) {  
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

	public static PbcEventType getBean(String value) {
		for (PbcEventType e : PbcEventType.values()) {
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
