<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cookie Object</title>
</head>
<body>
<h1>Create Cookie</h1>
<%
	Cookie ckUserName= new Cookie("username", "admin");
	Cookie ckPassWord = new Cookie("password", "nepal@123");
	
	ckUserName.setMaxAge(60*60*24); 
	ckPassWord.setMaxAge(60*60*24); 
	   
	response.addCookie(ckUserName);
	response.addCookie(ckPassWord);	  
%>
<p><a href='cookie_object2.jsp'>Next</a></p>
</body>
</html>