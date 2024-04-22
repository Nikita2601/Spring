package com.manytomanyrelation.main;


import org.hibernate.Session;

import com.manytomanyrelation.model.Student;
import com.manytomanyrelation.model.Subject;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//public Student(String firstName, String lastName)
     Student student1=new Student("Kartiki","K");
     Student student2=new Student("meghana","M");
     Student student3=new Student("akash","P");
     Student student4=new Student("amisha","G");
	
	//public subject(String name)
	
	Subject subject1=new Subject("Spring");
	Subject subject2=new Subject("Devops");
	Subject subject3=new Subject("vew js");

   // student 1 have 3 subjects
	student1.getSubjects().add(subject3);
    student2.getSubjects().add(subject2);
    student3.getSubjects().add(subject1);
    student3.getSubjects().add(subject2);
	
    //Student 2 have 2 subjects
    student4.getSubjects().add(subject1);
    student4.getSubjects().add(subject2);
    student4.getSubjects().add(subject3);
    Session session = HibernateUtil.getSessionFactory().openSession();
    session.beginTransaction();
    //persist=means storing/saving data
    session.persist(student1);
    session.persist(student2);
    session.persist(student3);
     
    session.persist(student4);
    session.getTransaction().commit();
    session.close();  
}
}

