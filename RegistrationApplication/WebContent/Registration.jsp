<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<s:head/>
</head>
<body>
<s:form action="registrationAction">
	<s:textfield name="firstName" label="First Name"></s:textfield>
	
	<s:textfield name="lastName" label="Last Name"></s:textfield>
	
	<s:radio name="gender" list="{'Male','Female'}" label="Gender"></s:radio>
	
	<s:textfield name="age" label="Age"></s:textfield>
	
	<s:textfield name="email" label="Email"></s:textfield>
	
	<s:textarea name="address" label="Address"></s:textarea>
	
	<!-- this  headerKey and headerValue in select tag are for specifiyin default values if the 
	user doesn't select anything it will show the content of headerValue and pass the value of 
	headerKey as the value for this field -->
	<s:select list="colors" name="selectedColor" 
	headerKey="None" headerValue="Select a color" label="Favourite Color"></s:select>
	
	<s:checkbox name="subscription" value="true" label="Subscribe to our Newsletter"></s:checkbox>
	
	<s:checkboxlist list="hobbies" name="hobby" label="Select you Hobbies"></s:checkboxlist>
	
	<div>
	<s:submit value="Register"></s:submit>
	<s:reset value="Reset"></s:reset>
	</div>
</s:form>

<table border="1">
	<tr>
		<th>Product ID</th>
		<th>Product Name</th>
		<th>Price</th>
	</tr>
	<!-- like the iterator we use in java, it can be used to iterate and print all elements
	 in a list -->
	<s:iterator value="products" var="product">
		<tr>
			<td><s:property value="#product.id"/></td>
			<td><s:property value="#product.name"/></td>
			<td><s:property value="#product.price"/></td>
		</tr>
	</s:iterator>
</table>
</body>
</html>