package com.heepay.enums.risk;

/**
 * 名称：通道成功率日志类型枚举
 * <p>
 * 创建者：yuliang
 * 创建时间：2017-06-19 15:10
 * 创建描述：通道成功率日志类型枚举
 * <p>
 * 审核者：
 * 审核时间：
 * 审核描述：
 * <p>
 * 修改者：
 * 修改时间：
 * 修改内容：
 */
public enum RiskChannelReqType {

    PAY("PAY","支付"),
    ENCRYPT("ENCRYPT","B2C加密"),
    DECRYPT_SYNC("ENCRYPT_SYNC","B2C同步解密"),
    DECRYPT_ASYNC("DECRYPT_ASYNC", "B2C异步解密"),
    QUOTA("QUOTA", "限额");

    String _value;

    /**
     * 存放内容
     */
    String _content;

    /**
     * 私有构造函数
     * @param value 枚举值
     * @param content 缓存内容
     * @return
     */
    RiskChannelReqType(String value, String content) {
        this._value = value;
        this._content = content;
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
        return this._content;
    }

    /**
     * 根据值取得内容
     *
     * @return 内容
     */

    public static RiskChannelReqType getBean(String value) {
        for (RiskChannelReqType e : RiskChannelReqType.values()) {
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
