<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Value</title>
</head>
<body>
	<%
		//Receive->Type Conversion->Assign
		int num1 = Integer.parseInt(request.getParameter("n1")); 
		int num2 = Integer.parseInt(request.getParameter("n2")); 
		int num3 = num1 + num2;
	%>
	
	<h1>Simple Calculation</h1>
	<p>Num1 : <%= num1 %></p>
	<p>Num2 : <%= num2 %></p>
	<p>SUM : <%= num3 %></p>
	<p><a href='index.jsp'>Index</a></p>
</body>
</html>