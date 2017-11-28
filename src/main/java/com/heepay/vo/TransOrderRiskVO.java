package com.heepay.vo;

public class TransOrderRiskVO {
	/*
	 * 商户订单号
	 */
    private  String merchantOrderNo;
    /*
	 * 商户交易号
	 */
    private  String TransNo;
    /*
	 * 产品编码
	 */
    private String productType;
    /*
	 * 产品名称
	 */
    private String productName;
    /*
	 * 商户编码
	 */
    private String merchantId;
    /*
	 * 商户公司
	 */
    private String merchantCompany;
    /*
	 * 交易类型
	 */
    private String transType;
    /*
	 * 交易金额
	 */
    private String transAmount;
    /*
	 * 银行卡类型
	 */
    private String bankCardType;
    /*
	 * 银行卡号
	 */
    private String bankCardNo;
    /*
	 * 持卡人姓名
	 */
    private String bankCardOwnerName;
    /*
	 *持卡人身份证号码
	 */
    private String bankCardOwnerIdCard;
    /*
	 * 持卡人手机号码
	 */
    private String bankCardOwnerMobile;
    /*
	 * 渠道编码
	 */
    private String channelCode;
    /*
	 * 渠道名称
	 */
    private String channelName;
    /*
	 * 渠道交易类型
	 */
    private String channelTransType;
    /*
	 * 手续费扣除方式
	 */
    private String feeType;
    /*
   	 * 交易时间
   	 */
    private String create_time;
    /*
	 * 持卡人类别
	 */
    private String bankCardOwerType;
	public String getMerchantOrderNo() {
		return merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}
	
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public String getTransAmount() {
		return transAmount;
	}
	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}
	public String getBankCardType() {
		return bankCardType;
	}
	public void setBankCardType(String bankCardType) {
		this.bankCardType = bankCardType;
	}
	public String getBankCardNo() {
		return bankCardNo;
	}
	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	
	public String getChannelCode() {
		return channelCode;
	}
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}
	public String getChannelName() {
		return channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	public String getChannelTransType() {
		return channelTransType;
	}
	public void setChannelTransType(String channelTransType) {
		this.channelTransType = channelTransType;
	}
	public String getFeeType() {
		return feeType;
	}
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}
	public String getBankCardOwerType() {
		return bankCardOwerType;
	}
	public void setBankCardOwerType(String bankCardOwerType) {
		this.bankCardOwerType = bankCardOwerType;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public String getTransNo() {
		return TransNo;
	}
	public void setTransNo(String transNo) {
		TransNo = transNo;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getBankCardOwnerName() {
		return bankCardOwnerName;
	}
	public void setBankCardOwnerName(String bankCardOwnerName) {
		this.bankCardOwnerName = bankCardOwnerName;
	}
	public String getBankCardOwnerIdCard() {
		return bankCardOwnerIdCard;
	}
	public void setBankCardOwnerIdCard(String bankCardOwnerIdCard) {
		this.bankCardOwnerIdCard = bankCardOwnerIdCard;
	}
	public String getBankCardOwnerMobile() {
		return bankCardOwnerMobile;
	}
	public void setBankCardOwnerMobile(String bankCardOwnerMobile) {
		this.bankCardOwnerMobile = bankCardOwnerMobile;
	}
	public String getMerchantCompany() {
		return merchantCompany;
	}
	public void setMerchantCompany(String merchantCompany) {
		this.merchantCompany = merchantCompany;
	}
}
