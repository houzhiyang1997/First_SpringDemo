package com.baobaotao.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.baobaotao.domain.LoginLog;


/**
 * 用户的登录日志
 * @title LoginLogDao
 * @author hzy
 * @date 2017年7月28日上午11:47:40
 * @version 1.0.0
 */




@Repository
public class LoginLogDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	/**
	 * 记录用户登录的id，时间，ip
	 * @title LoginLogDao
	 * @author hzy
	 * @date 2017年7月28日上午11:53:06
	 * @version 1.0.0
	 */
	public void insertLoginLog(LoginLog loginLog){
		String sqlStr = "INSERT INTO t_login_log(user_id,ip,login_datetime) VALUES(?,?,?)";
		Object[] args = {loginLog.getUserId(),loginLog.getIp(),loginLog.getLoginDate()};
		jdbcTemplate.update(sqlStr, args);
	}
	
}
