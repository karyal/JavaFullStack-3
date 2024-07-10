<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page info="Page author: your name" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>info Page Directive</title>
</head>
<body>
<h1>info Page Directive</h1>
<%
	String pageInfo = getServletInfo();
%>

<p>Page info <%=pageInfo %></p>
</body>
</html>