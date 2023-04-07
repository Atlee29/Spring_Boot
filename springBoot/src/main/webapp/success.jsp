<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<img alt="" src="https://upload.wikimedia.org/wikipedia/en/f/f9/Chhota_Bheem.jpg">
	<table border="2" align="center">
		<tr>
			<td>User Id</td>
			<td>Username</td>
			<td>Password</td>
			<td>City</td>
		</tr>
		<c:forEach items="${data}" var="d">
			<tr>
				<td>${d.userid }</td>
				<td>${d.username }</td>
				<td>${d.password }</td>
				<td>${d.city }</td>
			</tr>

		</c:forEach>
	</table>

</body>
</html>