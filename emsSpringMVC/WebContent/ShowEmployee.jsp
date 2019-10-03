<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>Employee Id</th>
<th>Employee Name</th>
<th>Employee Salary</th>
</tr>

<a:forEach var="emp" items="${empData}">
<tr>
<td>${emp.empId}</td>
<td>${emp.empName}</td>
<td>${emp.empSalary}</td>
</tr>
</a:forEach>
</table>
</body>
</html>