<%@ page import= "java.sql.*"%>
<%

	Integer eno=Integer.parseInt(request.getParameter("eno"));
	String ename=request.getParameter("ename");
Integer esal=Integer.parseInt(request.getParameter("esal"));

Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
String sql="update employee set ename=?,esal=? where eno=?";
PreparedStatement pst=conn.prepareStatement(sql);
pst.setInt(3,eno);
pst.setString(1,ename);
pst.setInt(2,esal);
int x=pst.executeUpdate();
out.print(x+"data updated");


			%>