import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JDBCServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");

        try {
            // Initialize JDBC connection
            Connection connection = DBConnection.getConnection();

            out.println("<h2>JDBC initialized successfully!</h2>");

            // Close JDBC connection
            DBConnection.closeConnection(connection);

            out.println("<h2>JDBC connection closed!</h2>");
        } catch (ClassNotFoundException | SQLException e) {
            out.println("<h2>Error initializing JDBC: " + e.getMessage() + "</h2>");
        }

        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
