package com.xxx.cache.hazlcast;

import com.xxx.cache.CacheBean;
import com.xxx.cache.CacheInstance;
import com.xxx.cache.hazlcast.impl.CacheBeanImpl;
import com.xxx.utils.ContextUtil;

public class HazlcastCacheHelper implements CacheInstance {
	
	@Override
	public CacheBean getSystemCacheBean() {
		return ContextUtil.getBean(CacheBeanImpl.class).getCacheInstance("system_cache");
	}

}
