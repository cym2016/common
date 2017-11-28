package com.heepay.zookeeper.configuration;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.imps.CuratorFrameworkState;
import org.apache.curator.framework.recipes.cache.ChildData;
import org.apache.curator.framework.recipes.cache.PathChildrenCache;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

final public class BasicServerMetaReader implements IServerMetaReader{
	private final static Logger LOG = LogManager.getLogger();
	private CuratorFramework zkClient = null;
	private Map<String, PathChildrenCache> cachedPathMap = Maps.newHashMap();

	public BasicServerMetaReader(CuratorFramework zkClient) {
		this.zkClient = zkClient;
		if(zkClient.getState() == CuratorFrameworkState.LATENT){
			zkClient.start();
		}
	}

	private synchronized PathChildrenCache getPathChildrenCache(String nodePath) {
		PathChildrenCache pathChildrenCache = this.cachedPathMap.get(nodePath);
		if (null == pathChildrenCache) {
			pathChildrenCache = new PathChildrenCache(this.zkClient, nodePath, true);
			try {
				pathChildrenCache.start(PathChildrenCache.StartMode.BUILD_INITIAL_CACHE);
				this.cachedPathMap.put(nodePath, pathChildrenCache);
			} catch (Throwable e) {
				LOG.warn(ExceptionUtils.getFullStackTrace(e));
			}
		}

		return pathChildrenCache;
	}

	public List<String> getChildrenContents(String nodePath) {
		PathChildrenCache pathChildrenCache = getPathChildrenCache(nodePath);

		List<String> result = Lists.newArrayList();
		for (ChildData cd : pathChildrenCache.getCurrentData()) {
			try {
				result.add(new String(cd.getData(), "utf-8"));
			} catch (Throwable e) {
				LOG.warn(ExceptionUtils.getFullStackTrace(e));
			}
		}

		Collections.sort(result);
		return result;
	}
}
