<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>Spring Tiles Contact Form</title>
</head>
<body>
<h2>Contact Manager</h2>
<form:form method="post" action="addContact.html">

	<table>
	<tr>
		<td><form:label path="id">id</form:label></td>
		<td><form:input path="id" /></td> 
	</tr>
	<tr>
		<td><form:label path="name">Name</form:label></td>
		<td><form:input path="name" /></td>
	</tr>
	<tr>
		<td><form:label path="age">age</form:label></td>
		<td><form:input path="age" /></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="Add Contact"/>
		</td>
	</tr>
</table>	
	
</form:form>
</body>
</html>
