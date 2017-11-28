/**
 *
 */
package com.heepay.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Title:CostType.java</p>
 * <p>Description:成本类型枚举类</p>
 * <p>Company:hy</p>
 *
 * @author M.Z
 * @date 2016年8月19日 上午10:55:35
 */
public enum CostType {

    /**
     *
     */
    RATE("RATIOD", "按比例"),
    COUNT("COUNTD", "按笔数");

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
    CostType(String value, String content) {
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

    /**
     * 根据值取得内容
     *
     * @return 内容
     */

    public static CostType getBean(String value) {
        for (CostType e : CostType.values()) {
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

    private static final Map<String, String> lookup = new HashMap<>();

    static {
        for (CostType e : CostType.values()) {
            lookup.put(e.getContent(), e.getValue());
        }
    }

    public static String getLabel(String value) {
        return lookup.get(value);
    }

}
