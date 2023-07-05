package com.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateuser")
public class UpdateUserServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String userIdParam = request.getParameter("userId");
		    if (userIdParam != null && !userIdParam.isEmpty()) {
		        try {
		            Long userId = Long.parseLong(userIdParam);
		            String name = request.getParameter("name");
		            String email = request.getParameter("email");
		            
		            UserDAO userDAO = new UserDAO();
		            User user = userDAO.getUserById(userId);
		            if (user != null) {
		                user.setName(name);
		                user.setEmail(email);
		                userDAO.updateUser(user);
		                
		                response.sendRedirect("viewuser.jsp");
		                return;
		            }
		        } catch (NumberFormatException e) {
		            // Handle parsing error
		        }
		    }
		    
		    // Handle invalid userId or other errors
		    response.sendRedirect("error.jsp");
		}
}
