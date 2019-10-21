package dao;
import java.sql.*;
import java.io.*;
import java.util.*;
import myconnection.*;
import controller.*;
import model.*;

public class UserDao 

{
	private Connection conn;
	private String sql;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public UserDao()throws Exception
	{
		conn=MyConnection.getConnection();
	
	}
	public Boolean validate(User e)throws SQLException
	{
		sql="select * from login where userName=? and userPassword=?";
		pst=conn.prepareStatement(sql);
		pst.setString(1,e.getUserName());
		pst.setString(2,e.getUserPassword());
		
		rs=pst.executeQuery();
		if(rs.next())
		return true;
		else
			return false;
		}
}

		
