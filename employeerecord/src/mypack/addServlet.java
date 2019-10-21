package mypack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class addServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		Integer eno=Integer.parseInt(req.getParameter("eno"));
		String ename=req.getParameter("ename");
		Integer esal=Integer.parseInt(req.getParameter("esal"));
		try
		{
			Emp e=new Emp();
			e.setEno(eno);
			e.setEname(ename);
			e.setEsal(esal);
			
			int x=e.addRecord();
			if(x>0)
			{
				out.println(x+"record added");
			}
		}
			catch(Exception e)
			{
				out.println(e);
			}
			
			
		}
	

}
