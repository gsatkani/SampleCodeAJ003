<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Page</title>
</head>
<body>

	<div align="center">
		<h2>Welcome to User Login page</h2>
		<form:form action="/addUserDetail" method="post" modelAttribute="username">
		<form:label path="id">User Id</form:label>
		<form:input path="id"/><br><br>
		
		<form:label path="name">Name</form:label>
		<form:input path="name"/><br><br>
		
		<form:label path="mobile">Mobile</form:label>
		<form:input path="mobile"/><br><br>
		
		<input type="submit" value="Register">
		</form:form>
		<hr>
		<a href="/getAllUserDetail">Click for List to View</a><hr>
		<a href="/">Back to Home Page</a>
	</div>
</body>
</html>