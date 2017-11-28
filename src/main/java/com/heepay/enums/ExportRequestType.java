package com.heepay.enums;

/***
 *
 *
 * 描    述： 导出请求类型
 *
 * 创 建 者： liudh
 * 创建时间： 2017/11/22 17:23
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
public enum ExportRequestType {

    API("api","API"),
    WEB("web","商家站点");

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
    ExportRequestType(String value, String content) {
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
     * 取得缓存内容
     * @return 缓存内容
     */
    public String getContent() {
        return this._Content;
    }
    /**
     *
     * @description 根据错误编码获取错误信息
     * @author
     * @created
     * @param value
     * @return
     */
    public static String getContentByValue(String value){
        ExportRequestType[] byRatio = ExportRequestType.values();
        for(ExportRequestType type : byRatio){
            if(type.getValue().equals(value)){
                return type.getContent();
            }
        }
        return "";
    }

}
