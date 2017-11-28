package com.heepay.enums;


/**
 * AccountMark 记账标识
 * @author ZhangJunxin
 *
 */
public enum AccountMark {
	/**
	 * 未知
	 */
	PAY_DAY_TIME("101","消费日间"),
	PAY_DAY_END("102","消费商户日终"),
	PAY_GEWAY_DAY_END("103","消费通道日终"),
	PAY_REVOKE("104","消费撤账"),
	PAY_HANDIN("105","消费挂账"),
	PAY_HANDIN_REVOKE("106","消费挂账抹账"),
	PAY_LONG_SUPPLEMENT_MERCHANT("107","消费长款补商户账"),
	PAY_LONG_SUPPLEMENT_CHNANEL("108","消费长款补通道账"),
	PAY_EXDEDU_FEE("109","消费外扣手续费"),
	PAY_TX_MANUAL_SETTLE_ACCOUNT("110","消费TX到手动结算户"),
	PAY_HANDIN_REVOKE_MERCHANT("111","消费挂账T0撤商户账"),
	PAY_HANDIN_REVOKE_SETTLE("112","消费挂账T1撤待结算账"),
	PAY_HANDIN_SPL_MERCHANT("113","消费挂账补商户账"),
	PAY_HANDIN_SPL_CHANNEL("114","消费挂账补通道账"),

	PAY_UPCODE_DAY_TIME("111","银联扫码日间"),
	PAY_UPCODE_DAY_END("112","银联扫码商户日终"),
	PAY_UPCODE_GEWAY_DAY_END("113","银联扫码通道日终"),

	BATCHPAY_STEP_FIRST("201","转账阶段一"),
	BATCHPAY_STEP_SECOND("202","转账阶段二"),
	BATCHPAY_REVOKE("203","转账撤账"),
	BATCHPAY_HANDOUT("204","转账挂账"),
	BATCHPAY_HANDOUT_REVOKE("205","转账挂账抹账"),
	BATCHPAY_SHORT_REVOKE_MERCHANT("206","转账短款撤商户账"),
	BATCHPAY_LONG_REVOKE_CHANNEL("207","转账长款补通道账"),
	BATCHPAY_SHORT_REVIEW_REVOKE_CHANNEL("208","转账短款审核补通道账"),
	BATCHPAY_GJ_STEP_FIRST("209","归集账户转账阶段一"),
	OPEN_WALLET_USER_BATCHPAY("210","用户转账"),
	BATCHPAY_HANDOUT_SPL_MERCHANT("211","转账挂账补商户账"),
	BATCHPAY_HANDOUT_SPL_CHANNEL("212","转账挂账补通道账"),

	CHARGE_DAY_TIME("301","充值日间"),
	CHARGE_GEWAY_DAY_END("302","充值通道日终"),
	CHARGE_REVOKE("303","充值撤账"),
	CHARGE_HANDIN("304","充值挂账"),
	CHARGE_HANDIN_REVOKE("305","充值挂账抹账"),
	CHARGE_LONG_SUPPLEMENT_MERCHANT("306","充值长款补商户账"),
	CHARGE_LONG_SUPPLEMENT_CHANNEL("307","充值长款补通道账"),
	CHARGE_SHORT_REVOKE("308","充值短款撤账"),
	QUICK_REMITS_DAY_TIME("309","快汇"),
	QUICK_REMITS_GJ_DAY_TIME("310","归集快汇"),
	OPEN_WALLET_USER_CHARGE_DAY_TIME("311","钱包充值"),
	CHARGE_HANDIN_REVOKE_MERCHANT("313","充值挂账撤商户账"),
	CHARGE_HANDIN_REVOKE_CHANEAL("314","充值挂账补通道账"),

	BATCOL_DAY_TIME("350","代收日间"),
	BATCOL_MERCHANT_DAY_END("351","代收商户日终"),
	BATCOL_GJ_MERCHANT_DAY_END("352","代收商户归集日终"),
	BATCOL_GEWAY_DAY_END("353","代收通道日终"),
	BATCOL_LONG_SUPPLEMENT_MERCHANT("354","代收长款补商户账"),
	BATCOL_LONG_SUPPLEMENT_CHNANEL("355","代收长款补通道账"),
	BATCOL_HANDIN("356","代收挂账"),
	BATCOL_HANDIN_REVOKE_MERCHANT("357", "代收挂账T0撤商户账"),
	BATCOL_HANDIN_REVOKE_SETTLE("358", "代收挂账T1撤待结算账"),
	BATCOL_HANDIN_SPL_MERCHANT("359", "代收挂账补商户账"),
	BATCOL_HANDIN_SPL_CHANNEL("360", "代收挂账补通道账"),
	BATCOL_HANDOUT_REVOKE("361","代收挂账抹账"),

	WITHDRAW_STEP_FIRST("401","提现阶段一"),
	WITHDRAW_STEP_SECOND("402","提现阶段二"),
	WITHDRAW_REVOKE("403","提现撤账"),
	WITHDRAW_HANDOUT("404","提现挂账"),
	WITHDRAW_HANDOUT_REVOKE("405","提现挂账抹账"),
	WITHDRAW_SHORT_REVOKE_MERCHANT("406","提现短款撤商户账"),
	WITHDRAW_LONG_REVOKE_CHANNEL("407","提现长款补通道账"),
	WITHDRAW_SHORT_REVIEW_REVOKE_CHANNEL("408","提现短款审核补通道账"),
	OPEN_WALLET_USER_WITHDRAW("409","用户提现"),
	WITHDRAW_HANDOUT_SPL_MERCHANT("410","提现挂账补商户账"),
	WITHDRAW_HANDOUT_SPL_CHANNEL("411","提现挂账补通道账"),

	REFUND_STEP_FIRST("501","充值退款阶段一"),
	REFUND_STEP_SECOND("502","充值退款阶段二"),
	REFUND_REVOKE("503","退款撤账"),
	REFUND_HANDOUT("504","退款挂账"),
	REFUND_HANDOUT_REVOKE("505","退款挂账抹账"),
	REFUND_SHORT_REVOKE_MERCHANT("506","退款短款撤商户账"),
	REFUND_LONG_REVOKE_CHANNEL("507","退款长款补通道账"),
	REFUND_SHORT_REVIEW_REVOKE_CHANNEL("508","退款短款审核补通道账"),
	REFUND_LONG_SUPPLEMENT_DIFF_STEP1("509","消费退款阶段一"),
	REFUND_LONG_SUPPLEMENT_DIFF_STEP2("510","消费退款阶段二"),
	OPEN_WALLET_USER_CHARGE_REFUND("511","个人退款"),

	REFUND_HANDOUT_SPL_MERCHANT("512","退款挂账补商户账"),
	REFUND_HANDOUT_SPL_CHANNEL("513","退款挂账补通道账"),

	TRANSFER("601","内转"),
	TRANSFER_PM_TO_PM("602","个人/商户-个人/商户"),
	TRANSFER_PM_TO_C("603","个人/商户-归集"),
	TRANSFER_C_TO_PM("604","归集-个人/商户"),
	TRANSFER_SIGN("605","签约内转"),

	TRANSFER_QUALIFICATION("701","打款认证"),
	TRANSFER_QUALIFICATION_REVOKE("702","打款认证撤账"),
	TRANSFER_QUALIFICATION_HANDOUT("703","打款认证挂账"),

	SHARES_DAY_TIME("801","分润日间"),
	SHARES_DAY_END("802","分润日终"),
	SHARES_REVOKE("803","分润撤账"),
	SHARES_MERCHANT_SETTLE("804","分润商户结算"),

	REAL_NAME_AUTHENTICATION("901","实名认证"),
	REAL_NAME_AUTHENTICATION_REVOKE("902","实名认证撤账"),
	REAL_NAME_AUTHENTICATION_HANDIN("903","实名认证挂账"),

	ENTERPRISE_AUTHENTICATION("911","企业认证"),
	ENTERPRISE_AUTHENTICATION_REVOKE("912","企业认证撤账"),
	ENTERPRISE_AUTHENTICATION_HANDIN("913","企业认证挂账"),

  FROZEN_ACCOUNT_AMOUNT("f01", "冻结账户余额"),
  THAW_ACCOUNT_AMOUNT("f02", "解冻账户余额"),

	WECHAT_DAY_TIME("w01","微信日间"),
	WECHAT_DAY_END("w02","微信商户日终"),
	WECHAT_GEWAY_DAY_END("w03","微信通道日终"),

	ALLOCATION("d01","调拨"),

	ADJUST("t01","调账"),

	FEE("fe1","手续费"),
	FEE_REVOKE("fe2","撤手续费"),
	FEE_USER("fe3","用户手续费"),

	CBPAYS_FEE("k01","跨境扣手续费"),
	CBPAYS_FEE_REVOKE("k02","跨境手续费撤账"),

	DP_DAY_TIME("cg1","存管日间"),
	DP_DAY_END("cg2","存管商户日终"),
	DP_GEWAY_DAY_END("cg3","存管通道日终"),
	DP_OUT("cg4","存管出款"),
	DP_OUT_STEP1("cg4", "存管出款阶段一"),
	DP_OUT_STEP2("cg5", "存管出款阶段二"),
	DP_LONG_SUPPLEMENT_MERCHANT("cg6", "存管长款补商户账"),
	DP_LONG_SUPPLEMENT_CHANNEL("cg7", "存管长款补通道"),
	DP_WITHDRAW_REVOKE("cg8", "存管出款撤账"),

	AUTHENTICATION_FEE("jq1", "鉴权商户手续费"),
	AUTHENTICATION_PASSAGEWAY("jq2", "鉴权通道手续费"),
	AUTHENTICATION("jq3", "鉴权认证"),
	AUTH_SEAL_MERCHANT("qz1", "电子签章用户手续费"),
	AUTH_SEAL_PASSAGEWAY("qz2", "电子签章通道手续费"),
	MOBILE_AUTH_FEE("mb1", "三要素商户手续费"),
	MOBILE_AUTH_PASSAGEWAY("mb2", "三要素通道手续费"),
	MOBILE_AUTH("mb3", "三要素认证"),

	WALLET_PAY_TX("wlt100","钱包TX手动结算"),
	WALLET_PAY_TX_SETTLE("wlt101","钱包TX结算"),
	//红包
	RED_PACKAGE_SEND("rdp101","发红包"),
	RED_PACKAGE_OPEN("rdp102","开红包"),
	RED_PACKAGE_REFUND("rdp103","退红包");

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
	AccountMark(String value, String content) {
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

	public static String getOutLongSupplementChannelCodeByTransType(String transType){
		if(TransType.WITHDRAW.getValue().equals(transType)){
			return AccountMark.WITHDRAW_LONG_REVOKE_CHANNEL.getValue();
		}
		if(TransType.BATCHPAY.getValue().equals(transType)){
			return AccountMark.BATCHPAY_LONG_REVOKE_CHANNEL.getValue();
		}
		if(TransType.REFUND.getValue().equals(transType)){
			return AccountMark.REFUND_LONG_REVOKE_CHANNEL.getValue();
		}
		return "";
	}

	public static String getOutShortRevokeCodeByTransType(String transType){
		if(TransType.WITHDRAW.getValue().equals(transType)){
			return AccountMark.WITHDRAW_SHORT_REVOKE_MERCHANT.getValue();
		}
		if(TransType.BATCHPAY.getValue().equals(transType)){
			return AccountMark.BATCHPAY_SHORT_REVOKE_MERCHANT.getValue();
		}
		if(TransType.REFUND.getValue().equals(transType)){
			return AccountMark.REFUND_SHORT_REVOKE_MERCHANT.getValue();
		}
		return "";
	}

	public static String getOutShortReviewCodeByTransType(String transType){
		if(TransType.WITHDRAW.getValue().equals(transType)){
			return AccountMark.WITHDRAW_SHORT_REVIEW_REVOKE_CHANNEL.getValue();
		}
		if(TransType.BATCHPAY.getValue().equals(transType)){
			return AccountMark.BATCHPAY_SHORT_REVIEW_REVOKE_CHANNEL.getValue();
		}
		if(TransType.REFUND.getValue().equals(transType)){
			return AccountMark.REFUND_SHORT_REVIEW_REVOKE_CHANNEL.getValue();
		}
		return "";
	}


	/**
	 *
	 * @param transType
	 * @return
	 */
	public static String getHangInCodeByTransType(String transType){
		if(TransType.CHARGE.getValue().equals(transType)){
			return AccountMark.CHARGE_HANDIN.getValue();
		}
		if(TransType.PAY.getValue().equals(transType)){
			return AccountMark.PAY_HANDIN.getValue();
		}
		if(TransType.BATCHCOLLECTION.getValue().equals(transType)){
			return AccountMark.BATCOL_HANDIN.getValue();
		}
		if(TransType.WITHDRAW.getValue().equals(transType)){
			return AccountMark.WITHDRAW_HANDOUT.getValue();
		}
		if(TransType.BATCHPAY.getValue().equals(transType)){
			return AccountMark.BATCHPAY_HANDOUT.getValue();
		}
		if(TransType.REFUND.getValue().equals(transType)){
			return AccountMark.REFUND_HANDOUT.getValue();
		}
		return "";
	}

	/**
	 *
	 * @param transType
	 * @return
	 */
	public static String getClearHangCodeByTransType(String transType){
		if(TransType.PAY.getValue().equals(transType)){
			return AccountMark.PAY_HANDIN_REVOKE.getValue();
		}
		if(TransType.BATCHCOLLECTION.getValue().equals(transType)){
			return AccountMark.BATCOL_HANDOUT_REVOKE.getValue();
		}
		if(TransType.CHARGE.getValue().equals(transType)){
			return AccountMark.CHARGE_HANDIN_REVOKE.getValue();
		}
		if(TransType.WITHDRAW.getValue().equals(transType)){
			return AccountMark.WITHDRAW_HANDOUT_REVOKE.getValue();
		}
		if(TransType.BATCHPAY.getValue().equals(transType)){
			return AccountMark.BATCHPAY_HANDOUT_REVOKE.getValue();
		}
		if(TransType.REFUND.getValue().equals(transType)){
			return AccountMark.REFUND_HANDOUT_REVOKE.getValue();
		}
		return "";
	}

	/**
	 *
	 * @param transType
	 * @return
	 */
	public static String getHangOutCodeByTransType(String transType){
		if(TransType.WITHDRAW.getValue().equals(transType)){
			return AccountMark.WITHDRAW_HANDOUT.getValue();
		}
		if(TransType.BATCHPAY.getValue().equals(transType)){
			return AccountMark.BATCHPAY_HANDOUT.getValue();
		}
		if(TransType.REFUND.getValue().equals(transType)){
			return AccountMark.REFUND_HANDOUT.getValue();
		}
		if(TransType.PLAY_MONEY.getValue().equals(transType)){
			return AccountMark.TRANSFER_QUALIFICATION_HANDOUT.getValue();
		}
		return "";
	}

	public static String getSettleCodeByTransType(String transType){
		if(TransType.CHARGE.getValue().equals(transType)){
			return AccountMark.CHARGE_GEWAY_DAY_END.getValue();
		}
		if(TransType.PAY.getValue().equals(transType)){
			return AccountMark.PAY_GEWAY_DAY_END.getValue();
		}
		if(TransType.WECHAT.getValue().equals(transType)){
			return AccountMark.WECHAT_GEWAY_DAY_END.getValue();
		}
		if(TransType.DEPOSIT_PAY.getValue().equals(transType)){
			return AccountMark.DP_GEWAY_DAY_END.getValue();
		}
		if(TransType.BATCHCOLLECTION.getValue().equals(transType)){
			return AccountMark.BATCOL_GEWAY_DAY_END.getValue();
		}
		if(TransType.UNIONPAY_QRCODE.getValue().equals(transType)){
			return AccountMark.PAY_GEWAY_DAY_END.getValue();
		}
		return "";
	}

	public static String getSettleCodeDayTimeByTransType(String transType){
		if(TransType.PAY.getValue().equals(transType)){
			return AccountMark.PAY_DAY_TIME.getValue();
		}
		if(TransType.WECHAT.getValue().equals(transType)){
			return AccountMark.WECHAT_DAY_TIME.getValue();
		}
		if(TransType.DEPOSIT_PAY.getValue().equals(transType)){
			return AccountMark.DP_DAY_TIME.getValue();
		}
		if(TransType.BATCHCOLLECTION.getValue().equals(transType)){
			return AccountMark.BATCOL_DAY_TIME.getValue();
		}
		if(TransType.UNIONPAY_QRCODE.getValue().equals(transType)){
			return AccountMark.PAY_UPCODE_DAY_TIME.getValue();
		}
		return "";
	}

	public static String getSettleCodeMerchantByTransType(String transType){
		if(TransType.WECHAT.getValue().equals(transType)){
			return AccountMark.WECHAT_DAY_END.getValue();
		}
		if(TransType.PAY.getValue().equals(transType)){
			return AccountMark.PAY_DAY_END.getValue();
		}
		if(TransType.DEPOSIT_PAY.getValue().equals(transType)){
			return AccountMark.DP_DAY_END.getValue();
		}
		if(TransType.BATCHCOLLECTION.getValue().equals(transType)){
			return AccountMark.BATCOL_MERCHANT_DAY_END.getValue();
		}
		if(TransType.UNIONPAY_QRCODE.getValue().equals(transType)){
			return AccountMark.PAY_UPCODE_DAY_END.getValue();
		}
		return "";
	}


	public static String getOutStepTwoByTransType(String transType){
		if(TransType.WITHDRAW.getValue().equals(transType)){
			return AccountMark.WITHDRAW_STEP_SECOND.getValue();
		}
		if(TransType.BATCHPAY.getValue().equals(transType)){
			return AccountMark.BATCHPAY_STEP_SECOND.getValue();
		}
		if(TransType.REFUND.getValue().equals(transType)){
			return AccountMark.REFUND_STEP_SECOND.getValue();
		}
		return "";
	}


	/**
	 * 获取撤账Code
	 *
	 * @return 内容
	 */
	public static String getRevokeCodeByTransType(String transType) {
		if (TransType.PAY.getValue().equals(transType)){
			return AccountMark.PAY_REVOKE.getValue();
		}
		if (TransType.CHARGE.getValue().equals(transType)){
			return AccountMark.CHARGE_REVOKE.getValue();
		}
		if (TransType.WITHDRAW.getValue().equals(transType)){
			return AccountMark.WITHDRAW_REVOKE.getValue();
		}
		if (TransType.BATCHPAY.getValue().equals(transType)){
			return AccountMark.BATCHPAY_REVOKE.getValue();
		}
		if (TransType.REFUND.getValue().equals(transType)){
			return AccountMark.REFUND_REVOKE.getValue();
		}
		if(TransType.SHARE.getValue().equals(transType)){
			return AccountMark.SHARES_REVOKE.getValue();
		}
		if(TransType.REAL_NAME.getValue().equals(transType)){
			return AccountMark.REAL_NAME_AUTHENTICATION_REVOKE.getValue();
		}
		if(TransType.PLAY_MONEY.getValue().equals(transType)){
			return AccountMark.TRANSFER_QUALIFICATION_REVOKE.getValue();
		}
		if(TransType.CLEARACNCE_DECLARE.getValue().equals(transType)){
			return AccountMark.CBPAYS_FEE_REVOKE.getValue();
		}
		if(TransType.DEPOSIT_WITHDRAW.getValue().equals(transType)){
			return AccountMark.DP_WITHDRAW_REVOKE.getValue();
		}
		return "";
	}

	/**
	 *
	 * @param transType
	 * @return
	 */
	public static String getSplMerAccountByTransType(String transType) {
		if(TransType.WITHDRAW.getValue().equals(transType)){
			return AccountMark.WITHDRAW_HANDOUT_SPL_MERCHANT.getValue();
		}
		if(TransType.BATCHPAY.getValue().equals(transType)){
			return AccountMark.BATCHPAY_HANDOUT_SPL_MERCHANT.getValue();
		}
		if(TransType.REFUND.getValue().equals(transType)){
			return AccountMark.REFUND_HANDOUT_SPL_MERCHANT.getValue();
		}
		return "";
	}

	/**
	 *
	 * @param transType
	 * @return
	 */
	public static String getSplChaAccountByTransType(String transType) {
		if(TransType.WITHDRAW.getValue().equals(transType)){
			return AccountMark.WITHDRAW_HANDOUT_SPL_CHANNEL.getValue();
		}
		if(TransType.BATCHPAY.getValue().equals(transType)){
			return AccountMark.BATCHPAY_HANDOUT_SPL_CHANNEL.getValue();
		}
		if(TransType.REFUND.getValue().equals(transType)){
			return AccountMark.REFUND_HANDOUT_SPL_CHANNEL.getValue();
		}
		return "";
	}
	//根据交易类型  获取出入金交易的日间记账标识
	public static String getAccountByTransTypeInDay(String transType) {
		//鉴权
		if(TransType.AUTHENTICATION.getValue().equals(transType)){
			return "ALL";//全是日间
		}
		//代收
		if(TransType.BATCHCOLLECTION.getValue().equals(transType)){
			return AccountMark.BATCOL_DAY_TIME.getValue();//代收日间
		}
		//转账
		if(TransType.BATCHPAY.getValue().equals(transType)){

			return AccountMark.BATCHPAY_SHORT_REVIEW_REVOKE_CHANNEL.getValue()
					+"#"+AccountMark.BATCHPAY_STEP_SECOND.getValue();//转账阶段二记账标识
		}
		//充值
		if(TransType.CHARGE.getValue().equals(transType)){
            return AccountMark.CHARGE_DAY_TIME.getValue()+"#"+AccountMark.QUICK_REMITS_DAY_TIME.getValue();//充值日间
		}
		//存管充值
		if(TransType.DEPOSIT_PAY.getValue().equals(transType)){
			return AccountMark.DP_DAY_TIME.getValue();//存管充值日间			
		}
		//存管提现
		if(TransType.DEPOSIT_WITHDRAW.getValue().equals(transType)){
			return AccountMark.DP_OUT_STEP2.getValue();//存管提现二阶段			
		}		
		//企业认证
		if(TransType.ENTERPRISE_CERTIFICATION.getValue().equals(transType)){
			return AccountMark.ENTERPRISE_AUTHENTICATION.getValue();//企业认证日间			
		}			
		//交易
		if(TransType.PAY.getValue().equals(transType)){
			return AccountMark.PAY_DAY_TIME.getValue();//交易日间			
		}			
		//退款
		if(TransType.REFUND.getValue().equals(transType)){			
			return AccountMark.REFUND_STEP_SECOND.getValue()//消费退款阶段二
					+"#"+AccountMark.REFUND_LONG_SUPPLEMENT_DIFF_STEP2.getValue();//充值退款阶段二				
		}	
		//实名认证
		if(TransType.REAL_NAME.getValue().equals(transType)){
			return AccountMark.REAL_NAME_AUTHENTICATION.getValue()+"#"+AccountMark.REAL_NAME_AUTHENTICATION_REVOKE.getValue();//实名认证日间
		}		
		//内转
		if(TransType.TRANSFER.getValue().equals(transType)){
			return AccountMark.TRANSFER.getValue()+"#"+AccountMark.TRANSFER_PM_TO_PM.getValue()+"#"+AccountMark.TRANSFER_C_TO_PM.getValue()+"#"
			 +AccountMark.TRANSFER_SIGN.getValue()+"#"+AccountMark.WALLET_PAY_TX_SETTLE.getValue();
		}
		//提现
		if(TransType.WITHDRAW.getValue().equals(transType)){
			return AccountMark.WITHDRAW_STEP_SECOND.getValue();//提现阶段二
		}
		return "";
	}

}
