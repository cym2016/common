package com.heepay.enums;


/**
 * BankcardAuth状态
 *
 * @author zc
 */
public enum BankcardAuthType {
    /**
     * 未知
     */
    QUICKPAY("QUICPY","快捷"),
    QUICKPAY2("QUICP2","快捷2"),
    COLLECTION("COLLEC","代扣"),
    WITHDRAW("WIDRAW","提现"),
    TPDSTX("TPDSTX","存管提现"),
    REALAUTHENTICATION("REALCA","实名认证"),
    DAISHO("DAISHO","代收"),
    PERSONAL_QUICKPAY("PQUICK","个人快捷"),
    WALLET("WALLET","电子钱包"),
    ENTRUSTED_COLLECTION("ENTCOL","委托代收"),
    SUBSCRIBE_COLLECTION("SUBSBE","订阅支付");
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
    BankcardAuthType(String value, String content) {
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
}
