package com.hfy.login.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pms_user_setting database table.
 * 
 */
@Entity
@Table(name="pms_user_setting")
@NamedQuery(name="PmsUserSetting.findAll", query="SELECT p FROM PmsUserSetting p")
public class PmsUserSetting implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	@Lob
	private String value;

	public PmsUserSetting() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}