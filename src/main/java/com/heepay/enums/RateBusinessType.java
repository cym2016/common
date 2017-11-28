package com.heepay.enums;


/**
 * RateBusinessType 费率业务类型
 *
 * @author ly
 */
public enum RateBusinessType {
    /**
     * 未知
     */
    INTERNETPAY("INTPAY", "互联网支付业务"),
    FUNDPAY("FUDPAY", "基金支付业务"),
    CROSSBORDERPAY("CBOPAY", "跨境支付业务"),
    PREPAIDCARDPAY("PRDPAY", "预付费卡业务"),
    DEPOSITORY("DEPOSI", "存管业务"),
    WALLET("WALLET", "云钱包"),
    TRUSTEE("TRUSTE", "电商托管");

    String _value;

    /**
     * 存放内容
     */
    String _Content;

    /**
     * 私有构造函数
     *
     * @param value   枚举值
     * @param content 缓存内容
     * @return
     */
    RateBusinessType(String value, String content) {
        this._value = value;
        this._Content = content;
    }


    /**
     * 取得枚举对象值
     *
     * @return 枚举对象值
     */
    public String getValue() {
        return this._value;
    }

    /**
     * 取得内容
     *
     * @return 内容
     */
    public String getContent() {
        return this._Content;
    }

    /**
     * 根据值取得内容
     *
     * @return 内容
     */

    public static RateBusinessType getBean(String value) {
        for (RateBusinessType e : RateBusinessType.values()) {
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
