<%@ page import= "mypack.*"%>
<%

	Integer eno=Integer.parseInt(request.getParameter("eno"));
	String ename=request.getParameter("ename");
	Integer esal=Integer.parseInt(request.getParameter("esal"));


Emp e=new Emp();
e.setEno(eno);
e.setEname(ename);
e.setEsal(esal);

int x=e.addRecord();
if(x>0)
{
	out.println(x+"record added");
}
			%>