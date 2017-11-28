package com.heepay.redis;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

import com.heepay.common.util.JsonMapperUtil;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

public class JedisClusterUtil {
	private static JedisCluster jedisCluster;
	
	/**
	 * 创建JedisCluster对象并完成配置
	 * 配置文件需要在各自的工程中定义jedis.properties
	 */
	static{
		
		// 建立连接池配置参数
		JedisPoolConfig config = new JedisPoolConfig();
		// 设置最大连接数
		config.setMaxTotal(RedisClusterConfig.getInt("jedis.pool.maxTotal"));
		// 设置最大阻塞时间，记住是毫秒数milliseconds
		config.setMaxWaitMillis(RedisClusterConfig.getInt("jedis.pool.maxWait"));
		// 设置空间连接
		config.setMaxIdle(RedisClusterConfig.getInt("jedis.pool.maxIdle"));

		Set<HostAndPort> hps = new HashSet<HostAndPort>();
		hps.add(new HostAndPort(RedisClusterConfig.get("jedis.cluster.master1"),RedisClusterConfig.getInt("jedis.cluster.master.port")));
		hps.add(new HostAndPort(RedisClusterConfig.get("jedis.cluster.master2"),RedisClusterConfig.getInt("jedis.cluster.master.port")));
		hps.add(new HostAndPort(RedisClusterConfig.get("jedis.cluster.master3"),RedisClusterConfig.getInt("jedis.cluster.master.port")));
		
//		hps.add(new HostAndPort(RedisConfig.get("jedis.cluster.slaver1"),RedisConfig.getInt("jedis.cluster.slaver.port")));
//		hps.add(new HostAndPort(RedisConfig.get("jedis.cluster.slaver2"),RedisConfig.getInt("jedis.cluster.slaver.port")));
//		hps.add(new HostAndPort(RedisConfig.get("jedis.cluster.slaver3"),RedisConfig.getInt("jedis.cluster.slaver.port")));
		
		jedisCluster = new JedisCluster(hps, config);
	}
	
	/**
	 * 多线程环境同步控制
	 */
//	private static synchronized void initJedisCluster() {
//		if (jedisCluster == null) {
//			createJedisCluster();
//		}
//	}
	
	/**
	 * 获取一个JedisCluster对象
	 * @return JedisCluster
	 */
	public static JedisCluster getJedisCluster() {
//		if (jedisCluster == null) {
//			initJedisCluster();
//		}
		return jedisCluster;
	}
	
	/**
	 * get Jedis的value
	 * @param function
	 * @return value
	 */
	public static Object getJedisValue(Function<JedisCluster, Object> getter){
	  JedisCluster jedisCluster = JedisClusterUtil.getJedisCluster();
	  Object value = getter.apply(jedisCluster);

	  return value;
	}
	
	/**
	 * set Jedis的value
	 * @param consumer
	 */
	public static void setJedisValue(Consumer<JedisCluster> setter){
	  JedisCluster jedisCluster = JedisClusterUtil.getJedisCluster();
	  setter.accept(jedisCluster);

	}
	
	//普通模式的 上边是lamida表达式的
	public static Object getBean(String key,Object beanName){
		String json=jedisCluster.get(key);
		if(json!=null){
		  JsonMapperUtil jsonMapper=new JsonMapperUtil();
			beanName=jsonMapper.fromJson(json, beanName.getClass());
		}
		return beanName;
	}
	
	public static String getValue(String key){
		return jedisCluster.get(key);
	}
	
	public static void setValue(String key,String value){
		jedisCluster.set(key, value);
	}
	
	public static void setValue(String key,String value,int timeout){

		jedisCluster.set(key, value);
		jedisCluster.expire(key, timeout);			
   }
	
}
