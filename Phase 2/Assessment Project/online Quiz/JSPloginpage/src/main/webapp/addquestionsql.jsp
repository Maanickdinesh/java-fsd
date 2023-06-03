<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add SQL Questions</h1>
    
    <form action="addsqlquestion" method="post">
        <label>Question:</label>
        <input type="text" name="question">
        <br>
        <br>
        <label>Option 1:</label>
        <input type="text" name="option1">
        <br>
        <br>
        <label>Option 2:</label>
        <input type="text" name="option2">
        <br>
        <br>
        <label>Option 3:</label>
        <input type="text" name="option3">
        <br>
        <br>
        <label>Option 4:</label>
        <input type="text" name="option4">
        <br>
        <br>
        <label>Correct Option:</label>
        <input type="text" name="correctOption">
        <br>
        <br>
        <input type="submit" value="Add Question">
    </form>
</body>
</html>