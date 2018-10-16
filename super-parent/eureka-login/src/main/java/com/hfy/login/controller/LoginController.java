package com.hfy.login.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hfy.login.domain.PmsUser;
import com.hfy.login.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/login")
	@ResponseBody
	public Object login(String account,String password) {
		PmsUser user = loginService.findPmsUserByAccount("admin");
		
		return "200";
	}

}
