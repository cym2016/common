package com.heepay.zookeeper.configuration;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.state.ConnectionState;
import org.apache.curator.framework.state.ConnectionStateListener;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.zookeeper.CreateMode;

/**
 * A class to monitor connection state & re-register to Zookeeper when connection lost.
 *
 */
public class ZkConnectionStateListener implements ConnectionStateListener {

	private static final Logger LOG = LogManager.getLogger();
	
	private String nodeName;
	
	private String regContent;
	
	private static final int SLEEP = 1000;
	
	public ZkConnectionStateListener(String nodeName, String content){
		this.nodeName = nodeName;
		this.regContent = content;
	}
	
	@Override
	public void stateChanged(CuratorFramework client, ConnectionState newState) {
		if(newState == ConnectionState.LOST){
			LOG.warn("---- zk connect lost, need reconection ----");
			while(true){
				try {
					if(client.getZookeeperClient().blockUntilConnectedOrTimedOut()){
						client.create()
							.creatingParentsIfNeeded()
							.withMode(CreateMode.EPHEMERAL_SEQUENTIAL)
							.forPath(this.nodeName + "/id_", this.regContent.getBytes("utf-8"));
						LOG.info("----- zk reconnection register success ------");
						break;
					}
					Thread.sleep(SLEEP);
					LOG.debug("----- zk reconnection register no success loop -------");
				} catch (InterruptedException e) {
					LOG.error(ExceptionUtils.getFullStackTrace(e));
					break;
				} catch (Exception e) {
					LOG.error(ExceptionUtils.getFullStackTrace(e));
				}
			}
		}
	}
}
