<%@ page language="java" contentType="text/html"%>

<!--Scriptlet Tag is used to write direct Java Code in JSP as part of Java Program-->
<% out.println("Welcome to JSP Programming....."); %>

<!--In JSP, objects of some pre-defined classes are created implicitly and are provided to a jsp program by default. 
    Here in above code, "out" is the name of an implicit object of JspWriter class to help jsp program printing the output. 
	JSPWriter is similar to PrintWriter in ServletProgramming that use println() method to print the message-->

<!-- To achieve same code and output in Servlet Programming, we have to make our Servlet Program extend GenericServlet,
     Override service() method, and write 3 commnands (PrintWriter pw = res.getWriter(); res.setContentType("text/html");
     pw.println("Welcome to Servlet Programming...."); -->