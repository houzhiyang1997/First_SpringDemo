package com.baobaotao.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baobaotao.dao.LoginLogDao;
import com.baobaotao.dao.UserDao;
import com.baobaotao.domain.LoginLog;
import com.baobaotao.domain.User;


/**
 * 用户密码认证和登陆日志业务类
 * @title UserService
 * @author hzy
 * @date 2017年7月28日下午5:16:45
 * @version 1.0.0
 */
@Service//标注为一个服务层的bean
public class UserService {
	@Autowired
	private UserDao userDao;
	@Autowired
	private LoginLogDao loginLogDao;
	
	/**
	 * 检查用户名和密码的正确性
	 * @param userName
	 * @param password
	 * @return boolean
	 */
	public boolean hasMatchUser(String userName, String password){
		int matchCount = userDao.getMatchCount(userName, password);
		return matchCount>0;
	}
	
	/**
	 * 查找User对象
	 * @param userName
	 * @return User
	 */
	public User findUserByUserName(String userName){
		return userDao.findUserByUserName(userName);
	}
	
	/**
	 * 1.更新用户信息
	 * 2.更新登录日志
	 * @param user void
	 */
	public void loginSuccess(User user){
		user.setCredits(5+user.getCredits());
		LoginLog loginLog = new LoginLog();
		loginLog.setUserId(user.getUserId());
		loginLog.setIp(user.getLastIp());
		loginLog.setLoginDate(user.getLastVisit());
		userDao.updateLoginInfo(user);
		loginLogDao.insertLoginLog(loginLog);
	}
}
