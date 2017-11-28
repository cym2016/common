/**     
*   Copyright © since 2008. All Rights Reserved 
*   汇元银通（北京）在线支付技术有限公司   www.heepay.com    
*/
    
package com.heepay.enums;

/**          
* 
* 描    述：证件类型枚举类
*
* 创 建 者： 刘栋  
* 创建时间： 2016年8月24日 下午2:40:26 
* 创建描述：证件类型枚举类
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

public enum IDType {

  IDENTITYCARD("A","身份证"),
  HKANDMACAOPASSPORT("G","港澳居民往来内地通行证"),
  TAIWANPASSPORT("H","台湾居民往来大陆通行证"),
  FOREIGNPASSPORT("I","外国护照");

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
  IDType(String value, String content) {  
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
