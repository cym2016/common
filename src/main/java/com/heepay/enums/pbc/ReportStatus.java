package com.heepay.enums.pbc;

/**
 * *
 * 
 * 
 * 描 述：上报状态
 *
 * 创 建 者： wangjie 创建时间： 2016年12月16日下午8:38:11 创建描述：
 * 
 * 修 改 者： 修改时间： 修改描述：
 * 
 * 审 核 者： 审核时间： 审核描述：
 *
 */
public enum ReportStatus {

	/**
	 * 上报成功
	 */
	SUCCESE_S("S", "上报成功"),
	/**
	 * 未上报
	 */
	NOREPORTED("N", "未上报"),
	
	
	/**
	 * 上报失败
	 */
	FREPORTED("F", "上报失败");

	String _value;

	/**
	 * 存放内容
	 */
	String _content;

	/**
	 * 私有构造函数
	 * 
	 * @param value
	 *            枚举值
	 * @param content
	 *            缓存内容
	 * @return
	 */
	ReportStatus(String value, String content) {
		this._value = value;
		this._content = content;
	}

	/**
	 * 取得枚举对象值
	 * 
	 * @return 枚举对象值
	 */
	public String getValue() {
		return this._value;
	}

	/**
	 * 取得内容
	 * 
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

	public static ReportStatus getBean(String value) {
		for (ReportStatus e : ReportStatus.values()) {
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
