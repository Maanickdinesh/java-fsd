package com.user;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class UserDAO {
    public void registerUser(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }

    public User validateUser(String email, String password) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query<User> query = session.createQuery("FROM User WHERE email = :email AND password = :password", User.class);
        query.setParameter("email", email);
        query.setParameter("password", password);
        User user = query.uniqueResult();
        session.close();
        return user;
        
    }
    // -------------------------------- show the list of user -------------------
    public List<User> getAllUsers() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query<User> query = session.createQuery("FROM User", User.class);
        List<User> userList = query.list();
        session.close();
        return userList;
    }
    
    // -------------------------------- show the list of user -------------------
    public User getUserById(Long userId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        User user = session.get(User.class, userId);
        session.close();
        return user;
    }
 // -------------------------------- Update the list of user -------------------
    public void updateUser(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(user);
        transaction.commit();
        session.close();
    }
 // -------------------------------- Delete the list of user -------------------
    public void deleteUser(Long userId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        
        User user = session.get(User.class, userId);
        if (user != null) {
            session.delete(user);
        }
        
        transaction.commit();
        session.close();
    }

}
