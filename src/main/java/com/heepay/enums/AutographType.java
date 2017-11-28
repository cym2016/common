package com.heepay.enums;


/**
 * AutographType 允许的接口类型
 * @author liuyu
 *
 */
public enum AutographType {
  /**
   * 未知
   */
  GUARANTEEPAY("GUARPY","担保支付"),
  GATEWAYPAY("GATEPY","网关支付"),  
  QUICKPAY("QUICPY","快捷支付"), 
  BATCHCOLLECTION("BATCOL","委托收款"),
  AUTHENTICATIONCOLLECTION("AUTCOL","认证收款"),
  OFFLINECOLLECTION("OFFCOL","线下收款"),
  AGREEMENTPAY("AGREPY","协议支付");

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
  AutographType(String value, String content) {  
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
