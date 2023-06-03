<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ include file="header.jsp" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
    <h1>Add Questions to Quiz</h1>
    
    <h2>Subjects:</h2>
    <table>
        <thead>
            <tr>
                <th>Subject</th>
                <th>Add Question</th>
                <th>View Question</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>SQL</td>
                <td><a href="addquestionsql.jsp">Add SQL Question</a></td>
                <td><a href="viewsqllist.jsp">View SQL Questions</a></td>
            </tr>
            
        </tbody>
    </table>
    
</body>
</html>
