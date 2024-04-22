package com.Main;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.model.Student;


public class ReadStudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		//get all students
		Query<Student> query=session.createQuery("from Student");
		List<Student>list=(List<Student>)query.list();
	    for(Student st:list) {
	    	System.out.println("List of student:"+st.getId()+","+st.getName()+","+st.getDegree());

	   }
	    query = session.createQuery("from Student where id= :id");
		query.setLong("id", 101);
		Student stu = (Student) query.uniqueResult();
		System.out.println("Student Name=" + stu.getName() + ", Degre="
				+ stu.getDegree());
		tx.commit();
		session.close();
	}
	
	

}
