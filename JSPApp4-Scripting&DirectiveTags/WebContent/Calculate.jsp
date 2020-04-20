<!-- Directive Tags: The tags which are used to specify the directions in translations process, are known as Directive Tags.
     Types of Directive Tags are: page, include, taglib-->
<!-- 'page' Directive Tag specifies the translator to add the related attribute to current JSP page. Total 13 Attributes
     are allowed under this tag and are given as follows:
     import, contentType, extends, info, buffer, language, isELIgnored, isThreadSafe, autoFlush, session, pageEncoding, 
     errorPage, isErrorPage -->
<%@ page 
    language="java"
    contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*"
    errorPage="Error.jsp"%>

<!-- expression tag (a type of Scripting Tag), used to assign the value 
     to variables OR used to display the data directly to WebBrowser-->
<%= new Date() %>

<!-- 'include' directive tag specifies the file to be included to current page. Included file will be executed after the 
     content written before this statement and before the content written after it in this page -->
<%@ include file="input.html" %>

<!-- declarative tag (a type of Scripting Tag), used to declare variables
     & methods as part of JSP Program -->
<%! 
int fact;
int factorial(int n)
{
   fact = 1;
   for(int i=n; i>=1; i--)
   {
      fact = fact*i;
   }
   return fact;
}
%>

<!-- scriptlet tag, a type of scripting tag is used to write direct java code as part of Java Program -->
<%
int v1 = Integer.parseInt(request.getParameter("val"));
out.println("<br/>Factorial of this number is: "+factorial(v1)+"<br/>");
%>