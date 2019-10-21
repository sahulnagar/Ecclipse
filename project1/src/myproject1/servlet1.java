package myproject1;
import javax.servlet.*;
import java.io.*;

public class servlet1 implements Servlet
{
	
	public void init(ServletConfig args0)throws ServletException {}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
	out.println("<h1>my first servlet</h1>");
	out.println("<a  href='index.html'>HOME</a>");
	}
	public void destroy() {}
	public String getServletInfo() {return null;}
	public ServletConfig getServletConfig() {return null;}


}
