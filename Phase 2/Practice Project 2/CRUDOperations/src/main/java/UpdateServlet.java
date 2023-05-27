

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String  paramater=request.getParameter("id");
		
		//converting string to int
	    int  id=  Integer.parseInt(paramater);
	    String name=request.getParameter("name");
	    String description  = request.getParameter("description");
	    BigDecimal price=new BigDecimal(request.getParameter("price"));
	    
	    
	    
	    try {
	    	Connection con = DBConnection.getConnection();
			PreparedStatement stmt = con.prepareStatement("UPDATE product SET name=?, description=?, price=? WHERE id=?");
			stmt.setString(1, name);
			stmt.setString(2, description);
			stmt.setBigDecimal(3, price);
			stmt.setInt(4, id);
			
			int rowsAffected = stmt.executeUpdate();

			if (rowsAffected > 0) {
				response.getWriter().println("<h1>Record updated successfully.<h1.");
			} else {
				response.getWriter().println("<h1>Failed to update the record.</h1>");
			}

			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
