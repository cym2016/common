package com.heepay.enums;

import com.heepay.common.util.StringUtil;

/**
 * 产品类型
 * @author zc
 *
 */
public enum ProductType {
	/**
	 * 未知
	 */
	CHARGE("CP01", "充值"),
	BATCHPAY("CP02", "转账"),
	BATCHCOLLECTION("CP03", "代收"),
	REFUND("CP04", "退款"),
	WITHDRAW("CP05", "提现"),
	QUICKPAYAPI("CP06", "快捷支付—API"),
	QUICKPAYH5("CP07", "快捷支付—H5"),
	QUICKPAYPC("CP08", "快捷支付—PC"),
	QUICKPAYSDK("CP09", "快捷支付—SDK"),
	B2CEBANKAPI("CP10", "B2C网银支付—API"),
	B2CEBANKH5("CP11", "B2C网银支付—H5"),
	B2CEBANKPC("CP12", "B2C网银支付—PC"),
	B2CEBANKSDK("CP13", "B2C网银支付—SDK"),
	B2BEBANK("CP14", "B2B网银支付"),
	REALNAMEAUTH("CP15", "实名认证"),
	SHARES("CP16", "分润"),
	PLAYMONEY("CP17", "打款认证"),
	XYDXWECHATPAY("CP18", "兴业微信公众号支付"),
	XYDXWECHATPAYTX("CP19", "兴业微信公众号支付T+X结算"),

	DEPOSIT_QUICKPAY("CP21", "存管快捷支付"),
	DEPOSIT_GATEWAYPAY("CP22", "存管网银支付"),
	DEPOSIT_WITHDRAW("CP23", "存管提现"),
	QUICKPAY2API("CP24", "快捷支付2—API"),
	ENTERPRISES_CERTIFICATION("CP25", "企业认证"),
	AUTHENTICATION("CP26", "四要素鉴权"),
	WECHAT_SCANCODE("CP27", "微信扫码"),
	OBLINEBANK_TEST("CP28", "网银测试"),
	AILIPAY_SCANCODE("CP29", "支付宝扫码"),
	UNIONPAY_ACTIVE_SCANCODE("CP30", "银联主扫"),
	UNIONPAY_INACTIVE_SCANCODE("CP31", "银联被扫"),
	REMITS_CHARGE("CP32","汇款充值"),
	HUIJC_DUT("CP33","汇聚财代扣"),
	HUIJC_PAY("CP34","汇聚财代付"),
	HUIJC_ACCOUNT_DUT("CP35","汇聚财账户代扣"),
	HUIJC_ACCOUNT_PAY("CP36","汇聚财账户代付"),
	
	INNERTRANSFER("CP37", "内部转账"),
	WECHAT_PUB("CP39", "微信公众号"),
	WECHAT_H5("CP40", "微信H5"),
	ALIPAY_WAP("CP41", "支付宝WAP"),	
	
	WALLET_QUERY("CP38","电子钱包查询服务"),
	WALLET_PAY("CP42","电子钱包支付消费"),
	WALLET_CHARGE("CP43","电子钱包充值"),
	WALLET_WITHDRAW("CP44","电子钱包提现"),
	WALLET_TRANSFER("CP45","电子钱包转账"),
	WALLET_REFUND("CP46","电子钱包退款"),
	WALLET_BINDCARD("CP47","电子钱包绑卡"),
	WALLET_REG("CP48","电子钱包用户注册"),
	WALLET_UNIONPAY_ACTIVE_SCANCODE("CP63","电子钱包银联主扫"),
	WALLET_COUPON("CP64","电子钱包优惠券"),
	
	QUICKPAY2_REFUND("CP49", "快捷支付2退款"),

	//新增鉴权类产品
	MOBILE_NO_AUTH("CP50", "手机运营商认证"),
	THREE_AUTH("CP51", "三要素鉴权"),
	TWO_AUTH("CP52", "二要素鉴权"),
	INSTALLMENT("CP53", "分期支付"),
	WALLET_QUICKPAY2("CP54","电子钱包快捷支付2"),
	ENTRUSTED_COLLECTION("CP55", "委托代扣"),
	WALLET_FREEZE("CP56","电子钱包余额冻结"),
	WALLET_SETTLEMENT("CP57","电子钱包交易结算"),

	WALLET_REDPACKET("CP59","电子钱包红包业务"),

	KAOLA_MOBILE_AUTH("CP61","考拉手机认证"),
	SUBSCRIBE_COLLECTION("CP62","订阅支付"),
	//个人产品
	PERSONAL_CHARGE("GRCZ", "个人充值"),
	PERSONAL_WITHDRAW("GRTX", "个人提现"),
	PERSONAL_BINDINGCARD("GRBK", "个人绑卡"),
	
	//聚合-QQ钱包  京东钱包
	QQ_QR("CP65", "QQ钱包"),
	JD_QR("CP66", "京东钱包");


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
	ProductType(String value, String content) {  
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
	
	/**
	 * 根据值取得内容
	 * 
	 * @return 内容
	 */
	public static ProductType getBean(String value) {
		for (ProductType e : ProductType.values()) {
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
	
	public static String getContentByValue(String value){
		if(StringUtil.isBlank(value)){
			return "";
		}
		ProductType[] types = ProductType.values();
		for(ProductType type:types){
			if(value.equals(type.getValue())){
				return type.getContent();
			}
		}
		return "";
		
	}
	
	/**     
	* @description 获取手续费配置时，是否需要银行ID和卡类型
	* @author 刘栋       
	* @created 2016年10月18日 下午10:37:58     
	* @param productCode
	* @return     
	*/
	public static boolean needBankIdAndCardType(String productCode){
		if(CHARGE.getValue().equals(productCode)){
			return false;
		} else if(WITHDRAW.getValue().equals(productCode)){
			return false;
		} else if(REALNAMEAUTH.getValue().equals(productCode)){
			return false;
		} else {
			return true;
		}
	}
	
}
