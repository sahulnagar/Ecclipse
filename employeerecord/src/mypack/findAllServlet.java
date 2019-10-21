package mypack;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class findAllServlet extends HttpServlet
  {

    public void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		
		
		try
		{
			Emp e=new  Emp();
			List<Emp> l=new  ArrayList<>();
			l=e.findAllRecord();
			Iterator <Emp> itr= l.iterator();
			while(itr.hasNext())
			{
			
			
			e=itr.next();
			out.println("no is"+e.getEno()+"<hr>");
			out.println("name is"+e.getEname()+"<hr>");
			out.println("sal is"+e.getEsal()+"<hr>");
		
			}
			
		}
		catch(Exception e)
		{
			out.println(e);
			
		}
	}
	

}

