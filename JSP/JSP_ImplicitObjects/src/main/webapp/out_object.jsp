<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Out Object</title>
</head>
<body>

<%-- out object --%>
<% 
	int num1, num2, num3;
%>

<% 
	num1=9;
	num2=5;
	num3=num1+num2;
%>
<h2>Out Object</h2>
<p>Number 1 : <% out.print(num1); %></p>
<p>Number 2 : <% out.println(num1); %></p>
<p>Result : <% out.println(num3); %></p>

<% out.flush(); %>
</body>
</html>