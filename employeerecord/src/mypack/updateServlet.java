package mypack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class updateServlet extends HttpServlet
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
			
			int x=e.updateRecord();
			if(x>0)
			{
			out.println(x+"update record");
			}
		}
		catch(Exception e)
		{
			out.println(e);
		}
	}

}
