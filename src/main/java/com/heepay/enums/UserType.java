/**     
*   Copyright © since 2008. All Rights Reserved 
*   汇元银通（北京）在线支付技术有限公司   www.heepay.com    
*/
    
package com.heepay.enums;

/**          
* 
* 描    述：用户类型
*
* 创 建 者： 白恒剑
* 创建时间： 2016年9月22日 下午18:16:26
* 创建描述：用户类型枚举类
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

public enum UserType {

  USER("USERXX","用户"),
  MERCHANT("TENANT","商户"),
  INDIVIDUAL("INDIVI","个体商户"),
  EMPLOYEE("EMPLOY","员工");

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
  UserType(String value, String content) {
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
  public static UserType getBean(String value) {
	  for (UserType e : UserType.values()) {
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
