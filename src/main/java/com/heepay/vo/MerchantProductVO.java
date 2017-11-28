
package com.heepay.vo;

import java.util.List;
import java.util.Map;

/**
 * 商户对接的产品
 * 
 * @author zhangchen 2016年8月15日
 */
public class MerchantProductVO {
    // 商户id
    private String merchantId;

    // 产品名称
    private String productName;
    // 对接产品的秘钥
    private String productKey;
    // 对接产品的backurl
    private String backUrl;
    // 对接产品的notifyurl
    private String notifyUrl;
    // 对接产品的ip/域名
    private String ipDomain;
    // 对接产品的有效期截止日 YYYY/MM/DD HH:MM:SS
    private Long validityDateEnd;
    // 对接产品的有效期开始日 YYYY/MM/DD HH:MM:SS
    private Long validityDateBegin;
    // 防钓鱼referer
    public String referer;
    // 代扣产品专用配置（到账户余额还是到银行卡）
    private String toBalanceOrBankcard;
    // 产品编码
    private String productCode;
    // 手续费扣除方式
    private String feeWay;
    // 手续费结算周期
    private String feeSettleCyc;
    // 订单结算周期
    private String settleCyc;
    // 是否退还手续费
    private String isRefundable;
    // 状态
    private String status;
    // 银行卡类型
    private List<String> bankCardTypes;

    //分润入款商户白名单，key为商户id,value为分润阈值（总额的百分比 ）例如：<100085,20>表示入款商户ID是100085，分润额不能高于分润总额的20%
    private Map<String,String> shareMap;
        
    //鉴权时是否由商户发送短信
    private boolean bankCard4AuthSendSms;
    
    
    //商户发送短信接口地址
    private String bankCard4AuthSendSmsUrl;
    
    
    public boolean isBankCard4AuthSendSms() {
      return bankCard4AuthSendSms;
    }

    public void setBankCard4AuthSendSms(boolean bankCard4AuthSendSms) {
      this.bankCard4AuthSendSms = bankCard4AuthSendSms;
    }

    public String getBankCard4AuthSendSmsUrl() {
      return bankCard4AuthSendSmsUrl;
    }

    public void setBankCard4AuthSendSmsUrl(String bankCard4AuthSendSmsUrl) {
      this.bankCard4AuthSendSmsUrl = bankCard4AuthSendSmsUrl;
    }

   
    
    
    public Map<String, String> getShareMap() {
      return shareMap;
    }

    public void setShareMap(Map<String, String> shareMap) {
      this.shareMap = shareMap;
    }

    public String getToBalanceOrBankcard() {
        return toBalanceOrBankcard;
    }

    public void setToBalanceOrBankcard(String toBalanceOrBankcard) {
        this.toBalanceOrBankcard = toBalanceOrBankcard;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductKey() {
        return productKey;
    }

    public void setProductKey(String productKey) {
        this.productKey = productKey;
    }

    public String getBackUrl() {
        return backUrl;
    }

    public void setBackUrl(String backUrl) {
        this.backUrl = backUrl;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

    public String getFeeWay() {
        return feeWay;
    }

    public void setFeeWay(String feeWay) {
        this.feeWay = feeWay;
    }

    public String getSettleCyc() {
        return settleCyc;
    }

    public void setSettleCyc(String settleCyc) {
        this.settleCyc = settleCyc;
    }

    public String getIsRefundable() {
        return isRefundable;
    }

    public void setIsRefundable(String isRefundable) {
        this.isRefundable = isRefundable;
    }

    public String getFeeSettleCyc() {
        return feeSettleCyc;
    }

    public void setFeeSettleCyc(String feeSettleCyc) {
        this.feeSettleCyc = feeSettleCyc;
    }

    public Long getValidityDateEnd() {
        return validityDateEnd;
    }

    public void setValidityDateEnd(Long validityDateEnd) {
        this.validityDateEnd = validityDateEnd;
    }

    public Long getValidityDateBegin() {
        return validityDateBegin;
    }

    public void setValidityDateBegin(Long validityDateBegin) {
        this.validityDateBegin = validityDateBegin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getBankCardTypes() {
        return bankCardTypes;
    }

    public void setBankCardTypes(List<String> bankCardTypes) {
        this.bankCardTypes = bankCardTypes;
    }

    public String getIpDomain() {
        return ipDomain;
    }

    public void setIpDomain(String ipDomain) {
        this.ipDomain = ipDomain;
    }
    
}
