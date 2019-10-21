package com.deepak.controller;

import com.deepak.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.deepak.dao.UserDao;

@Controller
public class ValidateController 
{
	@Autowired
	private UserDao userDao;
	
	@RequestMapping("/insert")
	public String validate(@ModelAttribute("user") User user,Model m)//throws Exception
	{
		userDao.addRecord(user);
		m.addAttribute("valid",user.getUserName());
		return "welcome";
	}

}
