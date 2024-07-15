<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Declare, initialize, and access</title>
</head>
<body>
<% int num1=78; %> <%--declare and initialize --%>
<% num1++; %> <%-- processing --%>
<p>Result: <%=num1 %></p> <%-- display the value of num1 --%>
<p>Result: <% out.println(num1); %>
</body>
</html>