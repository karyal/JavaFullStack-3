<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Core JSTL-1</title>
</head>
<body>
	<h1>Core JSTL-1</h1>

	<h2>1-3. set, out, remove</h2>
	<c:set var="result" scope="session" value="${7*8}" />
	<c:out value="${result}" />
	<c:remove var="result" />

	<h2>4. if</h2>
	<c:set var="num1" scope="session" value="${1}" />
	<c:if test="${num1 == 0}">
		<p>Zero</p>
	</c:if>
	<c:if test="${num1 == 1}">
		<p>One</p>
	</c:if>

	<h2>5. forEach</h2>
	<p>
	<div>5.1 Example-1</div>
	<c:forEach var="i" begin="1" end="10" step="2">
		<c:out value="${i}" />
	</c:forEach>
	</p>

	<p>
	<div>5.2 Example-2</div>
	<%
	int nums[] = { 5, 6, 2, 7, 8 };
	session.setAttribute("nums", nums);
	%>
	<c:forEach var="num" items="${nums}">
		<c:out value="${num}" />
	</c:forEach>
	</p>
	<h2>6. forTokens</h2>
	<p>
		<c:forTokens var="token" items="10-20-30-40-50" delims="-">
			<c:out value="${token }" />
		</c:forTokens>
	</p>
	<h2>7-9. choose, when, otherwise</h2>
	<p>
		<c:set var="marks" value="95" />
		<c:choose>
			<c:when test="${marks>80}">A Grade</c:when>
			<c:when test="${marks>70}">B Grade</c:when>
			<c:when test="${marks>60}">C Grade</c:when>
			<c:when test="${marks>50}">D Grade</c:when>
			<c:when test="${marks>40}">E Grade</c:when>
			<c:otherwise>Not satisfactory</c:otherwise>
		</c:choose>
	</p>	
</body>
</html>