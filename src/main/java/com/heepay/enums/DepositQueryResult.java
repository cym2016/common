package com.heepay.enums;


/**
 * 
* 
* 描    述：查看存款提现状态接口返回状态
*
* 创 建 者： 王亚洪  
* 创建时间： 2017年2月9日 下午2:55:44 
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
public enum DepositQueryResult {
  
  //提现失败
  FAILED(-1,"提现失败"),
  //提现成功
  SUCCESS(1000,"提现成功"),
  //待处理
  PREDRA(2000,"待处理"),
  //没有对应的数据
  NO_DATA(3000,"没有对应的数据"),
  //参数异常
  PARAM_ERROR(4000,"参数异常");
  
  
  
  
  
  
  int _value; 
  
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
  DepositQueryResult(int value, String content) {  
    this._value = value;  
    this._Content = content;  
  }  
  
  /**
   * 取得枚举对象值
   * @return 枚举对象值
   */
  public int getValue() {
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
   * 根据值取得DepositAPIResult
   * @return 内容
   */
   public static DepositQueryResult getBean(int value) {
     for (DepositQueryResult e : DepositQueryResult.values()) {
       if (value == e.getValue()) {
         return e;
       }
     }
     return null;
   }

   /**
    * 根据值取得内容
    * @return 内容
    */
   public static String labelOf(int val) {
     if (getBean(val) != null) {
       return getBean(val).getContent();
     }
     return null;
   }
  
  
  
}
