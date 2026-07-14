<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Form</title>
</head>
<body>

<h2>Product Registration Form</h2>

<form action="saveProduct" method="post">

   
    Product Name:
    <input type="text" name="productName"><br><br>

    Brand:
    <input type="text" name="brand"><br><br>

    Category:
    <input type="text" name="category"><br><br>

    Price:
    <input type="number" step="0.01" name="price"><br><br>

    Quantity:
    <input type="number" name="quantity"><br><br>

    <input type="submit" value="Save Product">

</form>

</body>
</html>