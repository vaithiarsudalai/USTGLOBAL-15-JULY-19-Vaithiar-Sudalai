<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<fieldset>
		<legend>Login Form</legend>
		<form action="./login" method="post">
			<table>
				<tr>
					<td>Email :</td>
					<td><input type="text" name="email" required="required"></td>
				</tr>
				<tr>
					<td>Password :</td>
					<td><input type="password" name="password" required="required"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Login"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<a href="./register">Register Here</a>
	<h3>${msg}</h3>
</body>
</html>