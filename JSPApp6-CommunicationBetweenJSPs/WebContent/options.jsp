<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
String op = request.getParameter("s1");
  if(op.equals("ADD"))
  {
	  %>
	  <jsp:forward page="addition.jsp"/>
	  <%
  }
  else
  {
	  %>
	  <jsp:forward page="subtraction.jsp"></jsp:forward>
	  <%
  }
%>