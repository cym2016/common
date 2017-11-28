package com.heepay.enums.billing;


/**
 * 
 *
 * 描    述：差错表备注显示
 *
 * 创 建 者：   wangdong
 * 创建时间：2016年12月27日 下午1:53:47
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
public enum ErrorStatus {
	
	/**
	 * 未处理
	 */
	ERRORSTATUS_CL("CL","未处理"),
	
	/**
	 * 已补单
	 */
	SETTLESTATUSY("BD","已补单"),
	/**
	 * 已撤单
	 */
	SETTLESTATUSD("CD","已撤单"),
	/**
	 * 金额不一致
	 */
	BDTYPEJ("JE", "金额不一致"),
	
	/**
	 * 未知差异
	 */
	BDTYPEW("WZ,S","未知差异-交易无记录"),
	/**
	 * 其他差异-通道无记录
	 */
	SETTLESTATUSQTY("QT,N","其他差异-通道无记录"),
	/**
	 * 其他差异-通道有记录
	 */
	SETTLESTATUSN("QT,Y","其他差异-通道有记录");
	
	
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
	ErrorStatus(String value, String content) {  
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

	public static ErrorStatus getBean(String value) {
		for (ErrorStatus e : ErrorStatus.values()) {
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