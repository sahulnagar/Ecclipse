package mypack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import dao.*;
import model.*;
import java.sql.*;


public class FindServlet extends HttpServlet 
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		Integer eno=Integer.parseInt(req.getParameter("eno"));
		
		try
		{
			Emp emp=new Emp();
			
			emp.setEno(eno);

			
			
			Empdao empdao=new  Empdao();
			emp=empdao.FindRecord(emp);
			out.println("no is"+emp.getEno()+"<hr>");
			out.println("name is"+emp.getEname()+"<hr>");
			out.println("sal is"+emp.getEsal()+"<hr>");
		
		}
		catch(Exception e)
		{
			out.println(e);
			
		}
	}
	

}
