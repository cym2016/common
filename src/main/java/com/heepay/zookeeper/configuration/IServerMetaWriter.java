package com.heepay.zookeeper.configuration;

public interface IServerMetaWriter {
	public void write(String nodePath, String content) throws Exception;
}
