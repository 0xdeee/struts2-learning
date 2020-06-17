<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success page</title>
</head>
<body>
<!-- "message is the var name in acton class and jsp gets the value of that using
 this property struts tag by implicitly invoking the getter method for this variable" -->
<h1><s:property value="message"/></h1>
</body>
</html>