<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product details portal</title>
</head>
<body>
<h2>Product Details Portal</h2>
<hr>
<h3>Enter the details of product...</h3>
<form action="addProduct.jsp" method="post">
	<label>Id</label>:
	<input type="number" name="pid"><br><br>
	<label>Name</label>:
	<input type="text" name="pname"><br><br>
	<label>Price</label>:
	<input type="text" name="price"><br><br>
	<label>URL</label>:
	<input type="url" name="url"><br><br>
	<input type="submit" value="submit">
	<input type="reset" value="reset">
</form>
</body>
</html>