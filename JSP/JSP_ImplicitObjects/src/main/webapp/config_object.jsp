<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Config Object</title>
</head>
<body>
<h1>Config Object</h1>
<%
	String pageTitle = config.getInitParameter("page_title"); //Servlet/Page Level variable defined in web.xml
%>
<p>Page Title <% out.println(pageTitle); %></p>
</body>
</html>