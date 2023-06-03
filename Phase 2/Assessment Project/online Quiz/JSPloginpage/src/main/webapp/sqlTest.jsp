<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ page import="com.questions.SQLQuestion" %><%@ include file="header.jsp" %>
<%@ page import="com.questions.SQLQuestionDAO" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SQL Test</title>
</head>
<body>
<h1 >Online Quiz Portal</h1>
    <h3>SQL Test</h3>
    <form action="submitAnswerServlet" method="post">
        <% 
        List<SQLQuestion> questionList = SQLQuestionDAO.getAllSQLQuestions();
        if (questionList != null) {
            for (SQLQuestion question : questionList) { %>
                <h3><%= question.getQuestion() %></h3>
                <input type="hidden" name="questionId" value="<%= question.getId() %>">
                <input type="radio" name="answer<%= question.getId() %>" value="1"> <%= question.getOption1() %><br>
                <input type="radio" name="answer<%= question.getId() %>" value="2"> <%= question.getOption2() %><br>
                <input type="radio" name="answer<%= question.getId() %>" value="3"> <%= question.getOption3() %><br>
                <input type="radio" name="answer<%= question.getId() %>" value="4"> <%= question.getOption4() %><br>
                <hr>
        <% } } %>
        <input type="submit" value="Submit">
    </form>
    
    <br>
    <br>
    <form action="userdashboard.jsp" method="get">
        <input type="submit" value="Back to Dashboard">
    </form>
</body>
</html>
