<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.time.LocalDateTime"%>
    
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
	<h1>SQL Tags-1</h1>
	<h2>1-3 setDataSource, update, param</h2>
	<h2>New Person Entry</h2>
	<sql:setDataSource var="myDataSource" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/test" user="root" password="nepal@123" />
	<sql:update dataSource="${myDataSource}" var="rs"> 
         INSERT INTO persons VALUES(?,?,?,?,?); 
         <sql:param>0</sql:param>
         <sql:param>Raj Rai</sql:param> 
         <sql:param>9875486925</sql:param>
         <sql:param>raj@gmail.com</sql:param>
         <sql:param>11/29/2002</sql:param> 
      </sql:update>
      <c:if test="${rs==1}"> 
         <p>Inserted Record Successfully!</p> 
      </c:if>
      <p><a href='index.jsp'>index</a></p>  
</body>
</html>
