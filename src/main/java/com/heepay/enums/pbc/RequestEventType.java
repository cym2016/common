package com.heepay.enums.pbc;
/**
 * 
 *
 * 描    述：请求事件类型
 *
 * 创 建 者：   wangdong
 * 创建时间：2016年12月10日 下午3:08:50
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
public enum RequestEventType {
	/**
	 * 账户交易明细查询
	 */
	CASE_REPORT("ACCOUNTRANSDETAIL","账户交易明细查询"),
	/**
	 * 账户主体详情查询
	 */
	ABNORMAL_ACCOUNTS("ACCOUNTSUBJECTDETAIL","账户主体详情查询"),
	/**
	 * 账户动态查询
	 */
	ACCOUNTS_INVOLVED("ACCOUNTDYNAMIC","账户动态查询"),
	/**
	 * 账户动态查询解除
	 */
	EXCEPTION_EVENTS("ACCOUNTDYNAMICREMOVE","账户动态查询解除"),
	/**
	 * 关联全支付账号查询
	 */
	PAYMENY_ACCOUNT("PAYMENYACCOUNT","关联全支付账号查询"),
	
	/**
	 * 按交易流水号查询银行卡/支付帐号
	 */
	TRANSNO_ACCOUNT("TRANSNOACCOUNT","按交易流水号查询银行卡/支付帐号");
	
	
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
	RequestEventType(String value, String content) {  
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

	public static RequestEventType getBean(String value) {
		for (RequestEventType e : RequestEventType.values()) {
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
