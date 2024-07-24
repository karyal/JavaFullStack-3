<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Core-3</title>
</head>
<body>
	<h1>Core JSTL-2</h1>
	
	<h2>11. redirect</h2>
		<p>
			<c:redirect url="Welcome.jsp"> 
            	<c:param name="name" value="Raj Rai"/> 
         	</c:redirect> 
		</p>
	        
</body>
</html>