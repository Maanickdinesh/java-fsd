package com.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/adminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        AdminDAO adminDAO = new AdminDAO();
        Admin admin = adminDAO.validateAdmin(email, password);

        if (admin != null) {
            request.getSession().setAttribute("adminAuthenticated", true);
            response.sendRedirect("admindashboardpage.jsp");
        } else {
            // Invalid admin credentials, display an error message or redirect to login page
            response.sendRedirect("adminlogin.jsp?error=invalidAdminCredentials");
        }
    }
}

