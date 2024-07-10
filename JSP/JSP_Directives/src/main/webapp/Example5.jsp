<%@ page import="java.time.LocalDateTime" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>import page directive</title>
</head>
<body>
<%
	response.setIntHeader("Refresh", 1);
	LocalDateTime localDateTime =LocalDateTime.now();
%>
<h1>import Page Directive</h1>

<p>Local Date/Time : <% out.println(localDateTime); %></p>
<p>Day of Week : <% out.println(localDateTime.getDayOfWeek()); %></p>
<p>Day : <% out.println(localDateTime.getDayOfMonth()); %></p>
<p>Month : <% out.println(localDateTime.getMonth()); %></p>
<p>Hour : <% out.println(localDateTime.getHour()); %></p>
<p>Minute : <% out.println(localDateTime.getMinute()); %></p>
<p>Second : <% out.println(localDateTime.getSecond()); %></p>

</body>
</html>