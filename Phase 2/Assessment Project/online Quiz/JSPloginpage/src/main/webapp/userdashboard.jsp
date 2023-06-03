<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Dashboard</title>
    <style>
        
        
        .container {
            max-width: 800px;
            margin: 0 auto;
            padding: 20px;
        }
        
        h2 {
            text-align: center;
        }
        h1{
        text-align: center;
        }
        
        .welcome-message {
            text-align: center;
            margin-bottom: 20px;
        }
        
        .action-link {
            display: block;
            margin: 0 auto 10px;
            text-align: center;
        }
        
        .logout-form {
            text-align: center;
        }
    </style>
</head>
<body>
    <div class="container">
    <h1>Online Quiz Portal</h1>
        <h2>Welcome to the User Dashboard</h2>
        <p class="welcome-message">Welcome, <%= session.getAttribute("name") %>!</p>
        <button class="action-link" onclick="window.location.href='sqlTestServlet'">Take SQL Test</button>
    </div>
</body>
</html>
