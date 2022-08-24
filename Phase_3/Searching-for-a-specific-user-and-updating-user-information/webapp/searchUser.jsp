<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>search</title>
</head>
<body>
<h2>Search User using Id</h2>
<hr>
<form action="searchUser" method="get">
	<label>User ID : </label>
	<input type="number" name="uid"><br>
	<input type="submit" value="Search User">
	<input type="reset" value="reset">
</form>
<br>
${requestScope.msg}
<br>
<a href="index.jsp">Back</a>
</body>
</html>