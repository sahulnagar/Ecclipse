package studentrecord;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class class2Servlet extends HttpServlet
{
	public void  service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		
		String name=req.getParameter("name");
		Integer phoneno=Integer.parseInt(req.getParameter("phoneno"));
		Integer percentage=Integer.parseInt(req.getParameter("percentage"));
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			String sql="insert into class2 values(?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, name);
			pst.setInt(2, phoneno);
			pst.setInt(3, percentage);
			int x=pst.executeUpdate();
			out.println(x+"record is entered");
		}
		catch(Exception e)
		{
			out.println(e);
		}
	}

}

