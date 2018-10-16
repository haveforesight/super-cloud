package com.hfy.login.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pms_user_token database table.
 * 
 */
@Entity
@Table(name="pms_user_token")
@NamedQuery(name="PmsUserToken.findAll", query="SELECT p FROM PmsUserToken p")
public class PmsUserToken implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="token_id")
	private int tokenId;

	@Column(name="client_type")
	private String clientType;

	@Column(name="login_ip")
	private String loginIp;

	@Column(name="login_time")
	private int loginTime;

	private String token;

	@Column(name="user_id")
	private int userId;

	@Column(name="user_name")
	private String userName;

	public PmsUserToken() {
	}

	public int getTokenId() {
		return this.tokenId;
	}

	public void setTokenId(int tokenId) {
		this.tokenId = tokenId;
	}

	public String getClientType() {
		return this.clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public String getLoginIp() {
		return this.loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public int getLoginTime() {
		return this.loginTime;
	}

	public void setLoginTime(int loginTime) {
		this.loginTime = loginTime;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}