package com.heepay.enums;


/**
 *
 * 描    述：
 *
 * 创 建 者： 张俊新
 * 创建时间： 2016年9月12日 下午3:30:28
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
 *
 */

public enum MerchantLogColums {

	//balance_amount
	BALANCE_AMOUNT("0","余额"),
	//balance_amount_changes
	BALANCE_AMOUNT_CHANGES("1","账务变化金额"),
	//balance_freezed_amount
	BALANCE_FREEZED_AMOUNT("2","冻结金额"),
	//balance_available_amount
	BALANCE_AVAILABLE_AMOUNT("3","可用金额"),
	//balance_available_withdraw_amount
	BALANCE_AVAILABLE_WITHDRAW_AMOUNT("4","可提现金额"),
	//balance_history_amount
	BALANCE_HISTORY_AMOUNT("5","可提现金额");

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
	MerchantLogColums(String value, String content) {
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
}
