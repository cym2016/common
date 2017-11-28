package com.heepay.zookeeper.configuration;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.imps.CuratorFrameworkState;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.zookeeper.CreateMode;

final public class BasicServerMetaWriter implements IServerMetaWriter {
	private final static Logger LOG = LogManager.getLogger();
	private CuratorFramework zookeeper;
	
	public BasicServerMetaWriter(CuratorFramework zookeeper){
		this.zookeeper = zookeeper;
	};
	
	@Override
	public void write(String nodeName, String content) {
		if(zookeeper.getState() == CuratorFrameworkState.LATENT){
			zookeeper.start();
			zookeeper.newNamespaceAwareEnsurePath(nodeName);
		}
		try {
			String url = zookeeper.getZookeeperClient().getCurrentConnectionString();
			LOG.warn("------- 连接的 url : "+url);
			//Note：当zk服务重启时，若session已经失效，client无法重新向zk注册! 需要添加以下监听才可以生效
			ZkConnectionStateListener listener = new ZkConnectionStateListener(nodeName, content);
			zookeeper.getConnectionStateListenable().addListener(listener);
			zookeeper.create()
				.creatingParentsIfNeeded()
				.withMode(CreateMode.EPHEMERAL_SEQUENTIAL)
				.forPath(nodeName + "/id_", content.getBytes("utf-8"));
		} catch (Throwable t) {
			LOG.warn(ExceptionUtils.getFullStackTrace(t));
		}
	}
}
