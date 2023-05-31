<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dashboard</title>
</head>
<body>
<h1>Welcome to the Dashboard</h1>
    <p>Welcome, <%= session.getAttribute("name") %>!</p>
    <form action="logoutServlet" method="post">
        <input type="submit" value="Logout">
    </form>
</body>
</html>