<%@ page import="java.util.*,java.time.*" language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Life Cycle</title>
</head>
<body>
	Hi Friends!......
	<h1>Welcome to JSP Page</h1>
	<%
	int x = 100;
	out.println(x); // this is scriplet where we are writing java code
	
	Date date = new Date();
	out.println(LocalDate.now());
	%>
    <%= "Date is " + date %>
</body>
</html>