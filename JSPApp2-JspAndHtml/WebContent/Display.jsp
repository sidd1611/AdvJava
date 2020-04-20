<%@ page language="java" contentType="text/html"%>
<!-- Scriptlet tag -->
<%
	String uName = request.getParameter("uname");
    String mId   = request.getParameter("mid");
    long phno  = Long.parseLong(request.getParameter("phno"));
    out.println("<div align='center'>");
    out.println("UserName: "+uName);
    out.println("<br/>MailID: "+mId);
    out.println("<br/>Phone No: "+phno);
    out.println("</div>");
%>

<!-- JspWriter object named as "out" is provided to JSP program as an implicit object by default. This object is similar 
     to PrintWriter object in Servlet Program. Similarly "request"  is the name of HttpServletRequest type implicit object 
     provided to JSP program.-->
     
<!-- There are total 9 implicit objects along with their implicit names, provided to help JSP to execute java level code -->