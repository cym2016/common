/**
 * 
 */
package com.heepay.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * 
* 
* 描    述：招商银行分行号
*
* 创 建 者： yanx  
* 创建时间： 2017年3月29日 下午3:53:42 
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
public enum CmbBankCode {

    CMB_BANKCODE10("10","北京"),
    CMB_BANKCODE12("12","离岸分行"),
    CMB_BANKCODE13("13","总行离岸中心"),
    CMB_BANKCODE20("20","广州"),
    CMB_BANKCODE01("01","总行");


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
    CmbBankCode(String value, String content) {  
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
     public static CmbBankCode getBean(String value) {
       for (CmbBankCode e : CmbBankCode.values()) {
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

    private static final Map<String, String> lookup = new HashMap<>();

    static {
        for (CmbBankCode e : CmbBankCode.values()) {
            lookup.put(e.getContent(), e.getValue());
        }
    }
    public static String getLabel(String value){
        return lookup.get(value);
    }
}
