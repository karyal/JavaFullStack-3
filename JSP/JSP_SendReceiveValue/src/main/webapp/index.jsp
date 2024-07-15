<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Send Value</title>
</head>
<body>
<h1>Send Value</h1>
<h2>URL</h2>
<p><a href='display.jsp?n1=9&n2=7'>Click me!</a></p>

<h2>Form-GET</h2>
<form action='display.jsp' method='get'>
	<p>First no : <input type='text' name='n1'></p>
	<p>First no : <input type='text' name='n2'></p>
	<p>
		<input type='reset' value='RESET'>
		<input type='submit' value='SEND'>
	</p>
</form>

<h2>Form-POST</h2>
<form action='display.jsp' method='post'>
	<p>First no : <input type='text' name='n1'></p>
	<p>First no : <input type='text' name='n2'></p>
	<p>
		<input type='reset' value='RESET'>
		<input type='submit' value='SEND'>
	</p>
</form>
</body>
</html>