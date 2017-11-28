package com.heepay.enums;

/**
 * 支付通道合作方
 * @author yuliang
 */
public enum ChannelPartner {

    /**
     * 未知
     */
    DIRECTCONNECTION("DIRCON","直连"),
    EBANK("EBANKP","网银在线"),
    YSEPAY("YSEPAY","银盛"),
    PAYEASE("PAYEAS","首信易"),
    CHINAGPAY("CHGPAY","智惠"),
    IPAYNOW("PAYNOW","现在支付"),
    BILPAY("BILPAY","快钱"),
    HEEPAY("HEEPAY","汇付宝"),
    CIBDXT("CIBDXT","兴业点芯"),
    SHENGPAY("SHEPAY","盛付通"),
    UNIONPAY("UNOPAY","银联"),
	TENPAY("TENPAY","财付通"),
	PABPAY("PABPAY","平安扣"),
    SUMPAY("SUMPAY","统统付"),
    BFUPAY("BFUPAY","宝付");

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
    ChannelPartner(String value, String content) {
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
    
    public static ChannelPartner getBean(String value) {
      for (ChannelPartner e : ChannelPartner.values()) {
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
