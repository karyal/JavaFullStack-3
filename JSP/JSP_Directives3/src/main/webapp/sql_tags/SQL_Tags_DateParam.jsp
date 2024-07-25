
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.time.LocalDate"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.text.SimpleDateFormat"%>
 
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SQL Tags-6</title>
</head>
<body>
	<h1>SQL Tags-1</h1>
	<h2>dateParam</h2>
	<h2>Update Date</h2>
	<%
		String strDate="23/07/2024";  
    	Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(strDate);   
	%>
	<sql:setDataSource var="myDataSource" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/test" user="root" password="nepal@123" />
	<sql:update dataSource="${myDataSource}" var="rs"> 
         UPDATE dateTest SET reg_date=?; 
         <sql:dateParam value="<%=date1 %>" type="date" />      
      </sql:update>
      <c:if test="${rs==1}"> 
         <p>Update Record Successfully!</p> 
      </c:if>
      <p><a href='index.jsp'>index</a></p>  
</body>
</html>