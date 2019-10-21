package mypack;
import javax.servlet.*;
import java.io.*;

public class Filter1 implements Filter
{
	public void init(FilterConfig fc)
	{
		
	}
	
	public void doFilter(ServletRequest req,ServletResponse res,FilterChain fc1)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		out.println("<h1>filter in</h1>");
		fc1.doFilter(req, res);
		out.print("<h1>filter out</h1>");
	}
	public void destroy()
	{
		
	}
}
