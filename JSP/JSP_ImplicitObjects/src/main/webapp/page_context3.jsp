<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Context</title>
</head>
<body>
<h1>Page Context-3</h1>
<%
	String userName=(String)pageContext.getAttribute("user", PageContext.SESSION_SCOPE);
	out.print("<h1>Hello "+userName+"</h1>");
%>
<p><a href='page_context.jsp'>Index</a></p>
</body>
</html>