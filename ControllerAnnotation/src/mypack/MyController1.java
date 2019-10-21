package mypack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MyController1 implements Controller
{

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception 
	{
		String userName=req.getParameter("userName");
		String userPassword=req.getParameter("userPassword");
		if(userName.equals("sahul")&& userPassword.equals("Nagar"))
		{
			return new ModelAndView("welcome","msg",userName+"welcome");
		}
		else
		{
			return new ModelAndView("error","msg2",userName+"unauhorized user");
		}
		
	}

}
