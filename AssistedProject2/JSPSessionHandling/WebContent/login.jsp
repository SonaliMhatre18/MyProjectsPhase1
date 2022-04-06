<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
String name = request.getParameter("name");
String password = request.getParameter("password");
if (name == null || name.equals("") || password == null || password.equals("")) {
	response.sendRedirect("index.jsp?error=1");
} else {
	session.setAttribute("name", name);
	response.sendRedirect("dashboard.jsp");
}
%>