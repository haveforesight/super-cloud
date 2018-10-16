package com.xxx.config;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import com.xxx.utils.ContextUtil;

@Component
public class StartListener implements ApplicationListener<ContextRefreshedEvent>{

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		if(ContextUtil.getApplicationContext() ==null){
			ContextUtil.setApplicationContext(arg0.getApplicationContext());
		}
	}

}
