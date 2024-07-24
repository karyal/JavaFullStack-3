<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SQL Tags</title>
</head>
<body>
	<h1>SQL Tags-2</h1>
	<h2>1-3 setDataSource, query, forEach</h2>
	<h2>Display All Records</h2>
	<sql:setDataSource var="myDataSource" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/test" user="root" password="nepal@123" />
	<sql:query dataSource="${myDataSource}" var="rs"> 
         SELECT * FROM persons;         
    </sql:query>
    <table border="1" width="98%">
    	<tr><td>PID</td><td>NAME</td><td>PHONE</td><td>EMAIL</td><td>DOB</td></tr>
    	<c:forEach var="row" items="${rs.rows}">
    		<tr><td><c:out value="${row.pid}"/></td><td><c:out value="${row.full_name}"/></td><td><c:out value="${row.phone}"/></td><td><c:out value="${row.email}"/></td><td><c:out value="${row.birth_date}"/></td></tr>
    	</c:forEach>
    </table>      
    <p><a href='index.jsp'>index</a></p>  
</body>
</html>