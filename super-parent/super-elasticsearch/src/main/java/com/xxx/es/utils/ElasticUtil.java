package com.xxx.es.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.xpack.client.PreBuiltXPackTransportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ElasticUtil {
	
	@SuppressWarnings("resource")
	@Bean
	public TransportClient transportClient() throws UnknownHostException {
			
		TransportClient client = new PreBuiltXPackTransportClient(Settings.builder()
	            .put("xpack.security.user", "elastic:123456")
	            .put("cluster.name", "elasticsearch")
	            .build()).addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("192.168.20.134"), 9300));
	    return client;
	    }
	

}
