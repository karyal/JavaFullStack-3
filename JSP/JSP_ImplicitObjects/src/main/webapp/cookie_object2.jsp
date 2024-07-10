<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Cookie</title>
</head>
<body>
	<%
	Cookie cookie = null;
	Cookie[] cookies = null;

	// Get an array of Cookies associated with the this domain
	cookies = request.getCookies();

	if (cookies != null) {
		out.println("<h2>Cookies Found</h2>");
		for (int i = 0; i < cookies.length; i++) {
			cookie = cookies[i];
			if(cookie.getName().equals("username")){
				out.println(cookie.getName()+" : "+cookie.getValue()+"<br/>");	
			}
			if(cookie.getName().equals("password")){
				out.println(cookie.getName()+" : "+cookie.getValue()+"<br/>");	
			}
		}
	} else {
		out.println("<h2>No cookies founds</h2>");
	}
	%>
</body>
</html>