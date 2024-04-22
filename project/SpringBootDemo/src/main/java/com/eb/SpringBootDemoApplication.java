package com.eb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eb.model.Student;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
		Student s1=new Student();
		s1.setSid(101);
		s1.setSname("neha");
		s1.setSage(20);
		System.out.println(s1.getSid()+" "+s1.getSname()+" "+s1.getSage());
		
	}
	

}
