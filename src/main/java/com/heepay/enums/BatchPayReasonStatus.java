package com.heepay.enums;


/**
 *
 * 描    述：转账理由审核状态
 *
 * 创 建 者： 张俊新
 * 创建时间： 2016年9月8日 下午19:32:21
 * 创建描述：转账理由审核状态
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

public enum BatchPayReasonStatus {

    /**
     * 未知
     */
    AUDING("AUDING","待审核"),
    AUDREJ("AUDREJ","审核拒绝"),
    ADOPT("ADOPT","审核通过");

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
    BatchPayReasonStatus(String value, String content) {
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
