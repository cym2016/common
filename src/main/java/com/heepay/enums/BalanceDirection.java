package com.heepay.enums;


/**
 *
 * 描    述：账户余额方向
 *
 * 创 建 者： 张俊新
 * 创建时间： 2016年9月12日 下午3:30:28
 * 创建描述： 余额方向
 *
 * 修 改 者：
 * 修改时间：
 * 修改描述：
 *
 * 审 核 者：
 * 审核时间：
 * 审核描述：
 *
 *
 */

public enum BalanceDirection {
	/**
	 * 未知
	 */
	CREBIT("C","贷"),//入
	DEBIT("D","借");//出

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
	BalanceDirection(String value, String content) {
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
  
   public static String labelOf(String value) {
     for (BalanceDirection e : BalanceDirection.values()) {
       if (value.equals(e.getValue())) {
         return e.getContent();
       }
     }
     return null;
   }
	
	
}
