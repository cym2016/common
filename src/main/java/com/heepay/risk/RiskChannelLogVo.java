package com.heepay.risk;
/**
 * 
 * 
 * 描 述：描述
 *
 * 创 建 者：dongzhengjiang
 * 创建时间： 2017年5月24日 上午11:31:13
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
public class RiskChannelLogVo {
	/**
     * 通道代码
     */
    private String channelCode;

    /**
     * 通道合作方名称
     */
    private String channelPartnerName;

    /**
     * 通道合作方代码
     */
    private String channelPartnerCode;

    /**
     * 银行名称
     */
    private String bankName;
    /**
     * 银行代码
     */
    private String bankNo;

    /**
     * 银行卡类型名称
     */
    private String cardTypeName;
    /**
     * 银行卡类型代码
     */
    private String cardTypeCode;

    /**
     * 支付通道类型
     */
    private String channelTypeName;
    /**
     * 支付通道类型代码
     */
    private String channelTypeCode;

    /**
     * 对公对私标识代码
     */
    private String accountType;

    /**
     * 付款类型代码
     */
    private String businessType;

    /**
     * 单笔限额
     */
    private String perlimitAmount;
    /**
     * 单日限额
     */
    private String daylimitAmount;
    /**
     * 单月限额
     */
    private String monlimitAmount;

    /**
     * 交易号
     */
    private String paymentId;

    /**
     * 订单金额
     */
    private String amount;

    /**
     * 状态码
     */
    private String requestStatus;

    /**
     * 请求时间
     */
    private String reqTime;

    /**
     * 返回时间
     */
    private String respTime;

    /**
     * 请求结果
     */
    private String result;

    /**
     * 请求地址
     */
    private String url;

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getChannelPartnerName() {
        return channelPartnerName;
    }

    public void setChannelPartnerName(String channelPartnerName) {
        this.channelPartnerName = channelPartnerName;
    }

    public String getChannelPartnerCode() {
        return channelPartnerCode;
    }

    public void setChannelPartnerCode(String channelPartnerCode) {
        this.channelPartnerCode = channelPartnerCode;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public String getCardTypeName() {
        return cardTypeName;
    }

    public void setCardTypeName(String cardTypeName) {
        this.cardTypeName = cardTypeName;
    }

    public String getCardTypeCode() {
        return cardTypeCode;
    }

    public void setCardTypeCode(String cardTypeCode) {
        this.cardTypeCode = cardTypeCode;
    }

    public String getChannelTypeName() {
        return channelTypeName;
    }

    public void setChannelTypeName(String channelTypeName) {
        this.channelTypeName = channelTypeName;
    }

    public String getChannelTypeCode() {
        return channelTypeCode;
    }

    public void setChannelTypeCode(String channelTypeCode) {
        this.channelTypeCode = channelTypeCode;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getPerlimitAmount() {
        return perlimitAmount;
    }

    public void setPerlimitAmount(String perlimitAmount) {
        this.perlimitAmount = perlimitAmount;
    }

    public String getDaylimitAmount() {
        return daylimitAmount;
    }

    public void setDaylimitAmount(String daylimitAmount) {
        this.daylimitAmount = daylimitAmount;
    }

    public String getMonlimitAmount() {
        return monlimitAmount;
    }

    public void setMonlimitAmount(String monlimitAmount) {
        this.monlimitAmount = monlimitAmount;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public String getReqTime() {
        return reqTime;
    }

    public void setReqTime(String reqTime) {
        this.reqTime = reqTime;
    }

    public String getRespTime() {
        return respTime;
    }

    public void setRespTime(String respTime) {
        this.respTime = respTime;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}

 