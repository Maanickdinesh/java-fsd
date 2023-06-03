<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ page import="com.questions.SQLQuestion" %><%@ include file="header.jsp" %>
<%@ page import="com.questions.SQLQuestionDAO" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View SQL Questions</title>
<style>
    table {
        width: 100%;
        border-collapse: collapse;
    }

    th, td {
        border: 1px solid black;
        padding: 8px;
        text-align: left;
    }

    tr:nth-child(even) {
        background-color: #f2f2f2;
    }
</style>
</head>
<body>
    <h1>View SQL Questions</h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Question</th>
                <th>Options</th>
                <th>Correct Option</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <% 
            SQLQuestionDAO sqlQuestionDAO = new SQLQuestionDAO();
            List<SQLQuestion> questionList = sqlQuestionDAO.getAllSQLQuestions();
            for (SQLQuestion question : questionList) { %>
                <tr>
                    <td><%= question.getId() %></td>
                    <td><%= question.getQuestion() %></td>
                    <td><%= question.getOption1() %>, <%= question.getOption2() %>, <%= question.getOption3() %>, <%= question.getOption4() %></td>
                    <td><%= question.getCorrectOption() %></td>
                    <td>
                        <a href="editsqlquestion?id=<%= question.getId() %>">Edit</a>
                        <a href="deletesqlquestion?id=<%= question.getId() %>">Delete</a>
                    </td>
                </tr>
            <% } %>
        </tbody>
    </table>

    <br> <br> 
    <a href="admindashboardpage.jsp">Go Back Admin Dashboard</a>
</body>
</html>
