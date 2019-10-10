<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>
	<fieldset>
		<legend>Register Form</legend>
		<form action="./register" method="post">
			<table>
				<tr>
					<td>Name :</td>
					<td><input type="text" name="name" required="required"></td>
				</tr>
				<tr>
					<td>Date of Birth:</td>
					<td><input type="date" name="dob"></td>
				</tr>
				<tr>
					<td>Email :</td>
					<td><input type="text" name="email" required="required"></td>
				</tr>
				<tr>
					<td>Password :</td>
					<td><input type="password" name="password" required="required"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Register"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>