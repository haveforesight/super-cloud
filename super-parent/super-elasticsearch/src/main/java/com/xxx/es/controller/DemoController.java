package com.xxx.es.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xxx.es.domain.DemoEntity;
import com.xxx.es.repository.DemoRepository;
import com.xxx.es.service.SuUserService;

@Controller
@RequestMapping("/")
public class DemoController {
	
	@Autowired
	private SuUserService suUserService;
	
	@Autowired
	private ElasticsearchTemplate template;
	
	@Autowired
	private DemoRepository repository;
	
	@RequestMapping("/user")
	@ResponseBody
	public Object user(String name){
		Optional<DemoEntity> optional = repository.findById("1");
		DemoEntity entity = optional.get();
		System.out.println(entity.getContent());
		return suUserService.findSuUserByName(name);
	}
	

}
