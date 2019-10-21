package myemp;
import java.sql.*;
import java.util.*;
import javax.sql.DataSource;

public class Employeebean implements Construct{
	private DataSource dataSource;
	public void setDataSource(DataSource dataSource)
	{
		this.dataSource=dataSource;
	}
	private PreparedStatement pst;
	private String sql;
	private Connection conn;
	public int addRecord(employee e)throws SQLException
	{
		sql="insert into emp2 values(?,?,?)";
		conn=dataSource.getConnection();
		pst=conn.prepareStatement(sql);
		pst.setInt(1,e.getEno());
		pst.setString(2,e.getEname());
		pst.setInt(3,e.getEsal());
		return pst.executeUpdate();
	}
	public int updateRecord(employee e)throws SQLException
	{
		sql="update emp2 set ename=?,esal=?where eno=?";
		conn=dataSource.getConnection();
		pst=conn.prepareStatement(sql);
		pst.setInt(3,e.getEno());
		pst.setString(1,e.getEname());
		pst.setInt(2,e.getEsal());
		return pst.executeUpdate();
	}
	public int deleteRecord(employee e)throws SQLException
	{
		sql="delete from emp2 where(eno=?)";
		conn=dataSource.getConnection();
		pst=conn.prepareStatement(sql);
		pst.setInt(1,e.getEno());
		return pst.executeUpdate();
	}
	
}

