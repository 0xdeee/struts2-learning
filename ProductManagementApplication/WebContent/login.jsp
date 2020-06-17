<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<div align="center"> 
		<h4>Login</h4>
		<s:form action="login" class="loginForm">
			<s:textfield name="userName" label="UserName"></s:textfield>
			<s:password name="password" label="password"></s:password>
			<s:submit value="Login" class="actionBtn"></s:submit>
		</s:form>
	</div>
</body>
</html>