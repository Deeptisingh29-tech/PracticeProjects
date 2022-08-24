<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
</head>
<body>
<h2>Update the details of the User</h2>
<hr>
<form action="updateUser" method="post">
	<label>User ID : </label>
	<input type="number" name="uid"><br>
	<label>User Name : </label>
	<input type="text" name="uname"><br>
	<label>User Email-ID : </label>
	<input type="email" name="email"><br>
	<label>User age : </label>
	<input type="number" name="age"><br>
	<label>User Photo : </label>
	<input type="text" name="picture"><br>
	<input type="submit" value="Update User">
	<input type="reset" value="reset">
</form>
<br>
${requestScope.msg}
<br>
<a href="index.jsp">Back</a>
</body>
</html>