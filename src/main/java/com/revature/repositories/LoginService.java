package com.revature.repositories;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.revature.models.Employees;
import com.revature.utilities.HibernateSession;

public class LoginService {
	public boolean UserAuthenticater(String username, String pass) {
		Employees emp = getEmpByUsername(username);
		System.out.println("Checking...");
		if (emp != null && emp.getUsername().equals(username) && emp.getPassword().equals(pass)) {
			System.out.println("Made it Here");
			return true;
		} else {
			System.out.println("I am false");
			return false;
		}
	}
	
	public Employees getEmpByUsername(String username) {
		Session session = HibernateSession.getSession();
		Transaction tx = null;
		Employees emp = null;
		try {
			System.out.println("Query Time");
			tx = session.getTransaction();
			tx.begin();
			Query query = session.createQuery("from Employees where user_name='" + username + "'");
			emp = (Employees)query.uniqueResult();
			tx.commit();
			System.out.println("Transaction Complete");
		} catch (Exception ex) {
			if (tx != null) {
				tx.rollback();
			}
			ex.printStackTrace();
		} finally {
			session.close();
		}
		System.out.println("Return Employee");
		return emp;
	}
	
	@SuppressWarnings("unchecked")
	public List<Employees> getListOfUsers() {
        List<Employees> list = new ArrayList<Employees>();
        Session session = HibernateSession.getSession();
        Transaction tx = null;       
        try {
            tx = session.getTransaction();
            tx.begin();
            list = session.createQuery("from Employees").list();                       
            tx.commit();
        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return list;
    }
}
