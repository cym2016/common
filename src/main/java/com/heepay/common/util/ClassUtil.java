package com.heepay.common.util;

import java.net.URL;

/**
 * 类操作工具类
 *
 */
public class ClassUtil {


	/**
	 * 获取类加载器
	 */
	public static ClassLoader getClassLoader() {
		return Thread.currentThread().getContextClassLoader();
	}

	/**
	 * 获取类路径
	 */
	public static String getClassPath() {
		String classpath = "";
		URL resource = getClassLoader().getResource("");
		if (resource != null) {
			classpath = resource.getPath();
		}
		return classpath;
	}

	/**
	 * 加载类（将自动初始化）
	 */
	public static Class<?> loadClass(String className) {
		return loadClass(className, true);
	}

	/**
	 * 加载类
	 */
	public static Class<?> loadClass(String className, boolean isInitialized) {
		Class<?> cls;
		try {
			cls = Class.forName(className, isInitialized, getClassLoader());
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
		return cls;
	}	
	/**
     * 通过反射创建实例
     */
    @SuppressWarnings("unchecked")
    public static <T> T newInstance(String className) {
        T instance;
        try {
            Class<?> commandClass = ClassUtil.loadClass(className);
            instance = (T) commandClass.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return instance;
    }
}
