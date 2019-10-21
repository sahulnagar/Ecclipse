package mypack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class deleteServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		Integer eno=Integer.parseInt(req.getParameter("eno"));
		
		try
		{
		Emp e=new Emp();
		e.setEno(eno);
		
		int x=e.deleteRecord();
		if(x>0)
			{
			out.println(x+"sucessfully deleted");
			}
		}
	   catch(Exception e)
	   {
		   out.println(e);
	   }
		}
		
	}


