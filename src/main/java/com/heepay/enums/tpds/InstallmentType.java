/**     
*   Copyright © since 2008. All Rights Reserved 
*   汇元银通（北京）在线支付技术有限公司   www.heepay.com    
*/
    
package com.heepay.enums.tpds;

/**          
* 
* 描    述：分期支付通道类型
*
* 创 建 者： 杨春龙
* 创建时间： 2017年9月18日 下午2:40:26
* 创建描述： 分期支付通道类型
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

public enum InstallmentType {

  LEBAIFEN("LBF","乐百分信用卡分期支付"),
  QUANTPAY("LHP","量化派分期支付"),
  XIAOPUPAY("XPU","小浦支付");
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
  InstallmentType(String value, String content) {
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

  public static InstallmentType getBean(String value) {
    for (InstallmentType e : InstallmentType.values()) {
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
