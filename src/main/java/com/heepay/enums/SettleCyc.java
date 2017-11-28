package com.heepay.enums;
/**
 * 结算方式枚举
* 
* 描    述：
*
* 创 建 者：zhangchen
* 创建时间： 2016年12月29日 下午4:00:08 
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
public enum SettleCyc {
  
  T0("0", "T+0"),
  T1("1", "T+1"),
  TX("X", "T+X");

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
  SettleCyc(String value, String content) {  
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
  
   public static SettlePeriod getBean(String value) {
     for (SettlePeriod e : SettlePeriod.values()) {
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
