<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Page Context2</title>
</head>
<body>
<h1>Page Context-2</h1>
<%
	String userName=request.getParameter("uname");
	out.print("<h1>Welcome "+userName+"</h1>");
	pageContext.setAttribute("user", userName, PageContext.SESSION_SCOPE);
%>
<p><a href='page_context3.jsp'>Next</a></p>
</body>
</html>