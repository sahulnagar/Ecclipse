package view;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ErrorServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		out.print("error page");
		
	}
}
