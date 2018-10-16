package com.xxx.redis.config;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;

public class AppCacheManager implements CacheManager{

	private CacheManager redisCacheManager;  
	private CacheManager ehCacheManager; 
	
	private final static String ehcachePrefix = "eheache";
 
	@Override
	public Cache getCache(String name) {
		if (name.startsWith(ehcachePrefix))  {
			return ehCacheManager.getCache(name);  
		} else {
			return redisCacheManager.getCache(name);  
		}
	}
 
	@Override
	public Collection<String> getCacheNames() {
	    Collection<String> cacheNames = new ArrayList<String>();          
        if (redisCacheManager != null) {  
            cacheNames.addAll(redisCacheManager.getCacheNames());  
        }  
        if (ehCacheManager != null) {  
            cacheNames.addAll(ehCacheManager.getCacheNames());  
        }         
        return cacheNames;  
	}
 
	public CacheManager getRedisCacheManager() {
		return redisCacheManager;
	}
 
	public void setRedisCacheManager(CacheManager redisCacheManager) {
		this.redisCacheManager = redisCacheManager;
	}
 
	public CacheManager getEhCacheCacheManager() {
		return ehCacheManager;
	}
 
	public void setEhCacheCacheManager(CacheManager ehcacheCacheManager) {
		this.ehCacheManager = ehcacheCacheManager;
	}


}
