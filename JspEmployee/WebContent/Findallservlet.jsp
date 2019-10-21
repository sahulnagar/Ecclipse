<%@ page import= "java.sql.*"%>
<%

	
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
String sql="select * from employee" ;
Statement st=conn.createStatement();
ResultSet rs= st.executeQuery(sql);
while(rs.next())
{
out.print(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+"<br>");
}


			%>