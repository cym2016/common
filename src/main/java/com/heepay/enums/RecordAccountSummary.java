package com.heepay.enums;


/**
 *
 * 描    述：金额统计
 *
 * 创 建 者： 张俊新
 * 创建时间： 2016年9月7日 上午10:49:22
 * 创建描述：日、月统计
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
public enum RecordAccountSummary {
	/**
	 * 未知
	 */
	TODAY_SUMMARY("TODAYSUMMARY", "日统计"),
	MONTCH_SUMMARY("MONTCHSUMMARY", "月统计"),
	TODAY_SUMMARYIN_IN("TODAY_SUMMARYIN_IN", "日统计收入"),
	TODAY_SUMMARYIN_OUT("TODAY_SUMMARYIN_OUT", "日统计支出"),
	MONTCH_SUMMARYIN_IN("MONTCH_SUMMARYIN_IN", "月统计收入"),
	MONTCH_SUMMARYIN_OUT("MONTCH_SUMMARYIN_OUT", "月统计支出");

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
	RecordAccountSummary(String value, String content) {
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
	 * 取得缓存内容
	 * @return 缓存内容
	 */
	public String getContent() {
		return this._Content;
	}
	
}
