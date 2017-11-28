package com.heepay.common.util;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


/**
 * 
 * @comment	属性文件操作类
 */
public class PropertiesUtil {

	private static final String PREFIX="config";

    /**
     * 加载属性文件
     */
    public static Properties loadProps(String propsPath) {
    	Properties p=load(PREFIX+File.separator+"config.properties");
    	String path=p.getProperty("config");
        return load(PREFIX+File.separator+path+File.separator+propsPath);
    }
    
    public static Properties load(String propsPath){
    	Properties props = new Properties();
        InputStream is = null;
        try {
            if (StringUtil.isBlank(propsPath)) {
                throw new IllegalArgumentException();
            }
            String suffix = ".properties";
            if (propsPath.lastIndexOf(suffix) == -1) {
                propsPath += suffix;
            }
            ClassLoader classLoader=ClassUtil.getClassLoader();
            is = classLoader.getResourceAsStream(propsPath);
            if (is != null) {
                props.load(is);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return props;
    }
    /**
     * 根据路径直接获取key值
     * @description
     * @author TianYanqing      
     * @created 2016年9月9日 上午9:57:27     
     * @param path
     * @param key
     * @return
     */
    public static String getValue(String path,String key){
    	Properties pro = load(path);
    	return getString(pro, key);
    }

    /**
     * 加载属性文件，并转为 Map
     */
    public static Map<String, String> loadPropsToMap(String propsPath) {
        Map<String, String> map = new HashMap<String, String>();
        Properties props = loadProps(propsPath);
        for (String key : props.stringPropertyNames()) {
            map.put(key, props.getProperty(key));
        }
        return map;
    }

    /**
     * 加载属性文件，并转为 Map
     */
    public static Map<String, String> loadProToMap(String propsPath) {
        Map<String, String> map = new HashMap<String, String>();
        Properties props = load(propsPath);
        for (String key : props.stringPropertyNames()) {
            map.put(key, props.getProperty(key));
        }
        return map;
    }

    /**
     * 获取字符型属性
     */
    public static String getString(Properties props, String key) {
        String value = "";
        if (props.containsKey(key)) {
            value = props.getProperty(key);
        }
        return value;
    }

    /**
     * 获取字符型属性（带有默认值）
     */
    public static String getString(Properties props, String key, String defalutValue) {
        String value = defalutValue;
        if (props.containsKey(key)) {
            value = props.getProperty(key);
        }
        return value;
    }

    /**
     * 获取指定前缀的相关属性
     */
    public static Map<String, Object> getMap(Properties props, String prefix) {
        Map<String, Object> kvMap = new LinkedHashMap<String, Object>();
        Set<String> keySet = props.stringPropertyNames();
        if (!keySet.isEmpty()) {
            for (String key : keySet) {
                if (key.startsWith(prefix)) {
                    String value = props.getProperty(key);
                    kvMap.put(key, value);
                }
            }
        }
        return kvMap;
    }
}
