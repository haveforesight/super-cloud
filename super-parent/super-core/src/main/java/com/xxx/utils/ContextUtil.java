package com.xxx.utils;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ContextUtil {

	private static ApplicationContext applicationContext;
	
	static{
		ConvertUtils.register(new Converter(){
			@Override
			public Object convert(Class arg0, Object arg1) {
				return null;
			}
		}, java.util.Date.class); 
	}

	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	public static void setApplicationContext(ApplicationContext applicationContext) {
		ContextUtil.applicationContext = applicationContext;
	}
	
	
	@SuppressWarnings("unchecked")  
	public static <T> T getBean(String name) {  
	return (T) applicationContext.getBean(name);  
	}  
	
	public static <T> T getBean(Class<T> classs) {  
	return (T) applicationContext.getBean(classs);  
	}  
	  
	  
	
	

}
