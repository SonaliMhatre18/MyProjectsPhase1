<%@ page language="java" errorPage="error.jsp" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Test JSP Page</h1>
	<%
	int num = 9 / 10;
	
	out.println("<h1>Page executed successfully.....</h1>");
	%>
</body>
</html>