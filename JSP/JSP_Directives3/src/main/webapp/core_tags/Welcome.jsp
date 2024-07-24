<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<h1>Core JSTL-4</h1>
	<h2>12. request</h2>
	<h1>
		Welcome <%=request.getParameter("name")%>!
	</h1>
	
	<h2>13. url</h2>
	<p>
		<a href="/<c:url value='../JSP_Directives3/index.jsp'/>">Click here</a> 
	</p>
</body>
</html>