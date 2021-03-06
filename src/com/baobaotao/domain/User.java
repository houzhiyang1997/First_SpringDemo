package com.baobaotao.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 领域对象User
 * @title User
 * @author hzy
 * @date 2017年7月28日上午10:01:15
 * @version 1.0.0
 */

public class User implements Serializable {
	private int userId;
	private String userName;
	private String password;
	private int credits;
	private String lastIp;
	private Date lastVisit;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public String getLastIp() {
		return lastIp;
	}
	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}
	public Date getLastVisit() {
		return lastVisit;
	}
	public void setLastVisit(Date lastVisit) {
		this.lastVisit = lastVisit;
	}
	
	
}
