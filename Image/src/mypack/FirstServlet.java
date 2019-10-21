package mypack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;



public class FirstServlet extends  HttpServlet
{

	public void  service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		ServletContext sc=getServletContext();
		String pic=sc.getInitParameter("Picture");
		out.println("<img src='Imagefolder/"+pic+"' width='50px' height='50px'>");
	}
}
