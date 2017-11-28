package com.heepay.zookeeper.queue;


/**
 * consumer 回调函数
 * @author Administrator
 *
 */
public interface ConsumerCallBack {

	public void consume(Object out) throws Exception;
	
}
