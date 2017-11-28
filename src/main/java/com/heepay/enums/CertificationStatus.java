/**
 * Copyright © since 2008. All Rights Reserved
 * 汇元银通（北京）在线支付技术有限公司   www.heepay.com
 */

package com.heepay.enums;

/**
 *
 * 描    述：用户认证状态
 *
 * 创 建 者： 白恒剑
 * 创建时间： 2016年10月21日 下午17:16:26
 * 创建描述：用户认证状态枚举类
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

public enum CertificationStatus {

    UNAUTHORIZED("UNAUTH", "未认证"),
    RCAUDITSTATUS("RCAUDIT", "风控审核中"),
    LEGALAUDITSTATUS("LEGALAUDIT", "法务审核中"),
    REVIEW("REVIEW", "审核中"),
    AUDITFAILURE("AUDITFAILURE", "审核失败"),
    AUTHENTICATION("AUTHENTICATION", "认证中"),
    AUTHENTICATIONFAILURE("FAILURE", "认证失败"),
    AUTHENTICATIONSUCCESS("SUCCESS", "认证成功");


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
    CertificationStatus(String value, String content) {
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
    public static ProductType getBean(String value) {
        for (ProductType e : ProductType.values()) {
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
