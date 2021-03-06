package com.baobaotao.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 领域对象 LoginLog
 * @title LoginLog
 * @author hzy
 * @date 2017年7月28日上午10:06:06
 * @version 1.0.0
 */

public class LoginLog implements Serializable {
	private int loginLogId;
	private int userId;
	private String ip;
	private Date loginDate;
	public int getLoginLogId() {
		return loginLogId;
	}
	public void setLoginLogId(int loginLogId) {
		this.loginLogId = loginLogId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public Date getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
	
	
}
