package com.xxx.redis.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisUtil {
	
	@Autowired
	private StringRedisTemplate redisTemplate;

	public void set() {
		redisTemplate.opsForValue().set("foo", "demo");
	}

}
