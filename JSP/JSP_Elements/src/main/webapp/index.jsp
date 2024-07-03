<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Elements</title>
</head>
<body>

<%-- Comment --%>
<%-- Declare --%>
<% int n1, n2, n3; %>

<%
	n1 = 45;
	n2 = 5;
	n3 = n1+n2;
%>

<h3>Simple Calculation</h3>
<p>First no : <%=n1 %></p>
<p>Second no : <%=n2 %></p>
<p>Sum: <%=n3 %></p>

</body>
</html>