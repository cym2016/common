package com.heepay.rpc.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.apache.thrift.protocol.TMultiplexedProtocol;

public class ClientThreadLocal extends ThreadLocal<Map<String,Object>>{
	@Override
    protected Map<String, Object> initialValue() {
        return new HashMap<String, Object>(2);
    }
	private static final ClientThreadLocal instance = new ClientThreadLocal();
	public static ClientThreadLocal getInstance(){
		return instance;
	}
	public void setProtocol(TMultiplexedProtocol protocol){
		this.get().put("protocol", protocol);
	}
	public TMultiplexedProtocol getProtocol(){
		Object obj = this.get().get("protocol");
		return obj == null ? null : (TMultiplexedProtocol)obj;
	}
	public void setServiceName(String serverName){
		this.get().put("serviceName", serverName);
	}
	public String getServiceName(){
		return Objects.toString(this.get().get("serviceName"));
	}
	public void setNodename(String nodename){
		this.get().put("nodename", nodename);
	}
	public String getNodename(){
		return Objects.toString(this.get().get("nodename"));
	}
}
