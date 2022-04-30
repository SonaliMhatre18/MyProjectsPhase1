<%@ page import="com.simplilearn.*" isELIgnored="false" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to display page</h1> <br>
	<h4>Scriptlet</h4>
	<%
	Employee emp = (Employee) session.getAttribute("employee");
	out.print(emp);
	%>
	<br>
	<h4>JSP Expression</h4>
	<%= session.getAttribute("employee") %>
	<br>
	<h4>EL-Expression</h4>
	${employee}
</body>
</html>