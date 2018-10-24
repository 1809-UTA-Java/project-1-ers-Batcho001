package com.revature.repositories;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.models.Employees;
import com.revature.utilities.MyBankConnection;

public class LoginService {
	public boolean UserAuthenticater(String username, String pass) {
		Employees emp = getUser(username, pass);
		System.out.println(emp.getUsername());
		return true;
	}

//	public Employees getEmpByUsername(String username) {
//		Session session = HibernateSession.getSession();
//		Transaction tx = null;
//		Employees emp = null;
//		try {
//			System.out.println("Query Time");
//			tx = session.getTransaction();
//			tx.begin();
//			Query query = session.createQuery("from Employees e where e.username= :nameVar");
//			query.setString("nameVar", username);
//			emp = (Employees)query.uniqueResult();
//			tx.commit();
//			System.out.println("Transaction Complete");
//		} catch (Exception ex) {
//			if (tx != null) {
//				tx.rollback();
//				System.out.println("Exception");
//			}
//			ex.printStackTrace();
//		} finally {
//			session.close();
//		}
//		System.out.println("Return Employee");
//		return emp;
//	}
//	
//	@SuppressWarnings("unchecked")
//	public List<Employees> getListOfUsers() {
//        List<Employees> list = new ArrayList<Employees>();
//        Session session = HibernateSession.getSession();
//        Transaction tx = null;       
//        try {
//            tx = session.getTransaction();
//            tx.begin();
//            list = session.createQuery("from Employees").list();                       
//            tx.commit();
//        } catch (Exception e) {
//            if (tx != null) {
//                tx.rollback();
//            }
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//        return list;
//    }
	
	public Employees getUser(String n, String p) {
		Employees info = null;
		
		try {
			Connection conn = MyBankConnection.getConnection();
			String sql = "SELECT * FROM LOGIN WHERE USERNAME=? AND USERPWRD=?";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, n);
			statement.setString(2, p);
			statement.executeQuery();
			
//			ResultSet set = statement.executeQuery();
//			
//
//			if (set.next()) {
//				int id = set.getInt("USER_ID");
//				String fname = set.getString("USER_FNAME");
//				String lname = set.getString("USER_LNAME");
//				int balance = set.getInt("USER_BALANCE");
//				int account = set.getInt("USER_ACCOUNTNUM");
//			} 
					
		} catch (SQLException | IOException e1) {
			e1.printStackTrace();
		}
		return info;
	}
}
