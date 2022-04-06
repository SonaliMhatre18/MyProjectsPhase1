<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	String name = (String) session.getAttribute("uname");
	out.print("Welcome " + name);
	out.print("<br>Page:" + page);
	pageContext.setAttribute("data", "Hi Friends");
	%><br> Welcome Again
	<%=session.getAttribute("uname")%><br> Context :
	<%=application.getAttribute("pwd")%><br> This is EL-Expression :
	${pwd}
	<br> Page Context:${data}
	<br>
	<%
	Exception exception = pageContext.getException();
	out.print(exception);
	session1 = session;
	response.sendRedirect("test.jsp");
	%>
	<%!
	    HttpSession session1;
	%>
	<%= session1 %>


</body>
</html>