<%@ page import="mypack.*;"%>

<%
String username=request.getParameter("username");
String userpass=request.getParameter("userpass");

if(username.equals("ducat") &&  userpass.equals("password"))
{
	%>
	<jsp:forward page="welcome.jsp"/>
	<%
	
}
else
{
	%>

<jsp:include page="error.jsp"/>
<jsp:include page="Login.jsp"/>
<%
}
%>
