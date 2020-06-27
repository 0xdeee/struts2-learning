<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h2>Welcome</h2>
	<s:label value="First Name:" />
	<s:property value="firstName"/><br/>
	
	<s:label  value="Last Name:"/>
	<s:property value="lastName"/><br/>
	
	<s:label  value="Gender:"/>
	<s:property value="gender"/><br/>
	
	<s:label  value="Age:"/>
	<s:property value="age"/><br/>
	
	<s:label  value="Email:"/>
	<s:property value="email"/>
</body>
</html>