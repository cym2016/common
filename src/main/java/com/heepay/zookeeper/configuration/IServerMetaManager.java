package com.heepay.zookeeper.configuration;

import java.util.List;

import com.google.common.base.Optional;

public interface IServerMetaManager {
    public boolean init(String zkConnectString);
    public boolean register(String serverType, String ip, int port);
    public Optional<String> getServerByRandom(String serverType);
    public Optional<String> getServerByHash(String serverType, String key);    
    public List<String> getServerNodeList(String serverType);
}
