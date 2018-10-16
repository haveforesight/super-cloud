package com.hfy.login.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the pms_user_level database table.
 * 
 */
@Entity
@Table(name="pms_user_level")
@NamedQuery(name="PmsUserLevel.findAll", query="SELECT p FROM PmsUserLevel p")
public class PmsUserLevel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="eng_name")
	private String engName;

	@Column(name="level_desc")
	private String levelDesc;

	@Column(name="level_name")
	private String levelName;

	private byte sort;

	public PmsUserLevel() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getEngName() {
		return this.engName;
	}

	public void setEngName(String engName) {
		this.engName = engName;
	}

	public String getLevelDesc() {
		return this.levelDesc;
	}

	public void setLevelDesc(String levelDesc) {
		this.levelDesc = levelDesc;
	}

	public String getLevelName() {
		return this.levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public byte getSort() {
		return this.sort;
	}

	public void setSort(byte sort) {
		this.sort = sort;
	}

}