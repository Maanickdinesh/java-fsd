package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entitiy.Products;
import com.util.HibernateUtil;

@WebServlet("/add-product")
public class AddProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public AddProductServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("add-product.html").include(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        double price = Double.parseDouble(request.getParameter("price"));


        // Step 1: Get session Factory
        SessionFactory sf = HibernateUtil.buildSessionFactory();

        // Step 2: Get Session object
        Session session = sf.openSession();

        // Step 3: Get Transaction object and begin transaction
        Transaction tx = session.beginTransaction();

        try {
            // Step 4: Create and populate entity object
            Products product = new Products();
            product.setId(id);
            product.setName(name);
            product.setDescription(description);
            product.setPrice(price);
            // Step 5: Save record in DB
            session.save(product);

            tx.commit();

            out.print("<h3>Product is created successfully!</h3>");
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            out.print("<h3>Error occurred while creating the product.</h3>");
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
