<%@include file="/WEB-INF/jsp/includes/include.jsp"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body>
	<h2>Login page</h2>
	<spring:url value="/login" var="loginUrl" />
	<form:form modelAttribute="user" method="POST" action="${loginUrl }">
		<table>
			<tr>
				<td>Username:</td>
				<td><form:input path="username" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><form:input path="password" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Subit"></td>
			</tr>
		</table>

	</form:form>
</body>
</html>