<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	if(session.getAttribute("loggedInUser") == null ) {
		response.sendRedirect("login.jsp");
	}
%>

<!-- Top Nav bar that will be inlcuded on all pages -->
 <div class="topnav">
	 <a href="welcome">Home</a>
	 <a href="addProduct.jsp">Add product</a>
	 <!-- using the style attribute to move the logout button to the right -->
	 <a href="logout" style="float:right">Logout</a>
</div> 
	
</body>
</html>