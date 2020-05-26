<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List of Employess</title>
<link rel="stylesheet" href="/resources/css/style.css">
</head>
<body>
<div align="center">
	<h3>List Of User List</h3>
	<a href="userlogin">Add User Detail</a>
	<hr>
	<table border="1" >
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Mobile</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${userlist }" var="list">
			<tr>
				<td>${list.id }</td>
				<td>${list.name }</td>
				<td>${list.mobile }</td>
				<td><a href="/editUser/${list.id}">Edit</a> || <a href="/deleteUser/${list.id}"> Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</div>
</body>
</html>