package employeedata;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class findServlet extends HttpServlet
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
			String sql="select * from employee where eno="+eno;
			Statement st=conn.createStatement();
			

			ResultSet rs= st.executeQuery(sql);
			rs.next();
			out.print(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" ");
		}
		catch(Exception e)
		{
			out.println(e);
		}
		
	}

}


