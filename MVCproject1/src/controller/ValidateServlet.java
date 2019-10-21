package controller;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import dao.*;
import model.*;
public class ValidateServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		String userName=req.getParameter("userName");
		String userPassword=req.getParameter("userPassword");
		try 
		{
		
		User user=new User();
		user.setUserName(userName);
		user.setUserPassword(userPassword);
		
		UserDao userDao=new UserDao();
		Boolean b=userDao.validate(user);
		
		if(b==true)
		{
			res.sendRedirect("hello");
		}
		else
		{
			res.sendRedirect("error");
		}
		}
		catch(Exception e)
		{
			out.println(e);
		}
	}
}
