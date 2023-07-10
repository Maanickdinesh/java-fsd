package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.entitiy.Products;
import com.util.HibernateUtil;

@WebServlet("/read-product")
public class ReadProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ReadProductServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Product List</title></head><body>");

        SessionFactory sf = HibernateUtil.buildSessionFactory();
        Session session = sf.openSession();

        Query<Products> query = session.createQuery("from Products", Products.class);
        List<Products> productList = query.getResultList();

        session.close();

        out.println("<h2>Product List</h2>");
        out.println("<table border='1'>");
        out.println("<tr><th>ID</th><th>Name</th><th>Description</th><th>Price</th></tr>");

        for (Products product : productList) {
            out.println("<tr>");
            out.println("<td>" + product.getId() + "</td>");
            out.println("<td>" + product.getName() + "</td>");
            out.println("<td>" + product.getDescription() + "</td>");
            out.println("<td>" + product.getPrice() + "</td>");
            out.println("</tr>");
        }

        out.println("</table>");
        out.println("</body></html>");
    }
}
