package myemp;
import java.sql.*;


public interface Construct
{
	int addRecord(employee e)throws SQLException;
	int updateRecord(employee e)throws SQLException;
	int deleteRecord(employee e)throws SQLException;
}
