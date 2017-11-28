/**
 * 
 */
package com.heepay.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>Title:CostType.java</p> 
 * <p>Description:对公对私标识枚举类</p>
 * @author lm
 */
public enum AccountType {

    /**
     * 
     */
    PUBLIC("PUBLIC","对公"),
    PRIVAT("PRIVAT","对私"),
    COMMON("COMMON","通用");

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
    AccountType(String value, String content) {  
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
     public static AccountType getBean(String value) {
       for (AccountType e : AccountType.values()) {
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
        for (AccountType e : AccountType.values()) {
            lookup.put(e.getContent(), e.getValue());
        }
    }
    public static String getLabel(String value){
        return lookup.get(value);
    }
}
