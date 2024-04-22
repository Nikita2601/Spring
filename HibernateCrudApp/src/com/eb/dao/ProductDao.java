package com.eb.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.eb.main.HibernateUtil;
import com.eb.model.Product;



public class ProductDao {
	
	private Session session = null;

	public void insert(Product p) {
		Session session = HibernateUtil.getSessionFactory().openSession();
      
		Transaction tx = session.beginTransaction();
		session.save(p);
		tx.commit();
		session.close();
	}



	public List<Product> getProductList() {
		Session session = HibernateUtil.getSessionFactory().openSession();
	      
		Transaction tx = session.beginTransaction();
		List<Product> li = session.createCriteria(Product.class).list();
		session.close();
		return li;
	}

	public void deleteProduct(int id) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
	      
		Transaction tx = session.beginTransaction();
		Product u = (Product) session.get(Product.class, id);
		session.delete(u);
		tx.commit();
		session.close();
	}
public Product getProductById(int id) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
	    
		Transaction tx = session.beginTransaction();
		Product u = (Product) session.get(Product.class, id);
		
		tx.commit();
		session.close();
		return u;
	}
	public void updateProduct(Product p) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(p);
		tx.commit();
		session.close();
	}
}
