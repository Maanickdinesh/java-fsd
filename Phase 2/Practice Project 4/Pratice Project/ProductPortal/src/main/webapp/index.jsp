<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<form method="post" action="Product">
	<h2>Product Details</h2>
		Id: <input type="number" name="id" required>
		<br/>
		<br/>
		Name: <input type="text" name="name" required>
		<br/>
		<br/>
		Color: <input type="text" name="color" required>
		<br/>
		<br/>
		Price: <input type="number" name="price" required>
		<br/>
		<br/>
		<input type="submit" value="Submit">
	</form>
	</div>
</body>
</html>