<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Successful Registration</title>
</head>
<body>
<h1>Registration Success!!</h1>
<hr>

<s:label value="First name"/>
<h4><s:property value="firstName"/></h4>

<s:label value="Last name"/>
<h4><s:property value="lastName"/></h4>

<s:label value="Gender"/>
<h4><s:property value="gender"/></h4>

<s:label value="Age"/>
<h4><s:property value="age"/></h4>

<s:label value="Email"/>
<h4><s:property value="email"/></h4>

<s:label value="Address"/>
<h4><s:property value="address"/></h4>

<s:label value="Favourite Color"/>
<h4><s:property value="selectedColor"/></h4>

<s:label value="Hobbies"/>
<h4><s:property value="hobby"/></h4>

<s:if test="%{subscription == true}">
	<div>You are a Subscriber</div>
</s:if>
<s:else>
	<div>You are not a subscriber</div>
</s:else>

</body>
</html>