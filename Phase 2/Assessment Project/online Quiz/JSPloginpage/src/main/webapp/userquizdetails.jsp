<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@ include file="header.jsp" %>
    <%@ page import="com.user.User" %>
<%@ page import="com.user.UserDAO" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Admin Dashboard</h1>
    <table>
        <tr>
            <th>User ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Score</th>
        </tr>
        <% 
        UserDAO userDAO = new UserDAO();
        List<User> userList = userDAO.getAllUsers();
        if (userList != null) {
            for (User user : userList) { %>
                <tr>
                    <td><%= user.getId() %></td>
                    <td><%= user.getName() %></td>
                    <td><%= user.getEmail() %></td>
                    <td><%=  request.getAttribute("score")  %></td>
                </tr>
        <% } } %>
    </table>
</body>
</html>