<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%><%@ include file="header.jsp" %>
   <%@ page import="com.questions.SQLQuestion" %>

       
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Edit SQL Question</h1>
    <form action="editsqlquestion" method="post">
        <input type="hidden" name="id" value="<%= ((SQLQuestion) request.getAttribute("question")).getId() %>">
        <label>Question:</label>
        <input type="text" name="question" value="<%= ((SQLQuestion) request.getAttribute("question")).getQuestion() %>">
        <br>
        <label>Option 1:</label>
        <input type="text" name="option1" value="<%= ((SQLQuestion) request.getAttribute("question")).getOption1() %>">
        <br>
        <label>Option 2:</label>
        <input type="text" name="option2" value="<%= ((SQLQuestion) request.getAttribute("question")).getOption2() %>">
        <br>
        <label>Option 3:</label>
        <input type="text" name="option3" value="<%= ((SQLQuestion) request.getAttribute("question")).getOption3() %>">
        <br>
        <label>Option 4:</label>
        <input type="text" name="option4" value="<%= ((SQLQuestion) request.getAttribute("question")).getOption4() %>">
        <br>
        <label>Correct Option:</label>
        <input type="number" name="correctOption" value="<%= ((SQLQuestion) request.getAttribute("question")).getCorrectOption() %>">
        <br>
        <input type="submit" value="Update">
    </form>
    <a href="viewsqllist.jsp">Back to List</a>
</body>
</html>