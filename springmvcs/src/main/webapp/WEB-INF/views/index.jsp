<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>

	<h2>Welcome to Home Page</h2>
	<h4>Called by Home Controller URL /home</h4>
	
	<%
	
		String name=(String) request.getAttribute("name");
		Integer id=(Integer)request.getAttribute("id");
		List<String> friends=(List<String>) request.getAttribute("f");
	%>
	<h2>Name is <%=name %></h2>
	<h3>Your Id is <%=id %></h3>
	<%
		for(String s:friends){
			out.println(s);
		}
	%>
	
</body>
</html>