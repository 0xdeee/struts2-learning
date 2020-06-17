<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<div align="center">
		<h2>Welcome</h2>	
		<div>
			<a href="addProduct.jsp">
				<button class ="actionBtn">Add New Product</button>
			</a>
		</div>
	</div>
	<div align="center" >
		<table class="productTable">
				<tr>
					<th>Product ID</th>
					<th>Product Name</th>
					<th>Product Category</th>
					<th>Product Price</th>
					<th colspan="2">Actions</th>
				</tr>
			
			<s:iterator value="products" var="product">
				<tr>
					<td><s:property value="#product.productId"/></td>
					<td><s:property value="#product.productName"/></td>
					<td><s:property value="#product.productCategory"/></td>
					<td><s:property value="#product.productPrice"/></td>
					<td>
						<a href="updateProduct?productId=<s:property value="#product.productId"/>">
							<button class="actionBtn">Update</button>
						</a>
					</td>
					<td>Delete</td>				
				</tr>
			</s:iterator>
		</table>
	</div>
	
</body>
</html>