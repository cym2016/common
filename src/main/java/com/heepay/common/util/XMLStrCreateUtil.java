package com.heepay.common.util;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class XMLStrCreateUtil {
	
		private static final Logger log = LogManager.getLogger();
	
    /**
     * 
    * @discription bean 对象转成  xmlStr
    * @author yanxb       
    * @created 2016年12月19日 下午5:36:20     
    * @param bean
    * @return
    * @throws IllegalArgumentException
    * @throws IllegalAccessException
     */
    public static <T> String getXmlStrFromBean(T bean) throws IllegalArgumentException, IllegalAccessException {
    	if(null == bean){
    		log.info("bean 对象转成  xmlStr,参数=null");
    		return "";
    	}
    	Field[] fields = bean.getClass().getFields();
      StringBuffer buf = new StringBuffer();
      buf.append("<xml>");
      for(Field field : fields){
      	field.setAccessible(true);//设置属性可读
      	if("metaDataMap".equals(field.getName())){
      		continue;
      	}
      	buf.append("<").append(field.getName()).append(">");
      	if(StringUtil.isBlank(String.valueOf(field.get(bean)))){
      		buf.append("<![CDATA[").append("").append("]]>");
      	}else{
      		buf.append("<![CDATA[").append(String.valueOf(field.get(bean))).append("]]>");
      	}
      	buf.append("</").append(field.getName()).append(">");
      }
      buf.append("</xml>");
      log.info("Bean 转 XMLStr，结果={}",buf.toString());
      return buf.toString();
    }
    
    /**
     * 
    * @discription Map 转成 xmlStr
    * @author yanxb       
    * @created 2016年12月19日 下午8:05:59     
    * @param map
    * @return
    * @throws IllegalArgumentException
    * @throws IllegalAccessException
     */
    public static String getXmlStrFromBean(Map<String,String> map) throws IllegalArgumentException, IllegalAccessException {
    	if(null == map){
    		log.info("Map 对象转成  xmlStr,参数=null");
    		return "";
    	}
    	StringBuffer buf = new StringBuffer();
    	List<String> keys = new ArrayList<String>(map.keySet());
      Collections.sort(keys);
      buf.append("<xml>");
      for(String key : keys){
          buf.append("<").append(key).append(">");
        	if(StringUtil.isBlank(String.valueOf(map.get(key)))){
        		buf.append("<![CDATA[").append("").append("]]>");
        	}else{
        		buf.append("<![CDATA[").append(String.valueOf(map.get(key))).append("]]>");
        	}
        	buf.append("</").append(key).append(">");
      }
      buf.append("</xml>");
      log.info("Map 转 XMLStr，结果={}",buf.toString());
      return buf.toString();
    }
    
}

