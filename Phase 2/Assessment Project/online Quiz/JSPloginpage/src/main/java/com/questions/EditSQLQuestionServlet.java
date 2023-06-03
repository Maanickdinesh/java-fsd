package com.questions;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/editsqlquestion")
public class EditSQLQuestionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the question ID from the request parameter
        Long questionId = Long.parseLong(request.getParameter("id"));

        // Retrieve the SQL question from the database
        SQLQuestion sqlQuestion = SQLQuestionDAO.getSQLQuestionById(questionId);

        // Forward the question object to the JSP page for editing
        request.setAttribute("question", sqlQuestion);
        request.getRequestDispatcher("editsqlquestion.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the question ID from the request parameter
        Long questionId = Long.parseLong(request.getParameter("id"));

        // Retrieve the SQL question from the database
        SQLQuestion sqlQuestion = SQLQuestionDAO.getSQLQuestionById(questionId);

        // Update the SQL question with the form data
        sqlQuestion.setQuestion(request.getParameter("question"));
        sqlQuestion.setOption1(request.getParameter("option1"));
        sqlQuestion.setOption2(request.getParameter("option2"));
        sqlQuestion.setOption3(request.getParameter("option3"));
        sqlQuestion.setOption4(request.getParameter("option4"));
        sqlQuestion.setCorrectOption(Integer.parseInt(request.getParameter("correctOption")));

        // Update the SQL question in the database
        SQLQuestionDAO.updateSQLQuestion(sqlQuestion);

        // Redirect to the SQL question list page
        response.sendRedirect("viewsqllist.jsp");
    }
}
