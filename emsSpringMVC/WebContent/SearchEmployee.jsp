<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="searchData">
<table>
<tr>
<td>Search Employee</td>
<td><input type="text" name="sid"></td>
</tr>
<tr>
<td><input type="submit" value="Search"></td>
</tr>
</table>
</form>

<jsp:include page="ShowEmployee.jsp"/>
</body>
</html>