<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
    <style>
        fieldset {
            border: 1px solid #ccc;
            padding: 10px;
        }
    </style>
</head>
<body>
<h1>Add Product</h1>

    <form method="post" action="add-product">
        <fieldset>
            <legend>Add Product form</legend>
            <label for="productId">Product ID:</label>
            <input type="text" id="productId" name="id" required><br><br>

            <label for="productName">Product Name:</label>
            <input type="text" id="productName" name="name" required><br><br>

            <label for="productDescription">Product Description:</label>
            <input type="text" id="productDescription" name="description" required><br><br>

            <label for="productPrice">Product Price:</label>
            <input type="text" id="productPrice" name="price" required><br><br>

            <input type="submit" value="Add Product">
        </fieldset>
    </form>
</body>
</html>