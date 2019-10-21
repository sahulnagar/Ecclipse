package employeedata;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;


public class deleteServlet extends HttpServlet


{
	public  void  service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<a href=index.html>HOME</a>");
		
		Integer eno=Integer.parseInt(req.getParameter("eno"));

		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			String sql="delete from employee where eno=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1,eno);
			
			int x=pst.executeUpdate();
			out.print(x+"delete sucessfully");
		}
		catch(Exception e)
		{
			out.println(e);
		}
		
	}

}

