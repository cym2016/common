/**
 * Redis connect for business
 */
package com.heepay.redis;

import com.heepay.common.util.StringUtil;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @file RedisClient.java
 * @author houjianchun
 * @date 2015-4-13
 * @time 下午4:13:41
 * @work with redis client by redis.clients.jedis.Jedis
 */
public class JedisPoolsUtil {
	private static JedisPool pool;

	/**
	 * 建立连接池 真实环境，一般把配置参数缺抽取出来。
	 * 
	 */
	private static void createJedisPool() {

		// 建立连接池配置参数
		JedisPoolConfig config = new JedisPoolConfig();
		// 设置最大连接数
		config.setMaxTotal(RedisConfig.getInt("jedis.pool.maxTotal"));
		// 设置最大阻塞时间，记住是毫秒数milliseconds
		config.setMaxWaitMillis(RedisConfig.getInt("jedis.pool.maxWait"));
		// 设置空间连接
		config.setMaxIdle(RedisConfig.getInt("jedis.pool.maxIdle"));

		
		// 创建连接池
		if (StringUtil.notBlank(RedisConfig.get("jedis.pool.password"))) {
			//有密码
			pool = new JedisPool(config,
					RedisConfig.get("jedis.pool.server.host"),
					RedisConfig.getInt("jedis.pool.server.port"),
					RedisConfig.getInt("jedis.pool.timeout"),
					RedisConfig.get("jedis.pool.password"));
		} else {
			//无密码
			pool = new JedisPool(config,
					RedisConfig.get("jedis.pool.server.host"),
					RedisConfig.getInt("jedis.pool.server.port"),
					RedisConfig.getInt("jedis.pool.timeout"));
		}

	}

	/**
	 * 在多线程环境同步初始化
	 */
	private static synchronized void poolInit() {
		if (pool == null)
			createJedisPool();
	}

	/**
	 * 获取一个jedis 对象
	 * 
	 * @return
	 */
	public static Jedis getJedis() {

		if (pool == null)
			poolInit();

		return pool.getResource();
	}

	/**
	 * 归还一个连接
	 * 
	 * @param jedis
	 */
	public static void returnRes(Jedis jedis) {
		pool.returnResourceObject(jedis);
	}

	/**
	 * 关闭连接池
	 * 
	 * @param jedis
	 */
	public static void close() {
		pool.close();
	}

}
