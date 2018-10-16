package com.hfy.project.api.model;

import java.util.List;

public class UserModel {
	
	private List<String> address;
	
	private String userName;

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
