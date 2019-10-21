package employeedata;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class addServlet extends HttpServlet
{
	public  void  service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<a href=index.html>HOME</a>");
		
		Integer eno=Integer.parseInt(req.getParameter("eno"));
		String ename=req.getParameter("ename");
		Integer esal=Integer.parseInt(req.getParameter("esal"));
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			String sql="insert into employee values(?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1,eno);
			pst.setString(2,ename);
			pst.setInt(3,esal);
			int x=pst.executeUpdate();
			out.print(x);
		}
		catch(Exception e)
		{
			out.println(e);
		}
		
	}

}
