package com.xxx.es.domain;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName="index",type="fulltext")
public class DemoEntity {
	
	private String id ;
	
	private String content;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
