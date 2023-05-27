import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListProduct extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM product");

            out.println("<html><head><title>Product Details</title></head><body>");
            out.println("<h2>Product Details</h2>");

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String description = resultSet.getString(3);
                double price = resultSet.getDouble(4);

                out.println("<p>ID: " + id + "</p>");
                out.println("<p>Name: " + name + "</p>");
                out.println("<p>Description: " + description + "</p>");
                out.println("<p>Price: " + price + "</p>");
                out.println("<hr>");
            }

            out.println("</body></html>");

            DBConnection.closeConnection(connection);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            out.println("Error retrieving product details.");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
