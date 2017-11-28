/**
 * Copyright © since 2008. All Rights Reserved
 * 汇元银通（北京）在线支付技术有限公司   www.heepay.com
 */
package com.heepay.enums.gateway;

/**
 *
 * 描    述：建行批付查询状态枚举类
 *
 * 创 建 者： W.X
 * 创建时间： 2017年01月06日 10:09
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
public enum  CCBBatchPayStatus {

    _0("0","已记账未复核"),
    _1("1","复核中"),
    _2("2","交易成功城综网处理"),
    _3("3","交易成功清算处理"),
    _4("4","交易成功手工处理"),
    _5("5","交易失败"),
    _6("6","不确定"),
    _7("7","复核完毕，等待解付（对E票类交易）"),
    _8("8","批量收款复核中（专门用于批量收款发往城综网之前）"),
    _9("9","异步处理，等待发送"),
    _A("A","单据被废除"),
    _D("D","银行处理中");

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
    CCBBatchPayStatus(String value, String content) {
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

    public static String getContentByValue(String value){
        CCBBatchPayStatus[] statusList = CCBBatchPayStatus.values();
        for(CCBBatchPayStatus status : statusList){
            if(status.getValue().equals(value)){
                return status.getContent();
            }
        }
        return "";
    }

}
