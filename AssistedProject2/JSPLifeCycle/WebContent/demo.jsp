<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome to JSP Demo</h1>
	<%
	List<String> list = new ArrayList<String>();
	list.add("Sonali");
	list.add("Pooja");
	list.add("Rahul");
	out.println(list);
	%><br>
	
	<%= list %> <br>
	<h4>Todays date is:</h4>
	<%= new Date() %>
	
	<%!
	static String name;
	%>
	<%!
	public void m1() {
		System.out.println("This is m1() from declaration");
	}
	%>
</body>
</html>