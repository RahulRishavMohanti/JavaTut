<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Login</title>
<link rel="stylesheet" href="css/style.css" />
</head>
<body>

<h1>Login</h1>
<form method="post" action="login.do">
<table border="1">
	<tr>
	<td>
	Email<input type="email" name="email" required/><br>
	</td></tr>
	<tr>
	<td>
	
	Pass<input type="password" name="pass" required/><br>
	</td>
	</tr>

</table>	
	<button type="submit">Login</button>
	</form>
</body>
</html>