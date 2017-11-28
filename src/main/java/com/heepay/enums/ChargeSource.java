/**
 * 
 */
package com.heepay.enums;

/**
 * 手续费来源枚举类
 * 
 * @author ly
 * @date 2016年8月19日 上午10:55:35
 */
public enum ChargeSource {

  /**
   * 
   */
  MERCHANT("MERCHA","商户"), 
  USER("USERSS","用户");

  String _value;

  /**
   * 存放内容
   */
  String _Content;

  /**
   * 私有构造函数
   * 
   * @param value
   *          枚举值
   * @param content
   *          缓存内容
   * @return
   */
  ChargeSource(String value, String content) {
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

  public static ChargeSource getBean(String value) {
    for (ChargeSource e : ChargeSource.values()) {
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
