package dao;
import MyConnection.*;
import java.sql.*;
import model.*;

public class Userdao 
{
	private String sql;
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	

	public Userdao() throws Exception 
	{
		conn=myconnection.getConnection();
		
	}
	public String validate(User e)throws SQLException
	{
		sql="select * from login where userName=? and userPass=?";
		pst=conn.prepareStatement(sql);
		pst.setString(1,e.getUserName());
		pst.setString(2,e.getUserPass());
		
		rs=pst.executeQuery();
		if(rs.next())
		{
		
			return "welcome.jsp";
		
		}
		
		else
		{
		
			return "error.jsp";
		
		}
	}
	

}
