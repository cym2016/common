package com.heepay.redis;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class RedisConfig {
	
	private static final Configuration config;

	static {
		Configuration c=null;
		try {
			c = new PropertiesConfiguration("redis.properties");
		} catch (ConfigurationException e) {
			System.out.println(e.getMessage() + "redis.properties  not found");
		}finally{
			config=c;
		}
	}
	
	public static String get(String property) {
		return config.getString(property, "");
	}

	public static String get(String property, String defaultValue) {
		return config.getString(property, defaultValue);
	}

	public static boolean getBoolean(String property) {
		return config.getBoolean(property);
	}
	public static int getInt(String property,int defaultValue) {
		return config.getInt(property,defaultValue);
	}
	public static int getInt(String property) {
		return config.getInt(property,0);
	}
}
