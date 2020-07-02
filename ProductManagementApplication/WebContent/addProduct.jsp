<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add product</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<!-- Adding Top Nav Bar -->
	<%@ include file="header.jsp" %>
	
	<div align="center">
		<h3>Add New Product</h3>
	</div>
	
	<div align="center">
		<s:form action="addProduct" class="formTable">
			<s:textfield name="productId" label="Product ID" class="formTextField"></s:textfield>
			<s:textfield name="productName" label="Product Name" class="formTextField"></s:textfield>
			<s:textfield name="productCategory" label="Product Category" class="formTextField"></s:textfield>
			<s:textfield name="productPrice" label="Product Price" class="formTextField"></s:textfield>
			<s:submit value="Add Product" class="actionBtn"></s:submit>
		</s:form>
	</div>
	
</body>
</html>