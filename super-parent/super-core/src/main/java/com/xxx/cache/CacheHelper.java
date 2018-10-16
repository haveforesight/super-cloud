package com.xxx.cache;

import com.xxx.cache.hazlcast.HazlcastCacheHelper;

public class CacheHelper {
	private static CacheHelper instance = new CacheHelper();
	
	/**
	 * 获取缓存实例
	 */
	public static CacheHelper getInstance(){
		return instance;
	}
	private static CacheInstance cacheInstance = new HazlcastCacheHelper();
	
	public static CacheBean getSystemCacheBean() {
		return cacheInstance!=null ? cacheInstance.getSystemCacheBean() : null ;
	}
	

}
