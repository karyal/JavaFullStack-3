<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="pkg1.User"%>
<%@ page import="java.util.List"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Users</title>
</head>
<body>
<h1>Search User</h1>
<table width='95%' border=1>
<tr><td>UID</td><td>NAME</td><td>EMAIL</td><td>PHONE</td><td>USERNAME</td><td>PASSWORD</td><td>USER TYPE</td><td>CONTROL</td></tr>
<% 
	List<User> users = (List) request.getAttribute("users");
	for(User user: users){
		out.println("<tr><td>"+1000+user.getUid()+"</td><td>"+user.getFullName()+"</td><td>"+user.getEmail()+"</td><td>"+user.getPhone()+"</td><td>"+user.getLoginName()+"</td><td>"+user.getLoginPassword()+"</td><td>"+user.getUserType()+"</td><td><a href='EditForm.jsp?uid="+user.getUid()+"'>EDIT</a> | <a href='DeleteForm.jsp?uid="+user.getUid()+"'>DELETE</a> | <a href='ExportIndividual?uid="+user.getUid()+"'>EXPORT</a></td></tr>");
	}
%>
</table>
<p><a href='ExportAll'>Export All</a></p>
</body>
</html>