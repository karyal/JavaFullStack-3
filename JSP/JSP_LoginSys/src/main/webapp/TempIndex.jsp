<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1>Temp Home Page</h1>

<% 
	HttpSession sessions=request.getSession(false);
   	String currentUser=(String)sessions.getAttribute("currentUser");
%>
<p>Current User: <% out.println(currentUser); %><p>
<p><a href='LogoutServlet'>Logout</a><p>

<p><a href='NewUser.jsp'>New User</a></p>
<p><a href='SearchUser.jsp'>Search User</a></p>
</body>
</html>