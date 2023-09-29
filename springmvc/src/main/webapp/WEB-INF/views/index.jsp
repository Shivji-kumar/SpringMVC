<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC</title>
</head>
<body>

	<h2>This Our Home page</h2>
	<h4>Called by Home Controller</h4>
	<h4>Home url</h4>
	
	<%
		String name=(String) request.getAttribute("name");
		Integer id=(Integer) request.getAttribute("id");
		List<String> friends=(List<String>)request.getAttribute("f");
		
	%>
	<h1>Name is	<%=name%></h1>
	<h1>Id is <%=id %></h1>
	<%
		for(String s:friends){	
			%>
			<h1><%=s %></h1>
			<%
		}
		 %>

	<h2>Name is Shivam Singh</h2>
</body>
</html>