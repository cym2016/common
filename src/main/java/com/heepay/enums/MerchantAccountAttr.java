package com.heepay.enums;

/**
 * Created by ZhangJunxin on 2016/8/16.
 */
public enum MerchantAccountAttr {

    /**
     * 账户属性
     */
    ACCOUNT_ID(1, "accountId"),
    ACCOUNT_NAME(2, "accountName"),
    MERCHANT_ID(3, "merchantId"),
    MERCHANT_LOGIN_NAME(4, "merchantLoginName"),
    TYPE(5, "type"),
    BALANCE_AMOUNT(6, "balanceAmount"),
    BALANCE_FREEZED_AMOUNT(7, "balanceFreezedAmount"),
    BALANCE_AVAILABLE_AMOUNT(8, "balanceAvailableAmount"),
    BALANCE_AVAILABLE_WITHDRAW_AMOUNT(9, "balanceAvailableWithdrawAmount"),
    TOTAL_IN_AMOUNT(10, "totalInAmount"),
    TOTAL_OUT_AMOUNT(11, "totalOutAmount"),
    CREATE_TIME(12, "createTime"),
    UPDATE_TIME(13, "updateTime"),
    STATUS(14, "status"),
    DESCRIPTION(15, "description"),
    REMARK(16, "remark");

    int _value;

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
    MerchantAccountAttr(int value, String content) {
        this._value = value;
        this._Content = content;
    }

    /**
     * 取得枚举对象值
     * @return 枚举对象值
     */
    public int getValue() {
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
