<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<h1>EDIT DATA</h1>
</head>
<body>

<form action="update">
<table border="1" align="center">

	<input type="hidden" name="id" value="${data.id }">
	
	<tr>
		<td>Name:- </td>
		<td><input type="text" name="name" value="${data.name}"></td>
	</tr>
	
	<tr>
		<td>Address:- </td>
		<td><input type="text" name="address" value="${data.address }"></td>
	</tr>
	
	<tr>
		<td>MobileNo:- </td>
		<td><input type="text" name="mobileno" value="${data.mobileno }"></td>
	</tr>
	
	<tr>
		<td>Salary:- </td>
		<td><input type="text" name="salary" value="${data.salary }"></td>
	</tr>
	
	<tr>
		<td>UserName:- </td>
		<td><input type="text" name="username" value="${data.username}"></td>
	</tr>
	
	<tr>
		<td>PassWord:- </td>
		<td><input type="text" name="password" value="${data.password }"></td>
	</tr>
	
	<tr>
		<td><input type="submit" value="update"></td>
	</tr>

</table>

</form>

</body>
</html>