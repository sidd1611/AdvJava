<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Retrieve</title>
</head>
<body>
<div align="center">
	<br/><br/>
    <jsp:useBean id="prod" type="test.Product" scope="session"/>
	<b>Product Code: </b><jsp:getProperty name="prod" property="pCode"/>
	<br/>
	<b>Product Name: </b><jsp:getProperty name="prod" property="pName"/>
	<br/>
	<b>Product Price: </b><jsp:getProperty name="prod" property="pPrice"/>
	<br/>
	<b>Product Quantity: </b><jsp:getProperty name="prod" property="pQty"/>
</div>
</body>
</html>