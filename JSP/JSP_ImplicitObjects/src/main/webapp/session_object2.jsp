<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Session Object</title>
</head>
<body>
<% 
	String user = request.getParameter("user");
	session.setAttribute("current_user", user);
%>
<h2>Session Object-2</h2>
<p>Welcome <% out.println(session.getAttribute("current_user")); %></p>
<p><a href='session_object3.jsp'>Next</a></p>
</body>
</html>