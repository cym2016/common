package com.heepay.enums;

/**
 * Created by ZhangJunxin on 2016/8/16.
 */
public enum InternalAccountType {

    /**
     * 内部账户类型
     */
    UNKNOWN("-1", "未知"),
    NON_REGISTRATION("0", "非注册用户"),
    PENDING_SETTLEMENT_RECEIVABLES("1", "待结算(收款)"),
    PENDING_SETTLEMENT_PAYMENT("2", "待结算(付款)"),
    COUNTER_FEE_INCOME("3", "手续费(收入)"),
    COUNTER_FEE_EXPENDITURE("4", "手续费(支出)"),
    OTHER_RECEIVABLES("5", "其他应收款"),
    OTHER_PAYMENT("6", "其他应付款"),
    BANK_ACCOUNT("7", "备付金"),
    SETTLEMENT_ACCOUNT("8", "待结算"),
    GENERATION_TECHNOLOGY("9", "代科技"),
    PAY_MONEY("10", "打款认证"),
    REAL_NAME("11", "实名认证"),
    CHANNEL_SERVICE_PUBLICSECURITY("12", "通道服务费-实名认证"),
    CAPITAL_ALLOCATION("13", "资金调拨类账户"),
    MANUAL_SETTLEMENT_ACCOUNT("14", "手动待结算"),
    CHANNEL_SERVICE_PUBLICSECURITY_EPRICE("15", "通道服务费-企业认证"),
    OPERATING_COST("16", "营业成本"),
    AUTHEN_TICATION("17", "通道服务费-鉴权"),
    ELSEAL_TICATION("18", "通道服务费-电子签章"),
    AUTHEN_TICATION_HZSS("19", "其他应收款-坏账损失"),
    OTHER_PAYMENT_HZSS("20", "其他应付款-坏账损失"),
    MOBILE_TICATION("21", "通道服务费-手机运营商三要素"),
    /**
     * 内部账户详细类型，排除银行
     */
    NON_REGISTRATION_VAL("999", "非注册用户"),
    USER_WITHDRAWALS("998", "用户提现"),
    TRANSFER_TO_BANKCARD("997", "转账至银行卡"),
    REFUND("987", "退款"),
    MERCHANT_SETTLEMENT("996", "商户结算"),
    BUCKLE_USER("995", "坐扣-用户"),
    BUCKLE_BUSINESS("994", "坐扣-商户"),
    OUTSIDE_USER("993", "外扣-用户"),
    OUTSIDE_BUSINESS("992", "外扣-商户"),
    BUCKLE_RECHARGE("991", "坐扣-充值"),
    BUCKLE_SETTLEMENT("990", "坐扣-结算"),
    OUTSIDE_RECHARGE("989", "外扣-充值"),
    OUTSIDE_SETTLEMENT("988", "外扣-结算"),
    BUCKLE_PAYMENT("987", "坐扣-消费"),
    OUTSIDE_PAYMENT("986", "外扣-消费"),
    DEPOSIT_WITHDRAWALS("985", "存管提现"),
    BUCKLE_BATCOL("984", "坐扣-代收"),
    OUTSIDE_BATCOL("983", "外扣-代收"),
    PAYMENT_TRANSFER("982", "内转");

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
    InternalAccountType(String value, String content) {
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
