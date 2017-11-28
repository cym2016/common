package com.heepay.enums.pcac;

/**
 * *
 * 
 * 
 * 描 述：个人风险类型
 *
 * 创 建 者： wangjie 创建时间： 2017年3月6日下午4:31:16 创建描述：
 * 
 * 修 改 者： 修改时间： 修改描述：
 * 
 * 审 核 者： 审核时间： 审核描述：
 *
 */
public enum PersonalRiskType {

	/**
	 * 01：虚假申请
	 */
	PCAC_XJSQ("01", "虚假申请"),
	/**
	 * 02：虚假申请（嫌疑人信息）
	 */
	PCAC_XJSQXYR("02", "虚假申请(嫌疑人信息)"),
	/**
	 * 03：伪卡（受害人信息）
	 */
	PCAC_WK("03", "伪卡"),
	/**
	 * 04：失窃卡（受害人信息）
	 */
	PCAC_SQK("04", "失窃卡"),
	/**
	 * 05：未达卡（受害人信息）
	 */
	PCAC_WDK("05", "未达卡"),
	/**
	 * 06：银行卡转移（受害人信息）
	 */
	PCAC_YHKZY("06", "银行卡转移"),
	/**
	 * 07：盗用银行卡（嫌疑人信息）
	 */
	PCAC_DYYHK("07", "盗用银行卡"),
	/**
	 * 08：银行卡网络欺诈（受害人信息）
	 */
	PCAC_YHKWLQZSHR("08", "银行卡网络欺诈(受害人信息)"),
	/**
	 * 09：银行卡网络欺诈（嫌疑人信息）
	 */
	PCAC_YHKWLQZXYR("09", "银行卡网络欺诈(嫌疑人信息)"),
	/**
	 * 10：虚拟账户被盗（受害人信息）
	 */
	PCAC_XNZHBD("10", "虚拟账户被盗(受害人信息)"),
	/**
	 * 11：盗用虚拟账户（嫌疑人信息）
	 */
	PCAC_DYXNZH("11", "盗用虚拟账户(嫌疑人信息)"),
	/**
	 * 12：套现、套积分（嫌疑人信息）
	 */
	PCAC_TXTJF("12", "套现、套积分(嫌疑人信息)"),
	/**
	 * 13 ：协助转移赃款
	 */
	PCAC_XZZYZK("13", "协助转移赃款"),
	/**
	 * 14 ：买卖或租借银行（支付）账户
	 */
	PCAC_MMZJYHZH("14", "买卖或租借银行（支付）账户"),
	/**
	 * 15：专案风险信息
	 */
	PCAC_ZAFXXX("15", "专案风险信息"),
	/**
	 * 17:买卖银行卡信息
	 */
	PCAC_MMYYKXX("17", "买卖银行卡信息"),
	/**
	 * 99:其他
	 */
	PCAC_QT("99", "其他");

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
	PersonalRiskType(String value, String content) {
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

	public static PersonalRiskType getBean(String value) {
		for (PersonalRiskType e : PersonalRiskType.values()) {
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
