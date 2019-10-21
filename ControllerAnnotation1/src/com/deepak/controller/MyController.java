package com.deepak.controller;

import javax.servlet.http.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController
{
	
	@RequestMapping("/add")
	public String process(HttpServletRequest req,Model m)
	{
		String userName=req.getParameter("userName");
		String userPass=req.getParameter("userPass");
		
		if(userName.equals("sahul")&& userPass.equals("Nagar"))
		{
			m.addAttribute( "msg","welcome"+userName);
			return "welcome";
		}
		else
		{
			m.addAttribute("msg1","wrong"+userName);
			return "error";
		}
	
		
	}

}
