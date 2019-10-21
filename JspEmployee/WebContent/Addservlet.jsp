<%@ page import= "java.sql.*"%>
<%

	Integer eno=Integer.parseInt(request.getParameter("eno"));
	String ename=request.getParameter("ename");
Integer esal=Integer.parseInt(request.getParameter("esal"));


			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			String sql="insert into employee values(?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1,eno);
			pst.setString(2,ename);
			pst.setInt(3,esal);
			int x=pst.executeUpdate();
			out.print(x+"added sucesfully");
			%>