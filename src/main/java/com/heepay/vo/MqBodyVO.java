package com.heepay.vo;

/**
 * 
* 
* 描    述：消息队列内容vo
*
* 创 建 者：zhangchen
* 创建时间： 2016年8月25日 下午5:16:25 
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
public class MqBodyVO {

    // 交易流水号
    private String paymentId;

    private String notifyUrl;

    private String payAmount;

    //银行或者渠道流水号
    private String bankSerialNo;

    private String channelCode;

    //交易结果
    private int result;

    private String  transNo;

    private String version;

    private String merchantOrderNo;

    private String merchantId;

    //交易金额
    private String successAmount;

    //优惠金额
    private String couponFee;

    //支付完成时间
    private String timeEnd;

    //付款银行
    private String bankType;

    //是否关注公众号
    private String isSubscribe;

    //随机字符串
    private String nonceStr;

    //错误代码
    private String errCode;

    //错误代码描述
    private String errCodeDes;

    private String transactionId;//微信支付订单号

    private String passTradeNo;//通道订单号

    private String signString;

    private String channelPartnerCode;	//通道合作方代码

    private String bankNo;	//银行代码
    private String bankName;	//银行名称
    private String channelPartnerName;	//通道合作方
    private String settlePeriod; //成本结算周期
    private String orderSettlePeriod;	//通道结算周期
    private String channelTypeCode;	//支付通道类型代码
    
    private String responseMsg;//网银支付结果描述
    

	//新快捷新增字段
    private String bankSerialTime;
    private String clearDate;
    private String extra;

    private String sign;
    public String getResponseMsg() {
		return responseMsg;
	}

	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(String payAmount) {
        this.payAmount = payAmount;
    }

    public String getBankSerialNo() {
        return bankSerialNo;
    }

    public void setBankSerialNo(String bankSerialNo) {
        this.bankSerialNo = bankSerialNo;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getTransNo() {
        return transNo;
    }

    public void setTransNo(String transNo) {
        this.transNo = transNo;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getSuccessAmount() {
        return successAmount;
    }

    public void setSuccessAmount(String successAmount) {
        this.successAmount = successAmount;
    }

    public String getCouponFee() {
        return couponFee;
    }

    public void setCouponFee(String couponFee) {
        this.couponFee = couponFee;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getBankType() {
        return bankType;
    }

    public void setBankType(String bankType) {
        this.bankType = bankType;
    }

    public String getIsSubscribe() {
        return isSubscribe;
    }

    public void setIsSubscribe(String isSubscribe) {
        this.isSubscribe = isSubscribe;
    }

    public String getNonceStr() {
        return nonceStr;
    }

    public void setNonceStr(String nonceStr) {
        this.nonceStr = nonceStr;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrCodeDes() {
        return errCodeDes;
    }

    public void setErrCodeDes(String errCodeDes) {
        this.errCodeDes = errCodeDes;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getPassTradeNo() {
        return passTradeNo;
    }

    public void setPassTradeNo(String passTradeNo) {
        this.passTradeNo = passTradeNo;
    }

    public String getSignString() {
        return signString;
    }

    public void setSignString(String signString) {
        this.signString = signString;
    }

    public String getChannelPartnerCode() {
        return channelPartnerCode;
    }

    public void setChannelPartnerCode(String channelPartnerCode) {
        this.channelPartnerCode = channelPartnerCode;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getChannelPartnerName() {
        return channelPartnerName;
    }

    public void setChannelPartnerName(String channelPartnerName) {
        this.channelPartnerName = channelPartnerName;
    }

    public String getSettlePeriod() {
        return settlePeriod;
    }

    public void setSettlePeriod(String settlePeriod) {
        this.settlePeriod = settlePeriod;
    }

    public String getOrderSettlePeriod() {
        return orderSettlePeriod;
    }

    public void setOrderSettlePeriod(String orderSettlePeriod) {
        this.orderSettlePeriod = orderSettlePeriod;
    }

    public String getChannelTypeCode() {
        return channelTypeCode;
    }

    public void setChannelTypeCode(String channelTypeCode) {
        this.channelTypeCode = channelTypeCode;
    }

    public String getBankSerialTime() {
        return bankSerialTime;
    }

    public void setBankSerialTime(String bankSerialTime) {
        this.bankSerialTime = bankSerialTime;
    }

    public String getClearDate() {
        return clearDate;
    }

    public void setClearDate(String clearDate) {
        this.clearDate = clearDate;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
