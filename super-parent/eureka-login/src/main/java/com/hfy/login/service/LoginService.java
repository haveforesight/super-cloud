package com.hfy.login.service;

import com.hfy.login.domain.PmsUser;

public interface LoginService {
	
	 PmsUser findPmsUserByAccount(String userName);

}
