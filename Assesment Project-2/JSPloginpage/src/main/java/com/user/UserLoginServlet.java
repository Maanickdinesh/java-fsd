package com.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/userloginServlet")
public class UserLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        UserDAO userDAO = new UserDAO();
        User user = userDAO.validateUser(email, password);

        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("name", user.getName());
            response.sendRedirect("userdashboard.jsp");
        } else {
            request.setAttribute("error", "Invalid email or password");
          
            request.getRequestDispatcher("userlogin.jsp").forward(request, response);
        }
    }
}
