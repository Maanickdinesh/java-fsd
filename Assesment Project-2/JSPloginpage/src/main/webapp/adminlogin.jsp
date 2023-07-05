<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    body {
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    h1 {
        text-align: center;
    }

    form {
        text-align: center;
    }

    input[type="email"],
    input[type="password"] {
        width: 100%;
        padding: 10px;
        margin-bottom: 10px;
    }

    
</style>
</head>
<body>
    <div align="center">
        <h1>Admin  Login</h1>
        <form action="adminLoginServlet" method="post">
            Email: <input type="email" name="email"><br>
            Password: <input type="password" name="password"><br>
            <br>
            <input type="submit" value="Login">
        </form> <br>
       <h3><a href="index.jsp" class="button">Main</a></h3> 
    </div>
</body>
</html>
