package com.xxx.es.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.xxx.es.domain.DemoEntity;

public interface DemoRepository extends ElasticsearchRepository<DemoEntity, String>{

}
