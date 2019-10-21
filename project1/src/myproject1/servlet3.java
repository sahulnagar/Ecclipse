package myproject1;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class servlet3 extends HttpServlet 
{
	public void init(ServletConfig args0) {
	
	}
public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
{
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	out.println("<h1 >first http servlet</h1>");
	out.println("<a  href='default.html'>HOME</a>");

}
public void destroy() {}
public String getServletInfo() {
	return null;
}
public ServletConfig getServletConfig() {
	return null;
}
}

