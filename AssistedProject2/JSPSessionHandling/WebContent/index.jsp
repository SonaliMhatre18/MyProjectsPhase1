<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Session</title>
</head>
<body>
	<%
	if (request.getParameter("error") != null)
		out.println("<b>Your session has expired or invalid.</b><br>");
	%>
	<form action="login.jsp" method="post">
		Name:<input type="text" name="name" id="name" maxlength="40"><br>
		Password:<input type="password" name="password" maxlength="10"><br>
		<button type="submit">Submit</button>
	</form>
</body>
</html>