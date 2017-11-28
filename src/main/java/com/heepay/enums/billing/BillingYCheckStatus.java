package com.heepay.enums.billing;


/**
 * 
 *
 * 描    述：已对账标记
 *
 * 创 建 者：   wangdong
 * 创建时间：2016年10月9日
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
public enum BillingYCheckStatus {
	/**
	 * 平账
	 */
	BCFQSTS("QSTS","平账"),
	/**
	 * 清结算系统失败，上游通道成功
	 */
	BCFQFTS("QFTS","清结算系统失败，上游通道成功"),
	/**
	 * 清结算系统成功，上游通道失败
	 */
	BCFQSTF("QSTF","清结算系统成功，上游通道失败"),
	/**
	 * 清结算系统与上游金额不一致
	 */
	BCFQMTM("QMTM","清结算系统与上游金额不一致"),
	/**
	 * 清结算系统内部金额不一致
	 */
	BCFQMQM("QMQM","清结算系统内部金额不一致"),
	/**
	 * 其他
	 */
	BCFQMQT("QSQT","其他"),
	/**
	 * 未知
	 */
	BDTYPEW("QSWZ","未知");
	
	
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
	BillingYCheckStatus(String value, String content) {  
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

	public static BillingYCheckStatus getBean(String value) {
		for (BillingYCheckStatus e : BillingYCheckStatus.values()) {
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
