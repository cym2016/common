/**     
*   Copyright © since 2008. All Rights Reserved 
*   汇元银通（北京）在线支付技术有限公司   www.heepay.com    
*/
    
package com.heepay.enums;

/**          
* 
* 描    述：币种枚举类
*
* 创 建 者： 刘栋  
* 创建时间： 2016年8月25日 下午3:34:28 
* 创建描述：币种枚举类
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

public enum CurrencyType {

  RMB("156","人民币");

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
  CurrencyType(String value, String content) {  
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
