<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Product</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<!-- Adding Top Nav Bar -->
	<%@ include file="header.jsp" %>
	<div align="center">
		<h2>Update Product</h2>
		<s:form action="update" class="formTable">
			<s:textfield name="productId" label="Product ID" class="formTextField" readonly="true"></s:textfield>
			<s:textfield name="productName" label="Product Name" class="formTextField"></s:textfield>
			<s:textfield name="productCategory" label="Product Category" class="formTextField"></s:textfield>
			<s:textfield name="productPrice" label="Product Price" class="formTextField"></s:textfield>
			<s:textfield name="createdDate" label="Created Date" class="formTextField" readonly="true"></s:textfield>
			<s:submit class="actionBtn" value="Update"></s:submit>
		</s:form>
	</div>
</body>
</html>