package mypack;
import javax.servlet.*;
import java.io.*;

public class Filter3 implements Filter
{
	public void init(FilterConfig fc)
	{
		
	}
	
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain fc1)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		String username=req.getParameter("userName");
		String userpassword=req.getParameter("userPass");
		
		if(userpassword.length()<6)
		{
			out.println("wel");
		}
		else
		{
			out.println("password must be less than six letter");
		}
	}
	public void destroy()
	{
		
	}
}
