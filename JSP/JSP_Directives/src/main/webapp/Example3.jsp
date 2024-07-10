<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page errorPage="display_error.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ErrorPage & IsErrorPage</title>
</head>
<body>
<h1>Page Directives</h1>
<ul>
	<li>errorPage</li>
	<li>isErrorPage</li>
</ul>
<% 
	int num1=10;
	int num2=3;
	int num3=num1/num2;
%>

<p>Result : <% out.println(num3); %>
</body>
</html>