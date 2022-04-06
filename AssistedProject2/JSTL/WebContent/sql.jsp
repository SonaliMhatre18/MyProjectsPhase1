<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<sql:setDataSource var="conn" driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://Localhost:3306/university" user="root"
	password="Parth@123" />


Database connection object: ${conn}
<br>

<sql:query var="result" dataSource="${conn}">select * from engineeringstudents;</sql:query>

<br>
ResultSet : ${result}