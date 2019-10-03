<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fo" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Add Product
<table>
<fo:form action="pagesubmit" method="post" modelAttribute="mypro">
<tr>
<td>Product Id</td>
<td><fo:input path="productId"/></td>
<td><span><fo:errors path="productId"></fo:errors></span></td>
</tr>

<tr>
<td>Product Name</td>
<td><fo:input path="productName"/></td>
<td><span><fo:errors path="productName"></fo:errors></span></td>
</tr>

<tr>
<td>Product Price</td>
<td><fo:input path="productPrice"/></td>
<td><span><fo:errors path="productPrice"></fo:errors></span></td>
</tr>
<tr>
<td>Product Type</td>
<td><fo:select path="type" items="${dataitem}"></fo:select></td>
</tr>
<tr>
<td>Product Online</td>
<td><fo:radiobutton path="online" value="Online"/>Online</td>
<td><fo:radiobutton path="online" value="Offline"/>Offline</td>
</tr>
<tr>
<td>Product Features</td>
<td><fo:checkbox path="Features" value="Handy"/>Handy</td>
<td><fo:checkbox path="Features" value="Accessible"/>Accessible</td>
<td><fo:checkbox path="Features" value="User-Friendly"/>User-Friendly</td>
</tr>
<tr>
<td>
<input type="submit" value="Add Product">
</td>
</tr>
</fo:form>
</table>
</body>
</html>