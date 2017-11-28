/**
 * 
 */
package com.heepay.enums.pcac;

/**
 * @author Administrator
 *
 */
public enum PcacReportOpStatus {
	
	/**
	 * 未知'01:待审核，02审核通过未上报，03审核拒绝，04审核通过已上报,05审核通过上报失败',06上报删除
	 */
	READY_SYNDIC("01", "待审核"), 
	PASS_SYNDIC("02", "审核通过未上报"), 
	NOPASS_SYNDIC("03", "审核拒绝"),
	PASS_SYNDIC_REPORTSUC("04", "审核通过已上报"),
	PASS_SYNDIC_REPORTFAIL("05", "审核通过上报失败"),
    DELETE_REPORT("06" , "上报删除");
	String _value;

	/**
	 * 存放内容
	 */
	String _Content;

	/**
	 * 私有构造函数
	 * 
	 * @param value
	 *            枚举值
	 * @param content
	 *            缓存内容
	 * @return
	 */
	PcacReportOpStatus(String value, String content) {
		this._value = value;
		this._Content = content;
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
		return this._Content;
	}

	/**
	 * 根据值取得内容
	 * 
	 * @return 内容
	 */

	public static PcacReportOpStatus getBean(String value) {
		for (PcacReportOpStatus e : PcacReportOpStatus.values()) {
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
