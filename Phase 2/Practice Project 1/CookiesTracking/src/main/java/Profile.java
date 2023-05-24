import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Profile() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			String userid = "";
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals("userid")) {
					userid = cookie.getValue();
					break;
				}
			}
			Cookie c[]=request.getCookies();
			if(c!=null) {
				pw.print("Welcome to "+ c[0].getValue());
			}
			else {
				pw.print("Hey, login first...");
			}
		} else {
			pw.print("Hey, login first...");
			}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
