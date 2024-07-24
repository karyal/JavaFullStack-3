<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Format-1</title>
</head>
<body>
	<h1>JSTL Format-1</h1>
	<h2>1-5 bundle, message, param, requestEncoding, setBundle</h2>
	
	<h2>Example-1 bundle, message</h2>
	<fmt:bundle basename="pkg1.MyColors" prefix="colour.">
   		<ul>
	   		<li><fmt:message key="c1"/></li>  
	   		<li><fmt:message key="c2"/></li>  
	  		<li><fmt:message key="c3"/></li>
  		</ul>
	</fmt:bundle>  
	
	<h2>Example-2 bundle, message, param</h2>
	<fmt:bundle basename="pkg1.MySubjects">
   		<ul>
	   		<li><fmt:message key="subjects.s1"/></li>
	   		<li><fmt:message key="subjects.s2"/></li>
	   		<li>
	   			<fmt:message key="subjects.s2">
	   				<fmt:param value="Hello"></fmt:param>
	   			</fmt:message>
			</li>
  		</ul>
	</fmt:bundle>
			
	<h2>Example-3 setLocale, requestEncoding</h2>
	<fmt:requestEncoding value = "UTF-8" />
 	<fmt:setLocale value = "ne_NP"/>
	<fmt:bundle basename="pkg1.MyCities" prefix="cities.">
   		<ul>
	   		<li><fmt:message key="c1"/></li>
	   		<li><fmt:message key="c2"/></li>
	   		<li><fmt:message key="c3"/></li>
	   		<li><fmt:message key="c4"/></li>
	   		<li><fmt:message key="c5"/></li>
  		</ul>
	</fmt:bundle>	
	
	<h2>Example-4 setBundle</h2>
	
			
	<h2>6. parseDate</h2>
	<c:set var="currentDate" value="20-04-2024" />
	<fmt:parseDate value="${currentDate}" var="parsedCurrentDate" pattern="dd-MM-yyyy" />
	<p>Current Date : <c:out value="${parsedCurrentDate}" /></p>
	
	<h2>7. formatDate</h2>
	<c:set var="today" value="<%=new java.util.Date()%>" />
	<p>Time: <strong><fmt:formatDate type="time" value="${today}" /></strong></p>
	<p>Date: <strong><fmt:formatDate type="date" value="${today}" /></strong></p>
	<p>Date & Time: <strong><fmt:formatDate type="both" value="${today}" /></strong></p>
	<p>Date & Time Short:
		<strong>
    		<fmt:formatDate type="both" dateStyle="short" timeStyle="short" value="${today}" />
		</strong>
	</p>
	<p>Date & Time Medium:
		<strong>
    		<fmt:formatDate type="both" dateStyle="medium" timeStyle="medium" value="${today}" />
		</strong>
	</p>
	<p>Date & Time Long:
		<strong>
    		<fmt:formatDate type="both" dateStyle="long" timeStyle="long" value="${today}" />
		</strong>
	</p>	
	<p>Date (yyyy-MM-dd):
		<strong>
    		<fmt:formatDate pattern="yyyy-MM-dd" value="${today}" />
		</strong>
	</p>
	<p>Date (yyyy-MM-dd HH:MM:SS):
		<strong>
    		<fmt:formatDate pattern="yyyy-MM-dd hh:mm:ss" value="${today}" />
		</strong>
	</p>
	
	<h2>8. parseNumber</h2>
	<c:set var="balanceAmount" value="9552.75" />
	<fmt:parseNumber var="parsedNumber" type="number" value="${balanceAmount}" />
	<p>Balance Amount-1 : <c:out value="${parsedNumber}" /></p>
	<fmt:parseNumber var="parsedNumber" integerOnly="true" type="number" value="${balanceAmount}" />
	<p>Account Balance-2 : <c:out value="${parsedNumber}" /></p>
	
	<h2>9. formatNumber</h2>
	<c:set var="balanceAmount" value="9500.60" />
	<p>Example-1 : <strong><fmt:formatNumber value="${balanceAmount}" type="currency"/></strong></p>
	<p>Example-2 : <strong><fmt:formatNumber type="number" maxIntegerDigits="3" value="${balanceAmount}" /></strong></p>
	<p>Example-3 : <strong><fmt:formatNumber type="number" maxFractionDigits="3" value="${balanceAmount}" /></strong></p>
	<p>Example-4 : <strong><fmt:formatNumber type="number" groupingUsed="false" value="${balanceAmount}" /></strong></p>
	<p>Example-5 : <strong><fmt:formatNumber type="percent" maxIntegerDigits="3" value="${balanceAmount}" /></strong></p>
	<p>Example-6 : <strong><fmt:formatNumber type="number" minFractionDigits="10" value="${balanceAmount}" /></strong></p>
	<p>Example-7 : <strong><fmt:formatNumber type="number" pattern="###.###E0" value="${balanceAmount}" /></strong></p>
	<p>
		Example-8 : 
			<strong>
				<fmt:setLocale value="en_US"/>
				<fmt:formatNumber value="${balanceAmount}" type="currency"/>
			</strong>
	</p>
	<p>
		Example-9 : 
			<strong>
				<fmt:setLocale value="fr_CA"/>
				<fmt:formatNumber value="${balanceAmount}" type="currency"/>
			</strong>
	</p>
	
	<h2>10-12 timezone, setLocale, setTimeZone</h2>
	
	<h2>timezone</h2>
	<c:set var = "now" value = "<%= new java.util.Date()%>" />
	<fmt:formatDate value = "${now}" type = "both" timeStyle = "long" dateStyle = "long" />
	<c:forEach var = "zone" items = "<%=java.util.TimeZone.getAvailableIDs()%>">
		<p><c:out value = "${zone}" />
			<fmt:timeZone value = "${zone}">
            	<fmt:formatDate value = "${now}" timeZone = "${zn}" type = "both" />
			</fmt:timeZone>
		</p>
	</c:forEach>
         
	<h2>setLocal</h2>
	<fmt:setLocale value="en"/>
    <fmt:bundle basename="pkg1.MyCities" prefix="cities.">
       <fmt:message key="c1"/><br/>
       <fmt:message key="c1"/><br/>
       <fmt:message key="c3"/><br/>
    </fmt:bundle>
    
    <h2>setTimeZone</h2>
    <c:set var="today" value="<%=new java.util.Date()%>" />
    <p>Date/Time in GMT-9:00 Time Zone : </p>
    <fmt:setTimeZone value="GMT-9:00)" />
    <p><fmt:formatDate value="${today}" type="both" timeStyle="long" dateStyle="long" /></p>
    <p>Date/Time in GMT-5:45 Time Zone:</p>
    <fmt:setTimeZone value="GMT-5:45" />
    <p><fmt:formatDate value="${today}" type="both" timeStyle="long" dateStyle="long" /></p>
</body>
</html>