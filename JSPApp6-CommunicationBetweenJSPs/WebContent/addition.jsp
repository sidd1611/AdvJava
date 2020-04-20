<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="Error.jsp"%>
<%
int a = Integer.parseInt(request.getParameter("v1"));
int b = Integer.parseInt(request.getParameter("v2"));
int c = a+b;
%>

<jsp:forward page="result.jsp">
	<jsp:param value="<%=c %>" name="result"/>
</jsp:forward>