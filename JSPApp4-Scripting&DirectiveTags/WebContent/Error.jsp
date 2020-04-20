<!-- Error page will be displayed if either application is run in Tomcat server without using Eclipse IDE or setting browser to any
     system browser through "Window-Web Browser" option like chrome, firefox etc. If application is run using Tomcat Server in
     Eclipse IDE then Eclipse's internal web browser will use its default error page in place of this Error page-->
     
<%@ page 
language="java" 
contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    isErrorPage="true"%>
<%@include file="input.html"%>
<br/><br/>
<div align="center">
<b>EXCEPTION::(</b>
<%= exception %>
<b>)</b>
<%out.println("<br/>"); %>
</div>