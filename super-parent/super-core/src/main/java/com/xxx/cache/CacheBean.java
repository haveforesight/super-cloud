package com.xxx.cache;

import java.util.Collection;
import java.util.concurrent.locks.Lock;

import com.hazelcast.com.eclipsesource.json.JsonObject;

public interface CacheBean {
	/**
	 * 
	 */
	public void put(String key , Object value ) ;
	
	/**
	 * 
	 */
	public void clear();
	
	
	public Object delete(String key) ;
	
	public void update(String key , Object object) ;
	
	/**
	 * 
	 * @param key
	 * @param orgi
	 * @return
	 */
	public Object getCacheObject(String key) ;
	
	
	/**
	 * 
	 * @param key
	 * @param orgi
	 * @return
	 */
	public Object getCacheObject(String key,Object defaultValue) ;
	
	/**
	 * 获取所有缓存对象
	 * @param orgi
	 * @return
	 */
	public Collection<?> getAllCacheObject() ; 
	
	
	public CacheBean getCacheInstance(String cacheName);
	
	public Object getCache();
	
	public JsonObject getStatics();

	public Lock getLock(String lock);
	
	public long getSize();
	
	public long getAtomicLong(String cacheName) ;
	
	public void setAtomicLong(String cacheName , long start) ;	//初始化 发号器
	
}
