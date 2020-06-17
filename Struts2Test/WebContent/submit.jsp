<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit</title>
</head>
<body>
<!-- the values entered in these form fields will be sent to action class and  -->
<!-- assignes to variable by implicitly invoking the setter method of those variables -->
<!-- the name of variable in the action class and the value of name attr in textfield -->
<!-- tag must be the same. -->
<s:form action="testAction">
	<s:textfield name="firstName" label="First Name: "></s:textfield>
	<s:textfield name="lastName" label="Last Name: "></s:textfield>	
	<s:submit value="Submit"></s:submit>
</s:form>
</body>
</html>