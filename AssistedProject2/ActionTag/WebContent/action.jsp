<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="employee" class="com.simplilearn.Employee" scope="application"></jsp:useBean>

<jsp:setProperty property="eid" name="employee" param="eid"/>
<jsp:setProperty property="ename" name="employee" param="ename"/>
<jsp:setProperty property="salary" name="employee" param="salary"/>

<jsp:forward page="actiondisplay.jsp"></jsp:forward>
</body>
</html>