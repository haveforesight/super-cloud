//package com.hfy.zuul.filter;
//
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.stereotype.Component;
//
//import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.context.RequestContext;
//
//@Component
//public class ResponseHeaderFilter extends ZuulFilter{
//
//	@Override
//	public Object run() {
//		
//		RequestContext ctx = RequestContext.getCurrentContext();
//		
//		HttpServletResponse response = ctx.getResponse();
//		
//		response.setHeader("Access-Control-Allow-Origin", "*");  
//		response.setHeader("Access-Control-Allow-Headers", "Content-Type,Content-Length, Authorization, Accept,X-Requested-With");  
//		response.setHeader("Access-Control-Allow-Methods","PUT,POST,GET,DELETE,OPTIONS");  
//		return null;
//	}
//
//	@Override
//	public boolean shouldFilter() {
//		return true;
//	}
//
//	@Override
//	public int filterOrder() {
//		return 0;
//	}
//
//	@Override
//	public String filterType() {
//		return "pre";
//	}
//
//}
