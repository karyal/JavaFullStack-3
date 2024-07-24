<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Core-4</title>
</head>
<body>
	<h1>Core JSTL-4</h1>

	<h2>14. catch</h2>
	<p>
		<c:catch var="e">
			<%
				int x = 2 / 0;
			%>
		</c:catch>
		<c:if test="${e!=null }">
			<c:out value="${e }"></c:out>
		</c:if>
	</p>

</body>
</html>