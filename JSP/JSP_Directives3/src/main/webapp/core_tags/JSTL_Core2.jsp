<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Core-2</title>
</head>
<body>
	<h1>Core JSTL-2</h1>

	<h2>10. import</h2>
	<p>		
		<c:import var="content" url="https://kathmandupost.com/" />				
		<c:out value="${content}" />
	</p>

</body>
</html>