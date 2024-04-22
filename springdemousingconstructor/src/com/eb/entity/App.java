package com.eb.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx1=new ClassPathXmlApplicationContext("bean.xml");
	     Post m1=(Post)ctx1.getBean("m");
		 m1.disp();
	}
}
