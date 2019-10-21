
<%@ page import="mypack.*" %>
<% 
String userName=request.getParameter("userName");
%>
<br>
<jsp:useBean id="c2" class="mypack.check"/>
<jsp:setProperty property="userName" name="c2" value="<%=userName %>"/>
<jsp:getProperty property="userName" name="c2"/>
