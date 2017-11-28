package com.heepay.enums.pcac;

/**
 * *
 * 
 * 
 * 描 述：商户风险类型
 *
 * 创 建 者： wangjie 创建时间： 2017年3月6日下午5:04:28 创建描述：
 * 
 * 修 改 者： 修改时间： 修改描述：
 * 
 * 审 核 者： 审核时间： 审核描述：
 *
 */
public enum MerchantRiskType {
	       
	
	/**
	 * 01：虚假申请
	 */
	PCAC_XJSQ("01", "虚假申请"),
	/**
	 * 02 ：套现、套积分
	 */
	PCAC_TXTJF("02", "套现、套积分"),
	/**
	 * 03 ：违法经营
	 */
	PCAC_WFJY("03", "违法经营"),
	/**
	 * 04 ：销赃
	 */
	PCAC_XZ("04", "销赃"),
	/**
	 * 05 ： 买卖或租借银行（支付）账户
	 */
	PCAC_MMZJYHZH("05", "买卖或租借银行（支付）账户"),
	/**
	 * 06 ：侧录点
	 */
	PCAC_CLD("06", "侧录点"),
	/**
	 * 07 ：伪卡集中使用点
	 */
	PCAC_WKJZSYD("07", "伪卡集中使用点"),
	/**
	 * 08 ：泄露账户及交易信息
	 */
	PCAC_XLZHJJYXX("08", "泄露账户及交易信息"),
	/**
	 * 09 ：恶意倒闭
	 */
	PCAC_EYDB("09", "恶意倒闭"),
	/**
	 * 10：恶意分单
	 */
	PCAC_EYFD("10", "恶意分单"),
	/**
	 * 11 ：移机
	 */
	PCAC_YJ("11", "移机"),
	/**
	 * 12 ：高风险商户
	 */
	PCAC_GFXSH("12", "高风险商户"),
	/**
	 * 13 ：商户合谋欺诈
	 */
	PCAC_SHHMQZ("13", "商户合谋欺诈"),
	/**
	 * 14 ：破产或停业商户
	 */
	PCAC_PCTYSH("14", "破产或停业商户"),
	/**
	 * 15 ：强迫签单
	 */
	PCAC_QPQD("15", "强迫签单"),
	/**
	 * 17：频繁变更服务机构
	 */
	PCAC_PFBGFWJG("17", "频繁变更服务机构"),
	/**
	 * 18：关联商户涉险 
	 */
	PCAC_GLSHSX("18", "关联商户涉险"),
	/**
	 * 19：买卖银行卡信息     
	 */
	PCAC_MMYHKXX("19", "买卖银行卡信息"),
	/**
	 * 20：拒刷信用卡  
	 */
	PCAC_JSXYK("20", "拒刷信用卡"),
	/**
	 * 21：转嫁手续费    
	 */
	PCAC_ZJSXF("21", "转嫁手续费"),
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
	MerchantRiskType(String value, String content) {
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

	public static MerchantRiskType getBean(String value) {
		for (MerchantRiskType e : MerchantRiskType.values()) {
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
