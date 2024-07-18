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
<% 
	Cookie[] cookies = null;
	cookies = request.getCookies();
	String user="";
	String pass="";
	if( cookies != null ) {
		for(Cookie cookie: cookies){
			if(cookie.getName().equals("user")){
				user=cookie.getValue();	
			}
			if(cookie.getName().equals("pass")){
				pass=cookie.getValue();	
			}
		}
	}
%>
<form action='LoginServlet'>
	<p>User : <input type='text' name='txtUser' value=<%=user %>></p>
	<p>PASS : <input type='text' name='txtPass' value=<%=pass %>></p>
	<p><input type='checkbox' name='chkSave' value='yes'>Remember user</p>
	<p><input type='submit' value='Login'></p>
</form>
</body>
</html>