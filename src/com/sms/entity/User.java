package com.sms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "p_user")
public class User {
	private Integer id;
	private String password;
	private Integer userType;
	
	/**
	 * 职工号 六位数字组成
	 * */
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name="password", length=20, nullable=false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 用户类型： 0代表普通用户 1代表操作员 2代表审核员
	 * */
	@Column(name="userType", nullable=false)
	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = 0;
		if (userType < 3 && userType >=0) {
			this.userType = userType;
		}
	}
}
