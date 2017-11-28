package com.heepay.common.util;

import java.io.InputStream;
import java.util.Properties;

/**
 * 单例模式读取Properties属性文件
 * 
 * @author zc
 *
 */
public class SinglePropertiesFactory {
	/**
	 * 私有的属性防止外部引用
	 */
	private static SinglePropertiesFactory _instance = null;
	private Properties properties = new Properties();
	private SinglePropertiesFactory() {
	}
	/**
	 * 私有的默认构造函数，防止使用构造函数进行实例化
	 */
	private SinglePropertiesFactory(String propertiesFileName) {
		try {
			InputStream inputStream = this.getClass().getResourceAsStream(propertiesFileName);
			properties.load(inputStream);
			if (inputStream != null)
				inputStream.close();
		} catch (Exception e) {
			System.out.println(e + "file not found");
		}
	}

	/**
	 * 单例静态工厂方法，不保证多线程环境同时执行时的同步问题（提高效率）加上synchronized同步支持多线程
	 * @author zc
	 * @date 2016-7-5
	 * @return
	 */
	public static  SinglePropertiesFactory getInstance(String propertiesFileName) {
		if (_instance == null) {
			_instance = new SinglePropertiesFactory(propertiesFileName);
		}
		return _instance;
	}


	/**
	 * 读取配置信息key - value
	 *
	 * @author zc
	 * @date 2016-7-5
	 * @return
	 */
	public String getConfig(String key) {
		return properties.getProperty(key);
	}

}
