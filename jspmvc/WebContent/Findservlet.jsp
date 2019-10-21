<%@ page import="java.sql.*,dao.*,model.*"%>
<%
	Integer eno=Integer.parseInt(request.getParameter("eno"));

	Emp emp=new Emp();
	emp.setEno(1,eno);
	emp.setEname(1,ename);
	emp.setEsal(1,esal);
	
	EmpDao empdao=new EmpDao();
	int x=empdao.FindRecord(emp);
	out.println("no is"+emp.getEno()+"<hr>");
	out.println("name is"+emp.getEname()+"<hr>");
	out.println("sal is"+emp.getEsal()+"<hr>");
%>
	