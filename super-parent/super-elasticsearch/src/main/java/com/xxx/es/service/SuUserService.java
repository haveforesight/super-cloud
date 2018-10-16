package com.xxx.es.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.xxx.es.domain.SuUser;
import com.xxx.es.repository.SuUserRepository;

@Service
public class SuUserService {
	
	@Autowired
	private SuUserRepository suUserRepository;
	
	
	public SuUser findSuUserByName(String userName){
		List<SuUser> users = suUserRepository.findSuUserByName(userName);
		return CollectionUtils.isEmpty(users) ? null : users.get(0);
	}

}
