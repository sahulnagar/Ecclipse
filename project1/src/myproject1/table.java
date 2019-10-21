package myproject1;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class table extends HttpServlet 
{

	public void  service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		Integer  num=Integer.parseInt(req.getParameter("num"));
		for(int ctr=1;ctr<=10;ctr++)
		{
			out.println(num+"*"+ctr+"="+num*ctr+"<br><br>");
		}
		out.println("<a href='default.html'>home2</a>");
	}
	
	}						

