<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
</head>
<body>
<h1>User Login</h1>
<form action='LoginServlet'>
	<p>User : <input type='text' name='txtUser'></p>
	<p>PASS : <input type='text' name='txtPass'></p>
	<p><input type='submit' value='Login'></p>
</form>
</body>
</html>