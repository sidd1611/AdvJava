<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<title>Update</title>
</head>
<body>
	<jsp:useBean id="prod" class="test.Product" scope="session" />
	<jsp:setProperty name="prod" property="pCode" param="pcode" />
	<jsp:setProperty name="prod" property="pName" param="pname" />
	<jsp:setProperty name="prod" property="pPrice" param="pprice" />
	<jsp:setProperty name="prod" property="pQty" param="pqty" />

	<div align="center">
		<h4>Product Details saved in Object successfully.....</h4>
		<br />
		<br /> 
		<a href="RetrieveBean.jsp">ViewProductDetails</a>
	</div>
</body>
</html>