package mypack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class findServlet extends HttpServlet 
{
	public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		Integer eno=Integer.parseInt(req.getParameter("eno"));
		
		try
		{
			Emp e=new  Emp();
			e.setEno(eno);
			
			
			e=e.findRecord();
			out.println("no is"+e.getEno()+"<hr>");
			out.println("name is"+e.getEname()+"<hr>");
			out.println("sal is"+e.getEsal()+"<hr>");
		
		}
		catch(Exception e)
		{
			out.println(e);
			
		}
	}
	

}
