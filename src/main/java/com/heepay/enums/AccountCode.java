package com.heepay.enums;

/**
 * Created by ZhangJunxin on 2017/1/4.
 */
public enum AccountCode {

    MERCHANT_CODE("20000000", "商户现金户"),
    MERCHANT_SETTLEMENT_CODE("21000000", "商户待结算户"),
    MERCHANT_MANUAL_SETTLEMENT_CODE("22000000", "商户手动结算户");

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
    AccountCode(String value, String content) {
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
}
