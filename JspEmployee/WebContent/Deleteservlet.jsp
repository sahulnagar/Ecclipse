<%@ page import= "java.sql.*"%>
<%

	Integer eno=Integer.parseInt(request.getParameter("eno"));
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
String sql="delete from employee where eno=?";
PreparedStatement pst=conn.prepareStatement(sql);
pst.setInt(1,eno);

int x=pst.executeUpdate();
out.print(x+"delete sucessfully");

			%>