package com.xxx.cache.hazlcast.impl;

import java.util.Collection;
import java.util.concurrent.locks.Lock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hazelcast.com.eclipsesource.json.JsonObject;
import com.hazelcast.core.HazelcastInstance;
import com.xxx.cache.CacheBean;

@Service
public class CacheBeanImpl implements CacheBean{
	
	@Autowired
	public HazelcastInstance hazelcastInstance;	
	
	public String cacheName;
	
	public String getCacheName() {
		return cacheName;
	}

	public void setCacheName(String cacheName) {
		this.cacheName = cacheName;
	}

	public HazelcastInstance getHazelcastInstance() {
		return hazelcastInstance;
	}

	@Override
	public void put(String key, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object delete(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(String key, Object object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getCacheObject(String key) {
		return this.getHazelcastInstance().getMap(this.getCacheName()).get(key);
	}

	@Override
	public Object getCacheObject(String key, Object defaultValue) {
		return null;
	}

	@Override
	public Collection<?> getAllCacheObject() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CacheBean getCacheInstance(String cacheName) {
		this.setCacheName(cacheName);
		return this;
	}

	@Override
	public Object getCache() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public JsonObject getStatics() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lock getLock(String lock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getAtomicLong(String cacheName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setAtomicLong(String cacheName, long start) {
		// TODO Auto-generated method stub
		
	}
	


}
