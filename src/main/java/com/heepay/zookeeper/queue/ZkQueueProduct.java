package com.heepay.zookeeper.queue;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.imps.CuratorFrameworkState;
import org.apache.curator.framework.recipes.queue.DistributedQueue;
import org.apache.curator.framework.recipes.queue.QueueBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;

public class ZkQueueProduct extends ZkQueueAbstract implements InitializingBean {

	private CuratorFramework client;

	private String queueName;
	
	private DistributedQueue<Object> queue;
	
	//队列的深度，不超过该值
	private int maxItem;
	
	private static final Logger logger = LogManager.getLogger();
	

	@Override
	public void afterPropertiesSet() throws Exception {
		if(client.getState() == CuratorFrameworkState.LATENT){
			client.start();
		}
		if(this.queue == null){
			QueueBuilder<Object> builder = QueueBuilder.builder(client, null, createQueueSerializer(), serverType + queueName);
			if(maxItem > 0)
				builder.maxItems(maxItem);	
			this.queue = builder.buildQueue();
			this.queue.start(); 
		}
	}
	
	/**
	 * 往队列里pull内容
	 * @param msg
	 * @throws Exception
	 */
	public void push(Object msg) throws Exception{
		//是否使用线程池？？
		//QueueSerializer 提供了队列中的对象的序列化和反序列化
		//QueueConsumer 是消费者，它可以接收队列的数据。处理队列中的数据的代码逻辑可以放在QueueConsumer.consumerMessage()中
		try {
			this.queue.put(msg);
			logger.info("---- 加入队列成功 -----");
		} catch (Exception e) {
			logger.error(String.format("---- 存入队列失败：%s ------", msg));
			throw new Exception(e);
		} finally {
			
		}
	}
	
	/**
	 * 关闭连接
	 * @throws Exception
	 */
	public void close() throws Exception{
		logger.info("------ 队列服务关闭 -------");
		if(this.queue != null)
			this.queue.close();
		if(this.client != null)
			this.client.close();
	}
	
	public void setClient(CuratorFramework client) {
		this.client = client;
	}

	public void setMaxItem(int maxItem) {
		this.maxItem = maxItem;
	}

	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}
	
}
