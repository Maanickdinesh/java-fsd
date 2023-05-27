import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DBoperation extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String action = request.getParameter("action");

        try {
            Connection connection = DBConnection.getConnection();
            Statement statement = connection.createStatement();

            if (action.equals("create")) {
                // Check if the database exists
                ResultSet resultSet = connection.getMetaData().getCatalogs();
                boolean databaseExists = false;
                while (resultSet.next()) {
                    String databaseName = resultSet.getString(1);
                    if (databaseName.equals("ecommerce")) {
                        databaseExists = true;
                        break;
                    }
                }
                resultSet.close();

                if (!databaseExists) {
                    // Create the database
                    statement.executeUpdate("CREATE DATABASE ecommerce");
                    out.println("<h3>Database created successfully.</h3>");
                } else {
                    out.println("<h3>Database already exists.</h3>");
                }
            } else if (action.equals("use")) {
                // Check if the database exists
                ResultSet resultSet = connection.getMetaData().getCatalogs();
                boolean databaseExists = false;
                while (resultSet.next()) {
                    String databaseName = resultSet.getString(1);
                    if (databaseName.equals("ecommerce")) {
                        databaseExists = true;
                        break;
                    }
                }
                resultSet.close();

                if (databaseExists) {
                    // Use the database
                    statement.executeUpdate("USE ecommerce");
                    out.println("<h3>Using database 'ecommerce'.</h3>");
                } else {
                    out.println("<h3>Database does not exist. Cannot use the database.</h3>");
                }
            } else if (action.equals("drop")) {
                // Check if the database exists
                ResultSet resultSet = connection.getMetaData().getCatalogs();
                boolean databaseExists = false;
                while (resultSet.next()) {
                    String databaseName = resultSet.getString(1);
                    if (databaseName.equals("ecommerce")) {
                        databaseExists = true;
                        break;
                    }
                }
                resultSet.close();

                if (databaseExists) {
                    // Drop the database
                    statement.executeUpdate("DROP DATABASE ecommerce");
                    out.println("<h3>Database dropped successfully.</h3>");
                } else {
                    out.println("<h3>Database does not exist. Cannot drop the database.</h3>");
                }
            }

            DBConnection.closeConnection(connection);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            out.println("<h3>Error performing database operation.</h3>");
        }
    }
}
