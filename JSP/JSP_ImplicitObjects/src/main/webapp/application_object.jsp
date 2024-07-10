<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Application Object</title>
</head>
<body>
<%
	String siteTitle=application.getInitParameter("site_title");
%>

<p><% out.println(siteTitle); %></p>
</body>
</html>