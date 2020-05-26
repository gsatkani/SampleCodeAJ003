<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Page</title>
</head>
<body>

	<div align="center">
		<h2>Welcome to Admin Login page</h2>
		<form action="/login" method="get">
			<label for="id">Id</label> 
			<input type="text" name="id"><br>
			<br> <label for="password">Password</label> <input
				type="password" name="password"><br>
			<br> <input type="submit" value="Submit">
			<br><a href="">Sign Up</a>
		</form>
		<a href="/">Back to Home Page</a>
	</div>
</body>
</html>