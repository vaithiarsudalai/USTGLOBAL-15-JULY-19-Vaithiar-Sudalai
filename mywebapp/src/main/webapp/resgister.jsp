<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<form action="./register" method = "POST">
		<table>
			<tr>
				<th>Id :</th>
				<td><input type="number" name="id" required></td>
			</tr>
			<tr>
				<th>Name :</th>
				<td><input type="text" name="name" required></td>
			</tr>
			<tr>
				<th>Age :</th>
				<td><input type="number" name="age" required></td>
			</tr>
			<tr>
				<th>Salary :</th>
				<td><input type="number" name="salary" required></td>
			</tr>
			<tr>
				<th>Designation :</th>
				<td><input type="text" name="designation" required></td>
			</tr>
			<tr>
				<th>Password :</th>
				<td><input type="text" name="password" required></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"></td>
				<td><input type="reset" value="Reset"></td>
			</tr>
		</table>
	</form>
</body>
</html>