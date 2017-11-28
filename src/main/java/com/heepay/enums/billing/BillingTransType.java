package com.heepay.enums.billing;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 
 *
 * 描 述：根据交易系统的交易类型整理出不需要的交易类型
 *
 * 创 建 者： wangdong 创建时间：2017年1月6日 下午2:44:10 创建描述：
 *
 * 修 改 者： 修改时间： 修改描述：
 *
 * 审 核 者： 审核时间： 审核描述：
 *
 */
public enum BillingTransType {
	/**
	 * 未知
	 */
//	UNKNOWNED("UNKNOW", "未知"), 
	CHARGE("CHARGE", "充值"), 
	WITHDRAW("WZDRAW", "提现"), 
	REFUND("REFUND", "退款"), 
	PAY("PAYMNT", "支付"), // 包括快捷支付和银行网关支付,消费,兴业点芯等
//	TRANSFER("TRAFER", "内转"), 
	BATCHPAY("BATPAY", "转账"), 
//	BATCHCOLLECTION("BATCOL", "代收"), 
	SHARE("SHARES","分润"), 
	PLAY_MONEY("PMONEY", "打款认证"), 
//	WECHAT("WECHAT", "微信支付"), 
	REAL_NAME("RENAME", "实名认证"),
	DEPOSIT_PAY("DPTPAY", "存管充值"),
    DEPOSIT_WITHDRAW("DPTWZD", "存管提现");

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
	BillingTransType(String value, String content) {
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
	 * 
	 * @description 根据value获取content,用于页面显示
	 * @author TianYanqing
	 * @created 2016年9月23日 下午12:02:11
	 * @param value
	 * @return
	 */
	public static String getContentByValue(String value) {
		BillingTransType[] types = BillingTransType.values();
		String content = "";
		for (BillingTransType type : types) {
			if (type.getValue().equals(value)) {
				content = type.getContent();
				break;
			}
		}
		return content;
	}

	/**
	 * 查看是否包含参数值
	 * 
	 * @param value
	 * @return
	 */
	public static Map<String, String> transTypeMap() {
		Map<String, String> map = new LinkedHashMap<String, String>();
		for (BillingTransType transType : BillingTransType.values()) {
			if (!"PMONEY".equals(transType.getValue()) && !"WECHAT".equals(transType.getValue())) {
				map.put(transType.getValue(), transType.getContent());
			}
		}
		return map;
	}

	/**
	 * 根据值取得内容
	 * 
	 * @return 内容
	 */
	public static BillingTransType getBean(String value) {
		for (BillingTransType e : BillingTransType.values()) {
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
