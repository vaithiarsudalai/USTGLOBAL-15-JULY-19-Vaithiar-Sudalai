<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page session="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Portal</title>
</head>
<body>
	<fieldset>
		<legend>Employee Login</legend>
		<form action="./login" method="post">

			<table>
				<tr>
					<td>Id</td>
					<td>:</td>
					<td><input type="number" name="id" required></td>
				</tr>
				<tr>
					<td>Password</td>
					<td>:</td>
					<td><input type="password" name="password" required></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Login"></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<a href="./register">Sign Up</a>

</body>
</html>