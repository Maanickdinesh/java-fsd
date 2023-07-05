package com.questions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deletesqlquestion")
public class DeleteSQLQuestionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the question ID from the request parameter
        Long questionId = Long.parseLong(request.getParameter("id"));

        // Delete the SQL question from the database
        SQLQuestionDAO.deleteSQLQuestion(questionId);

        // Redirect back to the view page
        response.sendRedirect(request.getContextPath() + "/viewsqllist");
    }
}

