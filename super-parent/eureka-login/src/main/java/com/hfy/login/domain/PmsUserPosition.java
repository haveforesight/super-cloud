package com.hfy.login.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the pms_user_position database table.
 * 
 */
@Entity
@Table(name="pms_user_position")
@NamedQuery(name="PmsUserPosition.findAll", query="SELECT p FROM PmsUserPosition p")
public class PmsUserPosition implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="create_time")
	private Date createTime;

	@Column(name="eng_name")
	private String engName;

	@Column(name="position_desc")
	private String positionDesc;

	@Column(name="position_name")
	private String positionName;

	private byte sort;

	public PmsUserPosition() {
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

	public String getPositionDesc() {
		return this.positionDesc;
	}

	public void setPositionDesc(String positionDesc) {
		this.positionDesc = positionDesc;
	}

	public String getPositionName() {
		return this.positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public byte getSort() {
		return this.sort;
	}

	public void setSort(byte sort) {
		this.sort = sort;
	}

}