package com.heepay.zookeeper.configuration;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.imps.CuratorFrameworkState;
import org.apache.curator.retry.RetryNTimes;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.common.base.Joiner;
import com.google.common.base.Optional;

public class BasicServerMetaManager implements IServerMetaManager {
    private final static Logger LOG = LogManager.getLogger();
    private static final BasicServerMetaManager INSTANCE = new BasicServerMetaManager();
    private CuratorFramework zkClient = null;
    private IServerMetaWriter serverMetaWriter = null;
    private IServerMetaReader serverMetaReader = null;

    private BasicServerMetaManager() {}
    public static BasicServerMetaManager getInstance() {
        return INSTANCE;
    }

    @Override
    public boolean init(String zkConnectString) {
        boolean status = true;
        try {
            this.zkClient = create(zkConnectString);
            this.serverMetaWriter = new BasicServerMetaWriter(this.zkClient);
            this.serverMetaReader = new BasicServerMetaReader(this.zkClient);
        } catch (Throwable t) {
            LOG.error(ExceptionUtils.getFullStackTrace(t));
        }
        return status;
    }

    @Override
    public boolean register(String serverType, String ip, int port) {
        String nodePath = Joiner.on("/").join("/rpc", serverType, "nodes");
        String content = Joiner.on(":").join(ip, port);
        boolean status = true;
        try {
            this.serverMetaWriter.write(nodePath, content);
        } catch (Throwable t) {
            LOG.warn(ExceptionUtils.getFullStackTrace(t));
            status = false;
        }

        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                BasicServerMetaManager.getInstance().close();
            }
        });

        return status;
    }

    @Override
    public Optional<String> getServerByRandom(String serverType) {
        String nodePath = Joiner.on("/").join("/rpc", serverType, "nodes");
        List<String> serverList = this.serverMetaReader.getChildrenContents(nodePath);
        int size = serverList.size();
        if (0 == size) {
            return Optional.absent();
        }

        int idx = ThreadLocalRandom.current().nextInt(0, size);
        return Optional.of(serverList.get(idx));
    }

    @Override
    public Optional<String> getServerByHash(String serverType, String key) {
        String nodePath = Joiner.on("/").join("/rpc", serverType, "nodes");
        List<String> serverList = this.serverMetaReader.getChildrenContents(nodePath);
        int size = serverList.size();
        if (0 == size) {
            return Optional.absent();
        }

        int idx = Math.abs(Objects.hash(serverType, key) % size);
        return Optional.of(serverList.get(idx));
    }

    public static CuratorFramework create(String zkConnectString) {
        CuratorFrameworkFactory.Builder builder = CuratorFrameworkFactory.builder();
        return builder.connectString(zkConnectString)
                   .sessionTimeoutMs(30000)
                   .connectionTimeoutMs(30000)
                   .canBeReadOnly(true)
                   .retryPolicy(new RetryNTimes(30, 1000))
                   .defaultData(null)
                   .build();
    }

    public void close() {
        if (null != this.zkClient
                && !this.zkClient.getState().equals(CuratorFrameworkState.STOPPED)) {
            this.zkClient.close();
            this.zkClient = null;
        }
    }
    //根据服务名 返回当前RPC服务注册在ZK上的注册信息
    public List<String> getServerNodeList(String serverType){
        String nodePath = Joiner.on("/").join("/rpc", serverType, "nodes");
        List<String> serverList = this.serverMetaReader.getChildrenContents(nodePath);
        return serverList;
    }
    
    @Override
    protected void finalize() {
        close();
    }
}
