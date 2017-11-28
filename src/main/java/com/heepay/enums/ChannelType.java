package com.heepay.enums;

/**
 * 支付通道类型
 * @author yuliang
 */
public enum ChannelType {

    /**
     * 未知
     */
    QUICKPAY("QUICKP","快捷"),
    BATCHPAY("BATCHP","批付"),
    WITHHOLD("WITHHO","代扣"),
    B2BEBANK("B2BEBK","B2B网银"),
    B2CEBANK("B2CEBK","B2C网银"),
    AUTHENTICATION("AUTHEN","鉴权"),
//    REFUND("REFUND","退款"),
    WECHAT("WECHAT","微信"),
    ALIPAY("ALIPAY","支付宝"),
    QRCODE("QRCODE","二维码"),
    //SIGN("SIGN","签约");
    INSTAL("TRMPAY","分期");
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
    ChannelType(String value, String content) {
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
     * 根据值取相应内容
     * @return 内容
     */
    public static ChannelType getBean(String value) {
      for (ChannelType e : ChannelType.values()) {
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
