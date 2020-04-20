<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<jsp:include page="input.html"/>
<br/><br/>
<div align="center">
<%
String op = request.getParameter("s1");
int result = Integer.parseInt(request.getParameter("result"));
if(op.equals("ADD"))
{
	out.println("Addition of two numbers is: <b>"+result+"</b><br/>");
}
else
{
	out.println("Subtraction of two numbers is: <b>"+result+"</b><br/>");
}
%>
</div>
