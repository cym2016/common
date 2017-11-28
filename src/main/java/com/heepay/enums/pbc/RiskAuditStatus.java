package com.heepay.enums.pbc;


/**
 * 
 *
 * 描    述：电信诈骗交易处理中的风控审核状态
 *
 * 创 建 者：   wangdong
 * 创建时间：2016年12月14日14:06:02
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
public enum RiskAuditStatus {
	/**
	 * 未处理
	 */
	TQS_N("N", "待处理"),
	/**
	 * 待审核
	 */
	TQS_D("D", "待审核"),
	/**
	 * 审核通过
	 */
	TQS_Y("Y", "审核通过");
	
	
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
	RiskAuditStatus(String value, String content) {  
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

	public static RiskAuditStatus getBean(String value) {
		for (RiskAuditStatus e : RiskAuditStatus.values()) {
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
