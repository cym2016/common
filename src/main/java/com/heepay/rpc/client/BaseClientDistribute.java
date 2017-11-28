package com.heepay.rpc.client;



import org.apache.thrift.protocol.TMultiplexedProtocol;
import org.apache.thrift.transport.TTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseClientDistribute {
	

	private static final Logger log = LoggerFactory.getLogger(BaseClientDistribute.class);
	
	public final void setTMultiplexedProtocol() {
		ThriftClientProxy clientProxy=getClientProxy();
		try {
			ClientThreadLocal.getInstance().setProtocol(
					clientProxy.getClient(ClientThreadLocal.getInstance().getNodename(),ClientThreadLocal.getInstance().getServiceName()));
		} catch (Exception e) {
			log.error("取thrift连接异常！nodename={},异常={}" , ClientThreadLocal.getInstance().getNodename(), e);
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

	/**
	 * 子类需重写此方法
	 */
	public abstract void setServiceName() ;
	public abstract void setNodename();
	public abstract ThriftClientProxy getClientProxy();
}
