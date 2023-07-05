package com.user;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class AdminDAO {
    private SessionFactory sessionFactory;

    public AdminDAO() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public Admin validateAdmin(String email, String password) {
        try (Session session = sessionFactory.openSession()) {
            Query<Admin> query = session.createQuery("FROM Admin WHERE email = :email AND password = :password", Admin.class);
            query.setParameter("email", email);
            query.setParameter("password", password);
            return query.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
