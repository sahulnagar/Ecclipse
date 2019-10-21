

<%@ page import="dao.*,model.*,java.sql.*"  %>
<% 





	Integer eno=Integer.parseInt(request.getParameter("eno"));
		String ename=request.getParameter("eno");
		Integer esal=Integer.parseInt(request.getParameter("esal"));
		
	
			Emp emp=new Emp();
			emp.setEname(ename);
			emp.setEno(eno);
			emp.setEsal(esal);
			
			
			EmpDao empdao=new EmpDao();
			int x=empdao.addRecord(emp);
			if(x>0)
			{
				out.println(x+"record updated");
			}
%>