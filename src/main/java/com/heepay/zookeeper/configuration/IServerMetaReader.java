package com.heepay.zookeeper.configuration;

import java.util.List;

public interface IServerMetaReader {
    public List<String> getChildrenContents(String nodePath);
}
