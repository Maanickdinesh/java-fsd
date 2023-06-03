<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html><%@ include file="header.jsp" %>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>SQL Test Result</title>
</head>
<body>
    <h1>SQL Test Result</h1>
    <p>Your score: <%= request.getAttribute("score") %></p>
    <a href="userdashboard.jsp">Back to Dashboard</a>
</body>
</html>
