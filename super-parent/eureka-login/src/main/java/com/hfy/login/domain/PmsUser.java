package com.hfy.login.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.context.annotation.Lazy;

import java.util.Date;


/**
 * The persistent class for the pms_user database table.
 * 
 */
@Entity()
@Table(name="pms_user")
@NamedQuery(name="PmsUser.findAll", query="SELECT p FROM PmsUser p")
public class PmsUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String account;

	private String address;

	private String avatar;

	@Temporal(TemporalType.DATE)
	private Date birthday;

	private String commiter;

	private String company;

	private String deleted;

	private int dept;

	private String email;

	private byte fails;

	private String gender;

	private String gtalk;

	private String ip;

	@Temporal(TemporalType.DATE)
	private Date join;

	private int last;

	@Column(name="level_id")
	private int levelId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date locked;

	private String mobile;

	private String nickname;

	private String password;

	private String phone;

	@Column(name="position_id")
	private int positionId;

	private String qq;

	private String ranzhi;

	private String realname;

	private String role;

	private String skype;

	private byte state;

	private int visits;

	private String wangwang;

	private String yahoo;

	private String zipcode;

	public PmsUser() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAvatar() {
		return this.avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getCommiter() {
		return this.commiter;
	}

	public void setCommiter(String commiter) {
		this.commiter = commiter;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDeleted() {
		return this.deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public int getDept() {
		return this.dept;
	}

	public void setDept(int dept) {
		this.dept = dept;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte getFails() {
		return this.fails;
	}

	public void setFails(byte fails) {
		this.fails = fails;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGtalk() {
		return this.gtalk;
	}

	public void setGtalk(String gtalk) {
		this.gtalk = gtalk;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Date getJoin() {
		return this.join;
	}

	public void setJoin(Date join) {
		this.join = join;
	}

	public int getLast() {
		return this.last;
	}

	public void setLast(int last) {
		this.last = last;
	}

	public int getLevelId() {
		return this.levelId;
	}

	public void setLevelId(int levelId) {
		this.levelId = levelId;
	}

	public Date getLocked() {
		return this.locked;
	}

	public void setLocked(Date locked) {
		this.locked = locked;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPositionId() {
		return this.positionId;
	}

	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getRanzhi() {
		return this.ranzhi;
	}

	public void setRanzhi(String ranzhi) {
		this.ranzhi = ranzhi;
	}

	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSkype() {
		return this.skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public byte getState() {
		return this.state;
	}

	public void setState(byte state) {
		this.state = state;
	}

	public int getVisits() {
		return this.visits;
	}

	public void setVisits(int visits) {
		this.visits = visits;
	}

	public String getWangwang() {
		return this.wangwang;
	}

	public void setWangwang(String wangwang) {
		this.wangwang = wangwang;
	}

	public String getYahoo() {
		return this.yahoo;
	}

	public void setYahoo(String yahoo) {
		this.yahoo = yahoo;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}