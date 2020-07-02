<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<link rel="stylesheet" href="style.css">
<!-- To intialize our dojo framework -->
<sx:head/>
</head>
<body>
	<!-- Adding Top Nav Bar -->
	<%@ include file="header.jsp" %>
	<div align="center">
		<h2>Welcome</h2>	
		<!-- Implemented add button in nav bar, so commenting out this one -->
		<!-- <div>
			<a href="addProduct.jsp">
				<button class ="actionBtn">Add New Product</button>
			</a>
		</div> -->
		<s:form action="welcome" class="filterPanel">
			<s:textfield name="productName" label="Product Name" class="formTextField"></s:textfield>
			<s:textfield name="productCategory" label="Product Category" class="formTextField"></s:textfield>
			<sx:datetimepicker name="createdDate" label="Created Date" displayFormat="dd-MMM-yyyy"></sx:datetimepicker>
			<s:submit value="Search Product" class="actionBtn"></s:submit>
		</s:form>
	</div>
	<div align="center" >
		<table class="productTable">
				<tr>
					<th>Product ID</th>
					<th>Product Name</th>
					<th>Product Category</th>
					<th>Product Price</th>
					<th>Created Date</th>
					<th colspan="2">Actions</th>
				</tr>
			
			<s:iterator value="products" var="product">
				<tr>
					<td><s:property value="#product.productId"/></td>
					<td><s:property value="#product.productName"/></td>
					<td><s:property value="#product.productCategory"/></td>
					<td><s:property value="#product.productPrice"/></td>
					<td><s:property value="#product.createdDate"/></td>
					<td>
						<a href="updateProduct?productId=<s:property value="#product.productId"/>">
							<button class="actionBtn">Update</button>
						</a>
					</td>
					<td>
						<a href="deleteProduct?productId=<s:property value="#product.productId"/>">
							<button class="actionBtn">Delete</button>
						</a>
					</td>				
				</tr>
			</s:iterator>
		</table>
	</div>
	
</body>
</html>