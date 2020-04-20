<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div align="center">

<jsp:include page="input.html"/>
<br/><br/>

<c:choose>
	<c:when test="${param.submit eq 'Add'}">
		Sum of <c:out value="${param.op1}"/> AND 
		       <c:out value="${param.op2}"/> IS
		    <b><c:out value="${param.op1 + param.op2}"/></b>
	</c:when>
	<c:otherwise>
		Subtraction of <c:out value="${param.op1}"/> AND 
		       		   <c:out value="${param.op2}"/> IS
		       	    <b><c:out value="${param.op1 - param.op2}"/></b>
	</c:otherwise>
</c:choose>

</div>