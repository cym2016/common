/**     
*   Copyright © since 2008. All Rights Reserved 
*   汇元银通（北京）在线支付技术有限公司   www.heepay.com    
*/
    
package com.heepay.enums;

/**          
* 
* 描    述：操作人
*
* 创 建 者：张晨
* 创建时间： 2016年10月21日 下午2:40:26 
* 创建描述：操作人
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

public enum OperatorType {

  PAYMNT("PAYMNT","交易系统"),
  MANAGE("MANAGE","后台系统"),
  NGPJOB("NGPJOB","定时系统"),
  BILLIN("BILLIN","结算系统"),
  CBPAYS("CBPAYS","跨境系统"),
  PERSON("PERSON","个人系统"),
  WALLET("WALLET","钱包系统");

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
  OperatorType(String value, String content) {  
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
