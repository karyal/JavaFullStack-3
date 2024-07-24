<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Function</title>
</head>
<body>
	<h1>JSTL Function</h1>
	<h2>1. contains</h2>
	<c:set var="sourceString" value="Lorem Ipsum is simply dummy text of the printing and typesetting industry." />
    <c:out value="${stringToSearch}"/>
    <c:if test="${fn:contains(sourceString, 'is')}">
        <p><em>is</em> found in sourceString!</p>
    </c:if>
    
    <h2>2. containsIgnoreCase</h2>
    <c:set var="sourceString2" value="Lorem Ipsum is simply dummy text of the printing and typesetting industry." />
    <c:out value="${stringToSearch2}"/>
    <c:if test="${fn:containsIgnoreCase(sourceString, 'Is')}">
        <p><em>Is</em> found in sourceString!</p>
    </c:if>
    
    <h2>3. endWith</h2>
    <c:set var="sourceString3" value="Lorem Ipsum is simply dummy text of the printing and typesetting industry;" />
    <c:out value="${sourceString3}"/>
    <c:if test="${fn:endsWith(sourceString3, ';')}">
        <p>sourceString3 is end with ; is true</p>
    </c:if>  
    
    <h2>4. escapeXml </h2>
    <c:set var="html" value="<b><i>This is html text.</i></b>" />
    <p>just html: ${html}</p>
    <p>html with escapeXml: ${fn:escapeXml(html)}</p>
    
    <h2>5. indexOf</h2>
    <c:set var="text" value="The JSTL Functions Are Great." />
    <c:out value="${text}"/>
    <p>Index of 'JSTL' from above text is: ${fn:indexOf(text,'JSTL')}</p>
    
    <h2>6. join</h2>
    <c:set var="numbers" value="One,Two,Three,Four,Five" />
    <c:set var="splitNumbers" value="${fn:split(numbers,',')}" />
    <c:set var="joinedNumbers" value="${fn:join(splitNumbers,' ')}" />
    <p>Numbers before join: ${numbers}</p>
    <p>Joined Numbers: ${joinedNumbers}</p>
    
    <h2>7. length</h2>
    <c:set var="text" value="The JSTL Functions Are Great." />
    <c:out value="${text}"/>
    <p>Length: ${fn:length(text)}</p> 
    
    <h2>8. replace</h2>
    <c:set var="text" value="There are sixteen JSTL functions." />
    Before replace:  <c:out value="${text}"/>
    <c:set var="text" value="${fn:replace(text,'sixteen', '16')}" /><br/>
    After replace:  <c:out value="${text}"/>
    
    <h2>9. split</h2>
    <c:set var="numbers" value="One,Two,Three,Four,Five" />
    <c:set var="splitNumbers" value="${fn:split(numbers,',')}" />
    <c:set var="joinedNumbers" value="${fn:join(splitNumbers,' ')}" />
    <p>Numbers before split: ${numbers}</p>
    <p>Numbers after split and join: ${joinedNumbers}</p>
    
    <h2>10. startWith</h2>
    <c:set var="stringToSearch" value="There are sixteen JSTL functions." />
    <c:out value="${stringToSearch}"/>
    <c:if test="${fn:startsWith(stringToSearch, 'There')}">
        <p>String starts with There</p>
    </c:if>  
    
    <h2>10. subString</h2>
    <c:set var="text" value="There are sixteen JSTL functions."/>
    <c:set var="website" value="${fn:substring(text, 0, 5)}" />
    Full Text: <strong><c:out value="${text}"/></strong><br/><br/>
    Substring Text (start index 0 - end index 5): 
    <strong><c:out value="${website}"/></strong><br/><br/> 
    
    <h2>11. subStringAfter</h2>
    <c:set var="text" value="There are sixteen JSTL functions."/>
    <c:set var="website" value="${fn:substringAfter(text,'JSTL')}" />
    Full Text: <strong><c:out value="${text}"/></strong><br/><br/>
    Text After Substring JSTL <strong><c:out value="${website}"/></strong><br/><br/>
    
    <h2>12. subStringBefore</h2>
    <c:set var="text" value="There are sixteen JSTL functions."/>
    <c:set var="website" value="${fn:substringBefore(text,'JSTL')}" />
    Full Text: <strong><c:out value="${text}"/></strong><br/><br/>
    Text Before Substring JSTL <strong><c:out value="${website}"/></strong><br/><br/>
    
    <h2>13. toLowerCase</h2>
    <c:set var="text" value="YOUTUBE IS GREAT SOURCE OF INFORMATION"/>
    Text before conversion:  <c:out value="${text}"/><br/><br/>
    <c:set var="text" value="${fn:toLowerCase(text)}"/>
    Text after conversion:  <c:out value="${text}"/><br/><br/>
    
    <h2>14. toUpperCase</h2>
    <c:set var="text" value=" youtube is great source of information"/>
    Text before conversion:  <c:out value="${text}"/><br/><br/>
    <c:set var="text" value="${fn:toUpperCase(text)}"/>
    Text after conversion:  <c:out value="${text}"/><br/><br/>
    
    <h2>13. trim</h2>
     <c:set var="text" value="    Sample text    " />
    <p>Original text before trim: <strong><c:out value="${text}"/></strong>
    <p>Length of text before trim: ${fn:length(text)}</p>
 
    <c:set var="trimmedText" value="${fn:trim(text)}" />
    <p>Original text after trim: <strong><c:out value="${trimmedText}"/></strong>
    <p>Length of text after trim: ${fn:length(trimmedText)}</p>
    
</body>
</html>