<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page  isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration SuccssFull</title>
</head>
<body>

	<h2>${Header }</h2>
	<p>${Desc }</p>
	<h1 style="color:green">${msg }</h1>
	<h1>Welcome to, ${user.userName } </h1>
	<h1>Your email address is ${user.email }</h1>
	<h1>Your Password is ${user.password } try to secure the password</h1>
	<h2>Thanks For Registration</h2>
</body>
</html>