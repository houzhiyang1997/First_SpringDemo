package com.baobaotao.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.baobaotao.domain.User;

/**
 * 访问User的Dao
 * @title UserDao
 * @author hzy
 * @date 2017年7月28日上午11:16:49
 * @version 1.0.0
 */
@Repository//通过Spring注解定义一个Dao
public class UserDao {
	
	@Autowired//自动注入JdbcTemplate的Bean
	private JdbcTemplate jdbcTemplate;
	
	/**
	 * 根据用户名和密码获取匹配的用户
	 * @param userName
	 * @param password
	 * @return
	 */
	
	public int getMatchCount(String userName, String password){
		String sqlStr = "SELECT count(*) FROM t_user WHERE user_name=? and password=?";
		
		return jdbcTemplate.queryForInt(sqlStr,new Object[]{userName,password});
	}
	
	/**
	 * 根据用户名获取User对象
	 * @param userName
	 * @return User
	 */
	
	public User findUserByUserName(final String userName){
		String sqlStr = "SELECT user_id,user_name,credits FROM t_user WHERE user_name=?";
		final User user = new User();
		jdbcTemplate.query(sqlStr, new Object[]{userName}, new RowCallbackHandler() {
			
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
				user.setUserId(rs.getInt("user_id"));
				user.setUserName(userName);
				user.setCredits(rs.getInt("credits"));
			}
		});
		return user;
		
	}
	
	/**
	 * 更新用户积分、最后登录IP以及最后登录时间
	 * @param user void
	 */
	public void updateLoginInfo(User user){
		String sqlStr = "UPDATE t_user SET last_visit=?,last_ip=?,credits=? WHERE user_id=?";
		jdbcTemplate.update(sqlStr, new Object[]{user.getLastVisit(),user.getLastIp(),user.getCredits(),user.getUserId()});
	}
}
