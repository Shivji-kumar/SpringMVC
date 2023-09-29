<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
	<h2>This Our Help Page</h2>
	<h2>
	Hello Your name is : 
	${name }
	</h2>
	<h2>
	Your Roll No : ${roll }
	</h2>
	
	
	
	<h2>Thanks for Visiting</h2>
	<h1>Date and Time Now : 
	${time}</h1>
	<hr>
	
	<c:forEach var="item" items="${marks }"> 
	<%-- <h1>${item }</h1> --%>
	<h1><c:out value="${item }">40</c:out></h1>
	</c:forEach>
	
	
	<%-- <%
	String name=(String)request.getAttribute("name");
	Integer roll=(Integer)request.getAttribute("roll");
	LocalDateTime time=(LocalDateTime) request.getAttribute("time");
	 
	%>
	<h1>Hello Your Name <%=name %></h1>
	<h1>Your Roll No: <%=roll %></h1>
	
	
	<h2>Thanks for Visiting</h2>
	<h1>Date and Time Now: <%=time.toString() %></h1>
	 --%>

</body>
</html>