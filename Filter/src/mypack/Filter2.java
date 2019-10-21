package mypack;
import javax.servlet.*;
import java.io.*;

public class Filter2 implements Filter
{
	public void init(FilterConfig fc)
	{
		
	}
	
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain fc1)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		out.println("-------------------");
		fc1.doFilter(req, res);
		out.print("----------------------");
	}
	public void destroy()
	{
		
	}
}
