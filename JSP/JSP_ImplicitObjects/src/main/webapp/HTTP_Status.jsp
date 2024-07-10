<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HTTP Status Code</title>
</head>
<body>
	<h1>HTTP Status Code</h1>
	<%
		response.sendError(404, "Page Not Found");
		//response.sendError(407, "Authentication Error!");
	%>
</body>
</html>