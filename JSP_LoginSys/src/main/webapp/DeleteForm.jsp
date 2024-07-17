<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="pkg1.LoginManager" %>
<%@ page import="pkg1.User" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete User</title>
<% 
	int uid = Integer.parseInt(request.getParameter("uid"));
	User user = new LoginManager().search(uid);	
%>
</head>
<body>
<h2>Edit User</h2>
<form action='DeleteUser'>
<p>UID : <input type='text' name='txtUid' value='<% out.println(user.getUid()); %>'></p>
<p>NAME : <input type='text' name='txtName' value='<% out.println(user.getFullName()); %>'></p>
<p>EMAIL : <input type='text' name='txtEmail' value='<% out.println(user.getEmail()); %>'></p>
<p>PHONE : <input type='text' name='txtPhone' value='<% out.println(user.getPhone()); %>'></p>
<p>LOGIN ID : <input type='text' name='txtUser' value='<% out.println(user.getLoginName()); %>'></p>
<p>LOGIN PASSWORD : <input type='text' name='txtPassword' value='<% out.println(user.getLoginPassword()); %>'></p>
<p>USER TYPE :
<select name='cmbUserType'>
<% 
	if(user.getUserType().equals("admin")){
%>		
		<option value='admin' selected>ADMIN</option>
		<option value='manager'>MANAGER</option>
		<option value='user'>USER</option>
<%		
	}
%>
<% 
	if(user.getUserType().equals("manager")){
%>		
		<option value='admin'>ADMIN</option>
		<option value='manager' selected>MANAGER</option>
		<option value='user'>USER</option>
<%		
	}
%>
<% 
	if(user.getUserType().equals("user")){
%>		
		<option value='admin'>ADMIN</option>
		<option value='manager'>MANAGER</option>
		<option value='user' selected>USER</option>
<%		
	}
%>
</select>
</p>
<p><input type='submit' value='DELETE'></p>
</form>
</body>
</html>