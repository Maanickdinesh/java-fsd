<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<h1>Welcome, Admin!</h1>

<a href="addquestion.jsp">Add Questions to quiz</a>
<br>
<br>
<a href="viewuser.jsp">View User List </a>
<br>
<br>
<form action="logoutServlet" method="post">
        <input type="submit" value="Logout">
    </form>
</body>
</html>