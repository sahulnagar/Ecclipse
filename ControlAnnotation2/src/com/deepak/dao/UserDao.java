package com.deepak.dao;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.deepak.model.User;
@Component
public class UserDao
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int addRecord(User user)
	{
		Object arr[]= {user.getUserName(),user.getUserPassword()};
		return jdbcTemplate.update("insert into login values(?,?)",arr);
	}
	
}
