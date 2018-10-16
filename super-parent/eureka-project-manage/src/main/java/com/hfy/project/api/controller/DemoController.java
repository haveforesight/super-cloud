package com.hfy.project.api.controller;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DemoController {

	@Autowired
	private CacheManager cacheManager;

	@SuppressWarnings("resource")
	@RequestMapping("/api")
	public void get(HttpServletRequest reqeust, HttpServletResponse response) {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\fuxin\\Pictures\\a.jpg");
			int a = 0;
			BufferedInputStream bis = new BufferedInputStream(fis);
		
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	@RequestMapping("/download")
	public String download(HttpServletResponse response) {
		
		return "";
	}

}
