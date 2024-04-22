package com.eb.main;


import com.eb.pojo.Student;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.eb.dao.StudentDao;
import org.springframework.context.ApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println( "Hello World!" );
	    
		   // ApplicationContext ctx= ContextProvider.provideContext();
		        ApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		        StudentDao studentDao=ctx.getBean("stDao",StudentDao.class);
		    // insert
		   Student ss=new Student();
		   /*Student s=new Student(101,"dev");
		   Student s1=new Student(102,"jhon");
		   Student s2=new Student(103,"Sam");
		   Student s3=new Student(104,"roshni");
		   Student s4=new Student(105,"nikita");
		    studentDao.insert(s);
		    studentDao.insert(s1);
		    studentDao.insert(s2);
		    studentDao.insert(s3);
		    studentDao.insert(s4);
		    studentDao.getAllStudents();
		    System.out.println(ss.getName()+" "+ss.getId());*/
		    
		   // studentDao.delete(105);
		    //studentDao.getAllStudents();
		    //System.out.println(ss.getName()+" "+ss.getId());
		    /*Student s1=new Student();
		    s1.setName("sam Dao");
		    s1.setId(103);
		    studentDao.update(s1);*/

		  
		    studentDao.getAllStudents();
		    System.out.println(ss.getName()+" "+ss.getId());
		    
		    studentDao.getStudent(103);
		    
		    }
		    
		}
