<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New User</title>
</head>
<body>
<% 
	HttpSession sessions=request.getSession(false);
   	String currentUser=(String)sessions.getAttribute("currentUser");
%>
<p>Current User: <% out.println(currentUser); %><p>

<h2>New User</h2>
<form action='ReceiveUser'>
<p>NAME : <input type='text' name='txtName'></p>
<p>EMAIL : <input type='text' name='txtEmail'></p>
<p>PHONE : <input type='text' name='txtPhone'></p>
<p>LOGIN ID : <input type='text' name='txtUser'></p>
<p>LOGIN PASSWORD : <input type='text' name='txtPassword'></p>
<p>USER TYPE : 
<select name='cmbUserType'>
	<option value='admin'>ADMIN</option>
	<option value='manager'>MANAGER</option>
	<option value='user'>USER</option>
</select>
</p>
<p><input type='submit' value='SEND'></p>
</form>
</body>
</html>