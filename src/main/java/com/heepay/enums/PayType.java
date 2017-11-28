package com.heepay.enums;



/**          
* 
* 描    述：支付类型
*
* 创 建 者： 刘栋  
* 创建时间： 2016年9月2日 上午10:49:22 
* 创建描述：支付类型（现主要用于充值表的字段）
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
    
public enum PayType {
 
	QUICKPAY("QUICKP","快捷"),
	QUICKPAY2("QUICK2","快捷2"),
	GATEWAYPAY("GATEWY","网银"),
	BATCOL("BATCOL","代收"),
	REFUND("REFUND","退款"),
	BATPAY("BATPAY","代付"),
	WECHATPAY("WECHAT","微信支付"),
	INNERTRANSFER("TRAFER","转账"),
	ALISCAN("ALIPAY","支付宝扫码"),
	UNIONPAY_QRCODE("UPCODE", "银联扫码支付"),	
	REMITS("REMITS","线下汇款"),
	CLEARACNCE_DECLARE("CACNCE", "通关申报"),
	INSTALLMENT("INSTAM", "分期支付"),
	QQWALLETPAY("QQWPAY", "QQ钱包"),
	JDWALLETPAY("JDWPAY", "京东钱包"),
	AGGRTPAY("AGGPAY", "聚合支付");

	/**
	 * 存放内容
	 */
	String _value;
	String _Content;
	
	/**
	 * 私有构造函数
	 * @param value 枚举值
	 * @param content 缓存内容
	 * @return 
	 */
	PayType(String value, String content) {  
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
	
	public static String getContentByValue(String value){
		PayType[] payTypes = PayType.values();
		for(PayType payType : payTypes){
			if(payType.getValue().equals(value)){
				return payType.getContent();
			}
		}
		return "";
	}
	
	
}
