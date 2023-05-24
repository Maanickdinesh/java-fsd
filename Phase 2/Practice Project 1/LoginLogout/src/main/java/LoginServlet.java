import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Assuming the login logic here (e.g., validating username and password)

        // Create a session
        HttpSession session = request.getSession();

        // Set session attributes
        session.setAttribute("username", username);

        // Redirect to the dashboard page
        response.sendRedirect("DashboardServlet");
    }
}
