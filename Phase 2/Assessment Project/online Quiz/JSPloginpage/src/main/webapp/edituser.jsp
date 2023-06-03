<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@ include file="header.jsp" %><%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>Edit User</h1>
    <form action="updateuser" method="post">
        <input type="hidden" name="userId" value="${user.id}">
        <label>Name: </label>
        <input type="text" name="name" value="${user.name}">
        <br>
        <label>Email: </label>
        <input type="email" name="email" value="${user.email}">
        <br>
        <input type="submit" value="Update">
    </form>
</body>
</html>