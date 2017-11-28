package com.heepay.redis;

import redis.clients.jedis.JedisCluster;

/***
 * 
* 
* 描    述：基于REDIS的频路限制器  可以用于访问频路限制等
*      用于高并发下，方式刷库
* 创 建 者： 杨春龙  
* 创建时间： 2016年9月29日 上午10:20:02 
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
public class RedisLimitLock {

	private static JedisCluster jedisCluster=JedisClusterUtil.getJedisCluster();
	/**
	 * @param  key 需要限制的key  最好 平台+ip
	 * @param  limit 当前key每秒的限制的次数   
	 */
	public   static boolean lock(String key,int limit ){
		//查询list的长度
		long  current=jedisCluster.llen(key);
		if( current>=limit){
			//将过期时间设为1,秒
			jedisCluster.expire(key, 1);
			return false;
		}
		//判断当前key是否存在过
		if(!jedisCluster.exists(key)){
			//创建当前key，并将key值存到列表尾部
			jedisCluster.rpush(key, key);
			//设置过期时间
			jedisCluster.expire(key, 1);
		}else{
			//仅当列表存在时 将key值存到列表尾部
			jedisCluster.rpushx(key, key);
		}
		return true;

	}

}
