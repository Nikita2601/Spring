package com.spring2.entity;


import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx1=new ClassPathXmlApplicationContext("bean.xml");
	     
		Student m1=(Student)ctx1.getBean("n");
		   m1.show();
	}

}
