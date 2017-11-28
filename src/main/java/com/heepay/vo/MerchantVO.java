package com.heepay.vo;

import java.math.BigDecimal;

public class MerchantVO  {

  // 商户id
  private String merchantId;
  // 商户名
  private String merchantLoginName;
  //商户状态
  private String merchantStatus;
  //商户公司名称
  private String merchantCompany;
  //商户提现限制金额
  private BigDecimal retainedAmount;
  // 防钓鱼开关
  private boolean antiPhishing;
  //商户Mcc码
  private String mcc;
  //商户简称
  private String shortName;
  //商户标识
  private String merchantFlag;


  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }
  public BigDecimal getRetainedAmount() {
	return retainedAmount;
  }	

  public void setRetainedAmount(BigDecimal retainedAmount) {
	  this.retainedAmount = retainedAmount;
  }

  public String getMerchantStatus() {
	  return merchantStatus;
  }

  public void setMerchantStatus(String merchantStatus) {
    this.merchantStatus = merchantStatus;
  }
 
  public String getMerchantLoginName() {
    return merchantLoginName;
  }

  public void setMerchantLoginName(String merchantLoginName) {
    this.merchantLoginName = merchantLoginName;
  }

  public String getMerchantCompany() {
    return merchantCompany;
  }

  public void setMerchantCompany(String merchantCompany) {
    this.merchantCompany = merchantCompany;
  }

  

  public boolean isAntiPhishing() {
    return antiPhishing;
  }

  public void setAntiPhishing(boolean antiPhishing) {
    this.antiPhishing = antiPhishing;
  }


  public String getMcc() {
    return mcc;
  }

  public void setMcc(String mcc) {
    this.mcc = mcc;
  }

  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public String getMerchantFlag() {
    return merchantFlag;
  }

  public void setMerchantFlag(String merchantFlag) {
    this.merchantFlag = merchantFlag;
  }
}
