package com.xxx.redis.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@Configuration
public class RedisConfig {
	
	@Autowired 
	ClusterConfigurationProperties clusterProperties;
	
	@Bean
	public RedisConnectionFactory connectionFactory() {
        return new JedisConnectionFactory(
            new RedisClusterConfiguration(clusterProperties.getNodes()));
    }
	
	@SuppressWarnings("rawtypes")
	@Bean
	public RedisTemplate redisTemplate() {
		RedisTemplate redis = new RedisTemplate();
		redis.setConnectionFactory(connectionFactory());
		return redis;
	}

}
