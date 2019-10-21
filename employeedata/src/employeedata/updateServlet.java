package employeedata;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class updateServlet  extends HttpServlet
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
			String sql="update employee set ename=?,esal=? where eno=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(3,eno);
			pst.setString(1,ename);
			pst.setInt(2,esal);
			int x=pst.executeUpdate();
			out.print(x+"data updated");
		}
		catch(Exception e)
		{
			out.println(e);
		}
		
	}

}

