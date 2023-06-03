package com.questions;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sqlTestServlet")
public class SQLTestServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<SQLQuestion> sqlQuestions = SQLQuestionDAO.getAllSQLQuestions();
        request.setAttribute("sqlQuestions", sqlQuestions);
        request.getRequestDispatcher("sqlTest.jsp").forward(request, response);
    }
}

