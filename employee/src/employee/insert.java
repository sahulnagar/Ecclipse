package employee;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import java.io.*;



public class insert  extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse rec)throws ServletException,IOException
	{
		rec.setContentType("text/http");
		PrintWriter out=rec.getWriter();
		
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
			out.println(x+"record added in table");
		}
		catch(Exception e)
		{
			out.print(e);
		}
		
		}
}
