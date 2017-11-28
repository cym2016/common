package com.heepay.rpc.client;

import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TMultiplexedProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import org.springframework.beans.factory.InitializingBean;

import com.google.common.base.Optional;
import com.heepay.zookeeper.configuration.BasicServerMetaManager;
import com.heepay.zookeeper.configuration.IServerMetaManager;

/**
 * thrift client 连接类
 * 
 * @author houjianchun
 * 
 */
public class ThriftClientProxy implements InitializingBean {

	// zk服务的地址： ip：port
	private String zkserverip;
	// 是否使用zookeeper中的地址
	private boolean open;
	// 默认的地址为ip:port
	private String address;
	//节点name
	private String nodename;
	

	//链接超时时间
	private int connectTimeout=3000;
	//socket超时时间
	private int socketTimeout=3000;
	

	public int getConnectTimeout() {
		return connectTimeout;
	}

	public void setConnectTimeout(int connectTimeout) {
		this.connectTimeout = connectTimeout;
	}

	public int getSocketTimeout() {
		return socketTimeout;
	}

	public void setSocketTimeout(int socketTimeout) {
		this.socketTimeout = socketTimeout;
	}
	 
	public String getNodename() {
		return nodename;
	}

	public void setNodename(String nodename) {
		this.nodename = nodename;
	}

	private static IServerMetaManager serverMetaManager = null;


	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public String getZkserverip() {
		return zkserverip;
	}

	public void setZkserverip(String zkserverip) {
		this.zkserverip = zkserverip;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public TMultiplexedProtocol getClient(String nodename,String service,int _socketTimeout,int _connectTimeout) throws TTransportException{
		if (open) {
			Optional<String> ipport = serverMetaManager
					.getServerByRandom(nodename);
			address = ipport.get();

		}

		TTransport transport = new TFramedTransport(new TSocket(
				address.split(":")[0], Integer.parseInt(address.split(":")[1]),_socketTimeout,_connectTimeout));
		TProtocol protocol = new TCompactProtocol(transport);
		TMultiplexedProtocol mp = new TMultiplexedProtocol(protocol, service);
        transport.open();		
		return mp;		
	}
	public TMultiplexedProtocol getClient(String nodename,String service) throws TTransportException
	{		
		return this.getClient(nodename, service, socketTimeout, connectTimeout);
	}
	//可以手动指定IP的方式连接服务
	public TMultiplexedProtocol getClient(String nodename, String service, String inAddress) throws TTransportException {
		//设置下socket的超时时间 300毫秒
		TSocket tt=new TSocket(inAddress.split(":")[0], Integer.parseInt(inAddress.split(":")[1]));
		tt.setTimeout(300);
		tt.setConnectTimeout(300);
		tt.setSocketTimeout(300);
		TTransport transport = new TFramedTransport(tt);
		TProtocol protocol = new TCompactProtocol(transport);
		TMultiplexedProtocol mp = new TMultiplexedProtocol(protocol, service);
		transport.open();
		return mp;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		if (open) {			
			serverMetaManager = BasicServerMetaManager.getInstance();
			serverMetaManager.init(zkserverip);
		}
	}
	//获取ZK管理服务类
	public IServerMetaManager getManage(){
		
		return serverMetaManager;
	}
}
