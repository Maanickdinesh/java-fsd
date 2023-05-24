import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1426642947413148526L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			String n = request.getParameter("userName");
			out.println("Welcome " + n);

			// appending the username in the query string
			out.println("<a href='servlet2?uname=" + n + "'>visit</a>");

			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
