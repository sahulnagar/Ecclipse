<%@ page import= "java.sql.*"%>
<%

	Integer eno=Integer.parseInt(request.getParameter("eno"));
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
String sql="select * from employee where eno="+eno;
Statement st=conn.createStatement();


ResultSet rs= st.executeQuery(sql);
rs.next();
out.print(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" ");


			%>