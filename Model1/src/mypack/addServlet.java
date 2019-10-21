package mypack;
import dao.*;
import java.sql.*;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import model.*;

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
			Emp emp =new Emp();
			emp.setEno(eno);
			emp.setEname(ename);
			emp.setEsal(esal);
			  
			
			Empdao empdao=new Empdao();
			int x=empdao.addRecord(emp);
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
