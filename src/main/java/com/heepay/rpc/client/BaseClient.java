package com.heepay.rpc.client;


import java.util.List;

import javax.annotation.Resource;

import org.apache.thrift.protocol.TMultiplexedProtocol;
import org.apache.thrift.transport.TTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.heepay.zookeeper.configuration.IServerMetaManager;

public abstract class BaseClient {
	@Resource(name = "heepayClient")
	private ThriftClientProxy clientProxy;
	private static final Logger log = LoggerFactory.getLogger(BaseClient.class);
	public final void setTMultiplexedProtocol() {
		try {
			ClientThreadLocal.getInstance().setProtocol(
					clientProxy.getClient(ClientThreadLocal.getInstance().getNodename(),ClientThreadLocal.getInstance().getServiceName()));
		} catch (Exception e) {
			log.error("取thrift连接异常！",e);
		}
	}
	//重载一个获取client链接的方法  指定IP(ZK链接方式)
	public final void setTMultiplexedProtocol(String address) {
		try {
			ClientThreadLocal.getInstance().setProtocol(
					clientProxy.getClient(ClientThreadLocal.getInstance().getNodename(),ClientThreadLocal.getInstance().getServiceName(),address));
		} catch (Exception e) {
			log.error("取thrift连接异常！",e);
		}
	}
	
	
	public final void close() {
		TMultiplexedProtocol tmp = ClientThreadLocal.getInstance().getProtocol();
		if (tmp != null) {
			TTransport transport = tmp.getTransport();
			if (transport != null) {
				transport.close();
			}
		}

	}
	public final TMultiplexedProtocol getProtocol(){
		this.setServiceName();
		this.setNodename();
		this.setTMultiplexedProtocol();
		TMultiplexedProtocol tmp = ClientThreadLocal.getInstance().getProtocol();
		return tmp;
	}
	public final TMultiplexedProtocol getProtocol(String serviceName,String nodeName){
		ClientThreadLocal.getInstance().setServiceName(serviceName);
		ClientThreadLocal.getInstance().setNodename(nodeName);
		return this.getProtocol();
	}
	//获取注册到ZK上的所有服务节点
	public List<String> getAddress(String nodeName){
		IServerMetaManager serverMetaManager=clientProxy.getManage();
        
        List<String> serverList = serverMetaManager.getServerNodeList(nodeName);
        return serverList;
	}
	
	/**
	 * 子类需重写此方法
	 */
	public abstract void setServiceName() ;
	public abstract void setNodename();
}
