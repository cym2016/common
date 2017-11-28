package com.heepay.zookeeper.queue;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.queue.QueueConsumer;
import org.apache.curator.framework.recipes.queue.QueueSerializer;
import org.apache.curator.framework.state.ConnectionState;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.heepay.common.util.MethodUtil;

public abstract class ZkQueueAbstract {

	public static final String serverType = "/queue/";
	
	private static final Logger logger = LogManager.getLogger();
	
	protected static QueueConsumer<Object> createQueueConsumer(final ConsumerCallBack callback){
		return new QueueConsumer<Object>() {
			
			@Override
			public void stateChanged(CuratorFramework client, ConnectionState newState) {
				logger.info("****** connectoin new state: " + newState.name());
			}
			
			@Override
			public void consumeMessage(Object message) throws Exception {
				logger.info("***** consumer one message: " + message);
				callback.consume(message);
			}
		};
	}
	
	protected static QueueSerializer<Object> createQueueSerializer(){
		
		return new QueueSerializer<Object>() {
			
			@Override
			public byte[] serialize(Object item) {
				logger.info("------ 队列消息序列化 --------");
				return MethodUtil.objectToBinary(item);
			}
			
			@Override
			public Object deserialize(byte[] bytes) {
				logger.info("------ 队列消息反序列化 --------");
				return  MethodUtil.binaryToObject(bytes);
			}
		};
	}
}
