package com.hfy.login.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hfy.login.domain.PmsUser;

public interface UserDao extends JpaRepository<PmsUser, String> {
	
	List<PmsUser> findPmsUserByAccount(String account);
 
}
