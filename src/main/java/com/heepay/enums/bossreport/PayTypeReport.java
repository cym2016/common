package com.heepay.enums.bossreport;

/**
 *
 *
 * 描 述：BOSS报表的支付类型
 *
 * 创 建 者：wangdong
 * 创建时间：2017/5/31 14:50
 * 创建描述：
 *
 * 修 改 者：
 * 修改时间：
 * 修改描述：
 *
 * 审 核 者：
 * 审核时间：
 * 审核描述：
 *
 */
public enum PayTypeReport {

    /**
     * 网银支付
     */
    GATEWY("GATEWY", "网银支付"),
    /**
     * 快捷支付
     */
    QUICKP("QUICKP", "快捷支付");

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
    PayTypeReport(String value, String content) {
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
     *
     * @return 内容
     */

    public static PayTypeReport getBean(String value) {
        for (PayTypeReport e : PayTypeReport.values()) {
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
