<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search User</title>
</head>
<body>
<h1>Search User</h1>
<% 
	HttpSession sessions=request.getSession(false);
   	String currentUser=(String)sessions.getAttribute("currentUser");
%>
<p>Current User: <% out.println(currentUser); %><p>

<form action='SearchServlet'>
<p>SEARCH : <input type='text' name='txtSearch'>
<input type='submit' value='SEARCH'></p>
</form>
</body>
</html>