<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.user.User"%>
<%@ page import="com.user.UserDAO"%>
<%@ page import="java.util.List"%><%@ include file="header.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User List</title>
<style>
    table {
        width: 100%;
        border: 1px solid black;
    }

    th, td {
        border: 1px solid black;
        padding: 8px;
        text-align: left;
    }

    tr:nth-child(even) {
        background-color: #f2f2f2;
    }

    tr:hover {
        background-color: #e6e6e6;
    }
</style>
</head>
<body>
    <h1>User List</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Date of Birth</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <% 
            UserDAO userDAO = new UserDAO();
            List<User> userList = userDAO.getAllUsers();
            for (User user : userList) { %>
            <tr>
                <td><%= user.getId() %></td>
                <td><%= user.getName() %></td>
                <td><%= user.getEmail() %></td>
                <td><%= user.getDob() %></td>
                <td>
                    <a href="edituser?userId=<%= user.getId() %>">Edit</a>
                    <a href="deleteuser?userId=<%= user.getId() %>">Delete</a>
                </td>
            </tr>
            <% } %>
        </tbody>
    </table>
    
    <br> <br> 
    <a href="admindashboardpage.jsp">Go Back to Admin Dashboard</a>
</body>
</html>
