<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head> 
	<body>
	    <a href="hello.html">Hello Spring</a> | 
        <a href="contact.html">Contact</a>
        <a href="employ.html">Add User</a>
	    <h1>This is heading 1</h1>
		<table border="1">
			<tr>
				<td>Row 1, cell 1</td> 
				<td>Row 1, cell 2</td>
			</tr>
			<tr>
				<td>Row 2, cell 1</td>
				<td>Row 2, cell 2</td>
			</tr>			
		</table>
		<ol>
			<li>Coffee</li>
			<li>Milk</li>
		</ol>
		<br />
        <a href="http://www.w3schools.com"><img src="<c:url value="images/lupin03.jpg"/>" width="500" height="600" /></a><br /> 
        
         
        <p>This is a paragraph.</p>
		<c:url value="/showMessage.html" var="messageUrl" />
		<a href="${messageUrl}">Click to enter</a>
	</body>
</html>
