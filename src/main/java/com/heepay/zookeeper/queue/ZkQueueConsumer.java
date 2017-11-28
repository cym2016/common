package com.heepay.zookeeper.queue;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.imps.CuratorFrameworkState;
import org.apache.curator.framework.recipes.queue.DistributedQueue;
import org.apache.curator.framework.recipes.queue.QueueBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.InitializingBean;

public class ZkQueueConsumer extends ZkQueueAbstract implements InitializingBean {

	private CuratorFramework client;

	private String queueName;
	
	private String guaranteePath;
	
	private DistributedQueue<Object> queue;
	
	private static final Logger logger = LogManager.getLogger();

	private ConsumerCallBack callBack;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		if(client.getState() == CuratorFrameworkState.LATENT){
			client.start();
		}
		//QueueSerializer 提供了队列中的对象的序列化和反序列化
		//QueueConsumer 是消费者，它可以接收队列的数据。处理队列中的数据的代码逻辑可以放在QueueConsumer.consumerMessage()中
		QueueBuilder<Object> builder = QueueBuilder.builder(client, createQueueConsumer(callBack), createQueueSerializer(), serverType + queueName);
		builder.lockPath(guaranteePath);	//消费担保
		this.queue = builder.buildQueue();
		this.queue.start();
		logger.info("---- 队列消费端启动 ----");
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

	public void setCallBack(ConsumerCallBack callBack) {
		this.callBack = callBack;
	}

	public void setGuaranteePath(String guaranteePath) {
		this.guaranteePath = guaranteePath;
	}

	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}

}

