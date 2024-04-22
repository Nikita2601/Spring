package com.onetomany.main;



	import java.util.HashSet;
	import java.util.Set;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;

	import com.onetomany.model.Cart1;
	import com.onetomany.model.Items1;

	public class App {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Cart1 c1=new Cart1();
			c1.setName("flipcart");
			//Items1( String itemId, double itemTotal, int quantity, Cart1 cart1) 
			Items1 i1=new Items1("speaker101",1000,1,c1);
			Items1 i2=new Items1("kurties",2000,3,c1);
			Items1 i3=new Items1("shoose",2700,1,c1);
			
			Set<Items1>itemset=new HashSet<Items1>();
			itemset.add(i1);
			itemset.add(i2);
			itemset.add(i3);
			
			c1.setItems1(itemset);
			c1.setTotal(1000*1+2000*3+2700*1);
			SessionFactory sessionFactory = null;
			Session session = null;
			sessionFactory = HibernateUtil.getSessionFactory();
			session = sessionFactory.getCurrentSession();
	 //create the session object
			session.beginTransaction();
			//create the transaction from the session object

			session.save(c1); 
			// save the vehicle entity to the database
			session.save(i1);
			session.save(i2);
			session.save(i3);
			// save the user entity to the database

			session.getTransaction().commit(); 
			//close the transaction
			session.close(); 
			
			
			
			
		}

	}

