<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="product" class="com.simplilearn.university.entity.Product" scope="session"></jsp:useBean>
<jsp:getProperty property="studentID" name="product" param="studentID"/>
<jsp:getProperty property="firstname" name="product" param="firstname"/>
<jsp:getProperty property="lastname" name="product" param="lastname"/>
<jsp:getProperty property="department" name="product" param="department"/>
</body>
</html>