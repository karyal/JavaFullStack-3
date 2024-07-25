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
<title>SQL Tags-5</title>
</head>
<body>
	<h1>SQL Tags-1</h1>
	<h2>4 transaction</h2>
	<h2>Update, Delete, and Insert</h2>
	<%
		int pid=2;
	%>
	<sql:setDataSource var="myDataSource" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/test" user="root" password="nepal@123" />
	<sql:transaction dataSource="${myDataSource}">
		<sql:update var="count">  
      		UPDATE persons SET full_name = 'Raj Shrestha', email='raj@gmail.com' WHERE pid = 2 
   		</sql:update>
   		<sql:update var="count">  
      		UPDATE persons SET full_name = 'Kiran Thapa', email='kiran@gmail.com' WHERE pid = 3 
   		</sql:update>
   		<sql:update var="count">  
      		DELETE FROM persons WHERE pid = 1 
   		</sql:update>
   		<sql:update var="count">  
      		INSERT INTO persons VALUES(0, 'Keshor Thapa','8209358095','keshorthapa@gmail.com','2/23/2000'); 
   		</sql:update>   		   		
	</sql:transaction>	        
   <p><a href='index.jsp'>index</a></p>  
</body>
</html>