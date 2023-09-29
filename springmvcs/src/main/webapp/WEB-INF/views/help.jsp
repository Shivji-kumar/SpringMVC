<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
	<h2>This is Help Page</h2>
	<% /*
		String name=(String)request.getAttribute("name");
		Integer rollnumber=(Integer)request.getAttribute("rollnumber");		
		LocalDateTime time=(LocalDateTime) request.getAttribute("time"); */
	%> 
	
	<h2>Hello My Name is
	${name}
	</h2>
	
	<h3>RollNumber 
	${rollnumber}
	
	</h3>
	<h3>Date and Time is 
	${time}
	</h3>
	<hr>
	<c:forEach var="item" items="${marks }">
	<h2><c:out value="${item }"></c:out></h2>
	
	
	</c:forEach>

</body>
</html>