package com.xxx.es.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xxx.es.domain.SuUser;


public interface SuUserRepository extends JpaRepository<SuUser, String>{
	
	public List<SuUser> findSuUserByName(String name);

}
