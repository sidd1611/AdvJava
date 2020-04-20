<%@ page language="java" contentType="text/html"%>
<%
String uName = request.getParameter("uname");
int a = Integer.parseInt(application.getInitParameter("a"));
int b = Integer.parseInt(config.getInitParameter("b"));
out.println("<div align='center'>");
out.println("Welcome: <b>"+uName+"</b><br/>");
out.println("<br/>====ServletContext====");
out.println("<br/>ContextValue: "+a);
out.println("<br/>====ServletConfig====");
out.println("<br/>JSP File Name: "+config.getServletName());
out.println("<br/>Config Value: "+b);
out.println("</div>");
%>

<!-- Every JSP program is provided with 9 implicit objects & using these object java code can be run in a JSP program. These
     objects along with their class names are given as follows:
     
i)   javax.servlet.ServletContext class object, named "application". ServletContext object of JSP Program & Servlet Program are same
ii)  javax.servlet.ServletConfig class object named "config"
iii) javax.servlet.http.HttpServletRequest class object named "request"
iv)  javax.servlet.http.HttpServletResponse class object named "response"
v)   javax.servlet.jsp.JspWriter class object named "out"
vi)  javax.servlet.http.HttpSession class object named "session"
vii) java.lang.Throwable class object named "exception"
viii)java.lang.Object class object name "page"
ix)  javax.servlet.jsp.PageContext class object named "pageContext"
-->