package MyConnection;
import java.sql.*;
import dao.*;
import java.util.*;
public class myconnection 
{
	private myconnection() {}
	private static Connection conn;
	
	public static Connection getConnection() throws ClassNotFoundException,SQLException
	{
		if(conn==null)
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		}
		return conn;
	}
}
