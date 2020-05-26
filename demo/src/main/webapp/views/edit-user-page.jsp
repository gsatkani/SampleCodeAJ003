<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Page</title>
</head>
<body>

	<div align="center">
		<h2>Welcome to User Edit page</h2>
		<form:form action="/updatUserDetail" method="get" modelAttribute="user"  >
			<form:label path="id">User Id</form:label>
			<input type="text" name="id" value="${user.id }" disabled="disabled">
			<form:hidden path="id" value="${user.id }"  />
 			<br>
 			<br>

			<form:label path="name">Name</form:label>
			<form:input path="name" value="${user.name }" />
			<br> 
 			<br> 

			<form:label path="mobile">Mobile</form:label>
			<form:input path="mobile" value="${user.mobile }" />
			<br>
 		<br>

			<input type="submit" value="Update">
		</form:form>


		<a href="/getAllUserDetail">Click for UserList</a>
	</div>
</body>
</html>