package mypack;
import javax.servlet.*;
import javax.servlet.http.*;
import model.*;
import dao.*;
import java.sql.*;
import java.io.*;


public class UpdateServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		
		Integer eno=Integer.parseInt(req.getParameter("eno"));
		String ename=req.getParameter("eno");
		Integer esal=Integer.parseInt(req.getParameter("esal"));
		
		try
		{
			Emp emp=new Emp();
			emp.setEname(ename);
			emp.setEno(eno);
			emp.setEsal(esal);
			
			
			Empdao empdao=new Empdao();
			int x=empdao.addRecord(emp);
			if(x>0)
			{
				out.println(x+"record updated");
			}
			
		}
		catch(Exception e)
		{
			out.println(e);
		}
		
	}

}
