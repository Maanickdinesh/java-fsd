import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertProduct extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        BigDecimal price = new BigDecimal(request.getParameter("price"));
       
        // Assuming you have a database connection setup
        try 
        {
        	Connection con = DBConnection.getConnection();
            CallableStatement stmt = con.prepareCall("call products.InsertProduct(?, ?, ?, ?)");
            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setString(3, description);
            stmt.setBigDecimal(4, price);
            
            int rowsAffected = stmt.executeUpdate();
            
            if (rowsAffected > 0) {
                response.setContentType("text/html");
                PrintWriter out = response.getWriter();
                out.println("<h1>Data Inserted Successfully</h1>");
                // Redirect or perform further actions if needed
            } else {
                response.setContentType("text/html");
                PrintWriter out = response.getWriter();
                out.println("<h1>Error while inserting data<h1>");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
