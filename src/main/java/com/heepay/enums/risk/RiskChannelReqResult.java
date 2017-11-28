package com.heepay.enums.risk;

/**
 * 名称：风险通道请求结果
 * <p>
 * 创建者：yuliang
 * 创建时间：2017-06-01 10:28
 * 创建描述：风险通道请求结果
 * <p>
 * 审核者：
 * 审核时间：
 * 审核描述：
 * <p>
 * 修改者：
 * 修改时间：
 * 修改内容：
 */
public enum RiskChannelReqResult {
    RESULT_SUCCESS("SUCCESS","成功"),
    RESULT_FAILURE("FAILURE","失败");

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
    RiskChannelReqResult(String value, String content) {
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

    public static RiskChannelReqResult getBean(String value) {
        for (RiskChannelReqResult e : RiskChannelReqResult.values()) {
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
