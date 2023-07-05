package com.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/edituser")
public class EditUserServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long userId = Long.parseLong(request.getParameter("userId"));
        UserDAO userDAO = new UserDAO();
        User user = userDAO.getUserById(userId); // to to userdao class call the method
        request.setAttribute("user", user);
        request.getRequestDispatcher("edituser.jsp").forward(request, response);
    }
}
