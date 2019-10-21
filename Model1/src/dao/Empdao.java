package dao;
import java.util.*;
import model.*;
import mypack.*;

import java.io.*;
import java.sql.*;

public class Empdao 
{
		private String sql;
		private Connection conn;
		private PreparedStatement pst;
		ResultSet rs;
		public Empdao()throws ClassNotFoundException,SQLException
		{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		}
		public Integer addRecord(Emp emp)throws SQLException
		{
			sql="insert into emp values(?,?,?)";
			pst=conn.prepareStatement(sql);
			pst.setInt(1,emp.getEno());
			pst.setString(2,emp.getEname());
			pst.setInt(3,emp.getEsal());
			return pst.executeUpdate();
		}
		public Integer updateRecord(Emp emp)throws SQLException
		{
			sql="update emp set ename=?,esal=? where eno=?";
			pst=conn.prepareStatement(sql);
			pst.setString(1, emp.getEname());
			pst.setInt(2, emp.getEsal());
			pst.setInt(3, emp.getEno());
			return pst.executeUpdate();
		}
		
		public Emp FindRecord(Emp emp)throws Exception
		{
		sql="select * from emp where eno=?";
		pst=conn.prepareStatement(sql);
		pst.setInt(1, emp.getEno());
		rs=pst.executeQuery();
		rs.next();
		emp.setEno(rs.getInt("eno"));
		emp.setEname(rs.getString("ename"));
		emp.setEsal(rs.getInt("esal"));
		return emp;
	

		}
		public List <Emp> FindAllRecord(Emp emp) throws SQLException
		{
			sql="select * from emp";
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			List <Emp> l=new ArrayList<>();
				while(rs.next())
			{
					emp.setEno(rs.getInt("eno"));
					emp.setEname(rs.getString("ename"));
					emp.setEsal(rs.getInt("esal"));
			l.add(emp);	
			}
				return l;
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
}

