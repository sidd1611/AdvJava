<%@ page language="java" contentType="text/html"%>

<%
String fName = (String)session.getAttribute("FirstName");
out.println("Login Successfull....<br/>");
out.println("WELCOME USER: "+fName);
%>
