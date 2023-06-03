package com.questions;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.user.HibernateUtil;

public class SQLQuestionDAO {
	public static List<SQLQuestion> getAllSQLQuestions() {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<SQLQuestion> query = builder.createQuery(SQLQuestion.class);
			Root<SQLQuestion> root = query.from(SQLQuestion.class);
			query.select(root);

			return session.createQuery(query).getResultList();
		}
	}

	public static String formatOptions(SQLQuestion question) {
		String options = question.getOption1() + ", " + question.getOption2() + ", " + question.getOption3() + ", "
				+ question.getOption4();
		return options;
	}

	public static SQLQuestion getSQLQuestionById(Long questionId) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.get(SQLQuestion.class, questionId);
		}
		// Implement other methods for CRUD operations
		// ...

	}

	public static void deleteSQLQuestion(Long questionId) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			Transaction transaction = session.beginTransaction();

			SQLQuestion question = session.get(SQLQuestion.class, questionId);
			if (question != null) {
				session.delete(question);
			}

			transaction.commit();
		}
	}

	public static void updateSQLQuestion(SQLQuestion sqlQuestion) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(sqlQuestion);
            transaction.commit();
        }
	}
}
