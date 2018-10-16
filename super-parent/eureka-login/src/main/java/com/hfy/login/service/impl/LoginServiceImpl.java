package com.hfy.login.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hfy.login.domain.PmsUser;
import com.hfy.login.repository.UserDao;
import com.hfy.login.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private UserDao sysUserDao;

	@Override
	public PmsUser findPmsUserByAccount(String userName) {
		List<PmsUser> users = sysUserDao.findPmsUserByAccount(userName);
//		if(!CollectionUtils.isEmpty(users)) {
//			return users.get(0);
//		}
		return null;
	}

}
