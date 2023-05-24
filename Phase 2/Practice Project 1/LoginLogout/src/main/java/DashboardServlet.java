import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/DashboardServlet")
public class DashboardServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the session
        HttpSession session = request.getSession();

        // Check if the session contains the username attribute
        if (session.getAttribute("username") != null) {
            // Session is active, show the dashboard
            response.setContentType("text/html");
            response.getWriter().println("<h2>Welcome to the Dashboard</h2>");
            response.getWriter().println("<p>This is your dashboard content.</p>");
            response.getWriter().println("<a href='LogoutServlet'>Logout</a>");
        } else {
            // Session is not active, redirect to login page
            response.sendRedirect("login.html");
        }
    }
}
