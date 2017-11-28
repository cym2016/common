package com.heepay.enums;

/**
 * Created by ZhangJunxin on 2016/8/16.
 */
public enum MerchantAccountType {

    /**
     * 账户类型
     */
    PERSONAL_ACCOUNT("1","个人账户"),
    MERCHANT_ACCOUNT("2","商户账户"),
    INTERNAL_ACCOUNT("3","内部账户"),
    DEPOSITORY_ACCOUNT("4","存管账户"),
    CONSOLIDATED_ACCOUNT("5","归集账户"),
    USER_ACCOUNT("6","用户账户");

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
    MerchantAccountType(String value, String content) {
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
     * 根据值取得内容
     * @return 内容
     */
    
     public static String labelOf(String value) {
       for (MerchantAccountType e : MerchantAccountType.values()) {
         if (value.equals(e.getValue())) {
           return e.getContent();
         }
       }
       return null;
     }
    
}
