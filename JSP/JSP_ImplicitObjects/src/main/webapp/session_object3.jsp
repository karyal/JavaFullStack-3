<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Session Object</title>
</head>
<body>
<h2>Session Object-3</h2>
<p>Welcome <% out.println(session.getAttribute("current_user")); %></p>
<p><a href='session_object.jsp'>Index</a></p>
</body>
</html>