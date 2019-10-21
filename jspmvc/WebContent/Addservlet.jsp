<%@ page import="dao.*,model.*,java.sql.*"  %>

<%
Integer eno=Integer.parseInt(request.getParameter("eno"));
		String ename=request.getParameter("ename");
		Integer esal=Integer.parseInt(request.getParameter("esal"));
		
	
			Emp emp =new Emp();
			emp.setEno(eno);
			emp.setEname(ename);
			emp.setEsal(esal);
			  
			
			EmpDao empdao=new EmpDao();
			int x=empdao.addRecord(emp);
			if(x>0)
			{
				out.println(x+"record added");
			}
			%>