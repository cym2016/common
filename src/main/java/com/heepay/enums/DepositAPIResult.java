package com.heepay.enums;


/**
 * 
*
* 描    述：存管提现返回状态枚举
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
public enum DepositAPIResult {
  
  //提现失败
  FAILED(-1,"提现失败"),
  //提现成功
  SUCCESS(1000,"提现成功"),
  //参数不完整
  PARAMS_ERROR(2000,"参数不完整"),
  //商户校验失败
  MERCHANT_ERROR(3000, "商户校验失败"),
  //提现金额异常
  AMOUNT_ERROR(4000, "提现金额异常"),
  //当前商户没有开启该业务
  NO_BUSINESS(4001,"当前商户没有开启该业务"),
  //产品不在有效期内
  LOSE_EFFICACY(4002,"产品不在有效期内"),
  //重复请求提现
  REPEAT_WITHDRAW(4003,"重复请求提现"),
  //存管账户可提现金额不足
  INSUFFICIENT_BALANCE(4004,"存管账户可提现金额不足");
  
  
  
  
  
  
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
  DepositAPIResult(int value, String content) {  
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
   public static DepositAPIResult getBean(int value) {
     for (DepositAPIResult e : DepositAPIResult.values()) {
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
