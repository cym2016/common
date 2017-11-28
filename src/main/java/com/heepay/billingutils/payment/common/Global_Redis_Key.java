package com.heepay.billingutils.payment.common;

/** 
 * 
 * @description    全局Redis主键key，用于生成相关表的主键。
 * 
 * @classname      Global_Redis_Key 
 * @author         houjc<houjc@9186.com>
 * @date           2016年6月23日 上午10:32:05 
 * @version         1.0
 */
public class Global_Redis_Key {
	//交易号
    public static final String GATEWAY_ID="trans_id";
    
    //支付ID
    public static final String PAYMENT_ID="payment_id";
    
    //资金流水号
    public static final String RECORD_ID="record_id";
    
    //签约卡ID
    public static final String AUTH_ID="sign_id";
    
    //退款ID
    public static final String REFUND_ID="refund_id";
    
    //充值ID
    public static final String CHARGE_ID="charge_id";
    
    //提现ID
    public static final String WITHDRAW_ID="withdraw_id";
    
    //批收ID
    public static final String BATCH_COLLECTION_ID="batch_collection_id";
    
    //批付ID
    public static final String BATCH_PAY_ID="batch_pay_id";
    
    //通知ID
    public static final String NOTIFY_ID="notify_id";
    
    //授权码流水号
    public static final String AUTHORIZATION_CODE="authorization_code";
    
    //内部转账ID
    public static final String INNER_TRANS_ID="inner_trans_id";
}
