import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String productId = request.getParameter("productId");
        
        try {
            Connection conn = DBConnection.getConnection();
            String sql = "SELECT * FROM product WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, productId);
            
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
            	int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                double price = rs.getDouble("price");
                
                response.setContentType("text/html");
                response.getWriter().println("<h2>Product Details:</h2>");
                response.getWriter().println("<h3>ID: " + id + "</h3>");
                response.getWriter().println("<h3>Name: " + name + "</h3>");
                response.getWriter().println("<h3>Description: " + description + "</h3>");
                response.getWriter().println("<h3>Price: " + price + "</h3>");
            } else {
                response.setContentType("text/html");
                response.getWriter().println("<h2>Product not found!</h2>");
            }
            
            DBConnection.close(conn, stmt, rs);
        } catch (SQLException e) {
            e.printStackTrace();
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        }
    }
}
