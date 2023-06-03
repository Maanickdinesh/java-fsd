package com.questions;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/submitAnswerServlet")
public class SubmitAnswerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<Long, Integer> userAnswers = new HashMap<>();

        // Get the submitted answers from the request parameters
        List<SQLQuestion> questionList = SQLQuestionDAO.getAllSQLQuestions();
        for (SQLQuestion question : questionList) {
            Long questionId = question.getId();
            int selectedOption = Integer.parseInt(request.getParameter("answer" + questionId));
            userAnswers.put(questionId, selectedOption);
        }

        // Calculate the score
        int score = calculateScore(userAnswers, questionList);

        // Set the score as a request attribute and forward to a result page
        request.setAttribute("score", score);
        request.getRequestDispatcher("/sqlTestResult.jsp").forward(request, response);
    }

    private int calculateScore(Map<Long, Integer> userAnswers, List<SQLQuestion> questionList) {
        int score = 0;

        for (SQLQuestion question : questionList) {
            Long questionId = question.getId();
            int selectedOption = userAnswers.getOrDefault(questionId, -1);
            int correctOption = question.getCorrectOption();

            if (selectedOption == correctOption) {
                score++; // Increment score for each correct answer
            }
        }

        return score;
    }
}
