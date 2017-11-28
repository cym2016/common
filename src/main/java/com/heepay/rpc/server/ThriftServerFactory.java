package com.heepay.rpc.server;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.thrift.TMultiplexedProcessor;
import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadedSelectorServer;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TNonblockingServerTransport;
import org.apache.thrift.transport.TTransportException;
import org.springframework.aop.framework.Advised;
import org.springframework.aop.target.SingletonTargetSource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.util.StringUtils;

import com.heepay.rpc.service.RpcService;
import com.heepay.zookeeper.configuration.BasicServerMetaManager;
import com.heepay.zookeeper.configuration.IServerMetaManager;

/**
 * thrift 服务启动类
 * 
 * @author houjianchun
 * 
 */
public class ThriftServerFactory implements ApplicationContextAware{

	Logger log = LogManager.getLogger();
	// zk服务的地址： ip：port
	private String zkserverip;
	// 是否使用zookeeper
	private boolean open;
	// 默认的地址为ip:port
	private String address;
	// 节点名字
	private String nodename;
	// thrift服务端口号
	private int thriftPort;
	// thrift服务ip地址
	private String thriftIP;
	
	private int maxReadBufferBytes=32 * 1024 * 1024;
	
	
    /** The number of threads for selecting on already-accepted connections 
     * selector线程数 selector线程负责1.事件注册 2.读写IO轮询 3.将数据读取或者写入到transport
     * */
	public int selectorThreads = 20;
	
    /**
     * The size of the executor service (if none is specified) that will handle
     * invocations. This may be set to 0, in which case invocations will be
     * handled directly on the selector threads (as is in TNonblockingServer)
     * 工作线程数  负责协议的解析 对象序列化 业务逻辑的执行 响应写入到ByteBuffer 工作线程为0 就直接在selector线程上执行 
     * 
     */	
	private int workerThreads = 50;
		
    public int getWorkerThreads() {
		return workerThreads;
	}

	public void setWorkerThreads(int workerThreads) {
		this.workerThreads = workerThreads;
	}

	/** Time to wait for server to stop gracefully
     * 服务关闭后等待时间 主要等到已经到达的请求处理完成 后面来的请求拒绝掉
     *  */	    
	private int stopTimeoutVal = 60;
	
    /**
     * The size of the blocking queue per selector thread for passing accepted
     * connections to the selector thread
     * 每个selector线程中请求的最大个数，这些请求还没有注册读取事件
     */
    private int acceptQueueSizePerThread = 10;
    
	public int getSelectorThreads() {
		return selectorThreads;
	}

	public void setSelectorThreads(int selectorThreads) {
		this.selectorThreads = selectorThreads;
	}

	public int getStopTimeoutVal() {
		return stopTimeoutVal;
	}

	public void setStopTimeoutVal(int stopTimeoutVal) {
		this.stopTimeoutVal = stopTimeoutVal;
	}

	public int getAcceptQueueSizePerThread() {
		return acceptQueueSizePerThread;
	}

	public void setAcceptQueueSizePerThread(int acceptQueueSizePerThread) {
		this.acceptQueueSizePerThread = acceptQueueSizePerThread;
	}

	public ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	private ApplicationContext applicationContext;

	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public String getNodename() {
		return nodename;
	}

	public void setNodename(String nodename) {
		this.nodename = nodename;
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

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		try {
			System.out.println("********服务启动开始 ********");
			log.info("********服务启动开始 ********");
			// 初始化zookeeper
			IServerMetaManager serverMetaManager = BasicServerMetaManager
					.getInstance();
			serverMetaManager.init(zkserverip);
			if (address.length() > 0) {
				thriftPort = Integer.parseInt(address.split(":")[1]);
				thriftIP = address.split(":")[0];
			}
			TMultiplexedProcessor processor = new TMultiplexedProcessor();
			TNonblockingServerTransport serverTransport = new TNonblockingServerSocket(
					thriftPort);
			TCompactProtocol.Factory profactory = new TCompactProtocol.Factory();
			TThreadedSelectorServer.Args tArgs = new TThreadedSelectorServer.Args(
					serverTransport);
		
			tArgs.processor(processor);
			tArgs.protocolFactory(profactory);
			tArgs.maxReadBufferBytes=this.maxReadBufferBytes;
			tArgs.selectorThreads(this.selectorThreads);
			//TimeUnit stopTimeoutUnit=new TimeUnit(1,2);
			tArgs.workerThreads(this.workerThreads);
			tArgs.stopTimeoutVal(this.stopTimeoutVal);
			tArgs.acceptQueueSizePerThread(this.acceptQueueSizePerThread);
			
			tArgs.transportFactory(new TFramedTransport.Factory(this.maxReadBufferBytes));			
			// 一个端口注册多个service
			TServer server = new TThreadedSelectorServer(tArgs);
			Map<String, Object> thriftMap = applicationContext
					.getBeansWithAnnotation(RpcService.class);
			for (String key : thriftMap.keySet()) {
				Object obj = thriftMap.get(key);
				RpcService service = obj.getClass().getAnnotation(
						RpcService.class);
				
				if(service==null){
					Advised advised = (Advised) applicationContext.getBean(key);
					SingletonTargetSource singTarget = (SingletonTargetSource) advised.getTargetSource();
					Object target = singTarget.getTarget();
					service = target.getClass().getAnnotation(
							RpcService.class);
				}
				String serviceName = !StringUtils.isEmpty(service.name()) ? service
						.name() : key;
				Class<?> clazz = service.processor();

				if (TProcessor.class.isAssignableFrom(clazz)) {
					Object newProcessor = BeanUtils.instantiateClass(
							clazz.getConstructors()[0], obj);
					processor.registerProcessor(serviceName,
							(TProcessor) newProcessor);
					log.info(String.format("register %s ok", serviceName));
				}

			}
			// 向zk注册服务，notename为节点名称,address为ip:port
			if (open) {
				serverMetaManager.register(nodename,getIP(), thriftPort);
				log.info(String.format("********注册服务信息ip:port:nodename********%s", thriftIP
						+ ":" + thriftPort + ":" + nodename));
				log.info("********向zookeeper 注册服务信息 成功 ********");
			}
			log.info("******** 服务启动结束********\n"
					+ "IP:{}\n"
					+ "PORT:{}\n"
					+ "maxReadBufferBytes:{}\n"
					+ "selectorThreads:{}\n"
					+ "workerThreads:{}\n"
					+ "acceptQueueSizePerThread:{}",thriftIP,thriftPort,tArgs.maxReadBufferBytes
					,tArgs.selectorThreads,tArgs.getWorkerThreads(),tArgs.getAcceptQueueSizePerThread());
			
			server.serve();


		} catch (TTransportException e) {
			e.printStackTrace();
			log.error("**** thrift server 启动失败 ： " + e);
		} catch (Exception e) {
			log.error("**** zk 注册失败 ： " + e);
		}
	}

	public int getMaxReadBufferBytes() {
		return maxReadBufferBytes;
	}

	public void setMaxReadBufferBytes(int maxReadBufferBytes) {
		this.maxReadBufferBytes = maxReadBufferBytes;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
	}

	public String getIP(){
		   String returnip="";
		   ArrayList list = new ArrayList(); 
		try {
			Enumeration allNetInterfaces = NetworkInterface.getNetworkInterfaces();
			InetAddress ip = null;
			while (allNetInterfaces.hasMoreElements())
			{
			NetworkInterface netInterface = (NetworkInterface) allNetInterfaces.nextElement();
			Enumeration addresses = netInterface.getInetAddresses();
			while (addresses.hasMoreElements())
			{
			ip = (InetAddress) addresses.nextElement();
			
			if( !ip.isLoopbackAddress()
					&& ip.getHostAddress().indexOf(":")==-1)
	             list.add(ip.getHostAddress());			 
			 }
			}
			 // ip字符串排序  
			Collections.sort(list);
			returnip=list.get(0).toString();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.error("****thrift server获取本地ip失败" + e);
			returnip= address.split(":")[0];
			return returnip;
		}
		
	    return returnip;	
	}

	
}
