package com.Main;

import javax.transaction.*;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Student;
public class InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
      Transaction tx=session.beginTransaction();
      Student student=new Student();
      student.setId(101);
      student.setName("Archana");
      student.setRoll("110");
      student.setPhone("4578592315");
      student.setDegree("BCA");
      session.save(student);
      tx.commit();
      session.close();
	}

}
