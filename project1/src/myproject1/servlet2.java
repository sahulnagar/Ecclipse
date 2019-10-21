package myproject1;
import javax.servlet.*;
import java.io.*;

public class servlet2 extends GenericServlet
{
	public  void init(ServletConfig args0) {}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<h1>first generic servlet</h1>");
		out.println("<a  href='index.html'>HOME</a>");
	
	}
	public String getServletInfo() {
		return null;
	}
	public void destroy() {}
	public ServletConfig getServletConfig() {return null;

}
}
