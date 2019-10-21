package mypack;
import java.sql.*;
import java.util.*;
import java.io.*;

public class Emp

{
	private Connection conn;
	private PreparedStatement pst;
	private String sql;
	private ResultSet rs;
	 
	
	public Emp()throws ClassNotFoundException,SQLException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		
	}
	private Integer eno;
	private String ename;
	private Integer esal;


	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Integer getEsal() {
		return esal;
	}
	public void setEsal(Integer esal) {
		this.esal = esal;
	}
	
	
	public Integer addRecord()throws SQLException
	{
		sql="insert into emp values(?,?,?)";
		pst=conn.prepareStatement(sql);
		pst.setInt(1, eno);
		pst.setString(2, ename);
		pst.setInt(3, esal);
		return pst.executeUpdate();
		
	}
	public Integer updateRecord()throws SQLException
	{
		sql="update emp set ename=?,esal=? where eno=? ";
		pst=conn.prepareStatement(sql);
		pst.setString(1, ename);
		pst.setInt(2,esal);
		pst.setInt(3,eno);
		return pst.executeUpdate();
	}
	public Integer deleteRecord()throws SQLException
	{
		sql="delete from emp where eno=?";
		pst=conn.prepareStatement(sql);
		pst.setInt(1, eno);
		return pst.executeUpdate();
	}
	public Emp findRecord()throws Exception
	{
		sql="select * from emp where eno=?";
		pst=conn.prepareStatement(sql);
		pst.setInt(1, eno);
		rs=pst.executeQuery();
		rs.next();
		
		
		Emp e=new Emp();
		e.setEno(rs.getInt("eno"));
		e.setEname(rs.getString("ename"));
		e.setEsal(rs.getInt("esal"));
		return e;
		
		
	}
	public List <Emp> findAllRecord()throws Exception
	{
		sql="select * from emp";
		pst=conn.prepareStatement(sql);
		
		rs=pst.executeQuery();
	
		List <Emp> l=new ArrayList<>();
		
		while(rs.next())
		{
		
		Emp e=new Emp();
		e.setEno(rs.getInt("eno"));
		e.setEname(rs.getString("ename"));
		e.setEsal(rs.getInt("esal"));
		l.add(e);
		}
		return l;
	
	}
}