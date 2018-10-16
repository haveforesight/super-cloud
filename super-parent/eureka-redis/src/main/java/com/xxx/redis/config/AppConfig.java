package com.xxx.redis.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;

public class AppConfig {
	
	@Bean("redisCacheManager")
	public RedisCacheManager redisCacheManager( RedisConnectionFactory redisConnectionFactory) {
		return RedisCacheManager.create(redisConnectionFactory);
	}

	@Bean("cacheManager")
	@Primary
	public CacheManager initMixCacheManager(RedisCacheManager redisCacheManager,
			EhCacheManagerFactoryBean ehCacheManager) {
		AppCacheManager cacheManager = new AppCacheManager();
		cacheManager.setRedisCacheManager(redisCacheManager);
		cacheManager.setEhCacheCacheManager(new EhCacheCacheManager(ehCacheManager.getObject()));
		return cacheManager;
	}

	@Bean
	public EhCacheManagerFactoryBean ehCacheCacheManager() {
		EhCacheManagerFactoryBean cmfb = new EhCacheManagerFactoryBean();
		cmfb.setConfigLocation(new ClassPathResource("ehcache.xml"));
		cmfb.setShared(true);
		return cmfb;
	}

}
