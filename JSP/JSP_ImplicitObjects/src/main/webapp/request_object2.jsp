<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>request Object</title>
</head>
<body>
	<%-- request object --%>
	<%
		int num1 = Integer.parseInt(request.getParameter("n1")); //Read value from url
		int num2 = Integer.parseInt(request.getParameter("n2")); //Read value from url
		int num3 = num1 + num2;		
	%>
	<h2><% out.println("Simple Calculation"); %></h2>
	<p>Num1 : <% out.println(num1); %></p><%-- response to display --%>
	<p>Num2 : <% out.println(num2); %></p>
	<p>Result : <% out.println(num3); %></p>
	<p><a href='request_object.jsp'>Index</a></p>
</body>
</html>