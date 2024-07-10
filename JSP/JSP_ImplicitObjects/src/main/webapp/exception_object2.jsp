<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page errorPage="exception.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exception Object</title>
</head>
<body>
<% 
	int num1 = Integer.parseInt(request.getParameter("n1"));
	int num2 = Integer.parseInt(request.getParameter("n2"));
	int num3 = num1/num2;	
%>
<h1>Simple Calculation</h1>
<p>Num1 : <% out.println(num1); %></p>
<p>Num2 : <% out.println(num2); %></p>
<p>Result : <% out.println(num3); %></p>

</body>
</html>