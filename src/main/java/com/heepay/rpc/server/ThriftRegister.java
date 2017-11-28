package com.heepay.rpc.server;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
/**
 * 
* 
* 描    述：
*
* 创 建 者： 杨春龙  
* 创建时间： 2016年9月1日 上午11:52:39 
* 创建描述：注册thrift服务类 为了加载事务做修改
* 
* 修 改 者：  
* 修改时间： 
* 修改描述： 
* 
* 审 核 者：
* 审核时间：
* 审核描述：
*
 */

public class ThriftRegister implements ApplicationListener<ContextRefreshedEvent>{
		
	private com.heepay.rpc.server.ThriftServerFactory rpcServer;
	
	public com.heepay.rpc.server.ThriftServerFactory getRpcServer() {
		return rpcServer;
	}

	public void setRpcServer(com.heepay.rpc.server.ThriftServerFactory rpcServer) {
		this.rpcServer = rpcServer;
	}

	public void onApplicationEvent(ContextRefreshedEvent event) {
		try {
			rpcServer.afterPropertiesSet();
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
		
	
}
