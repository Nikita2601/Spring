package com.eb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eb.model.Hospital;

@SpringBootApplication
public class HospitalSpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalSpringDemoApplication.class, args);
		Hospital h1=new Hospital();
		h1.setName("city hospital");
		h1.setAddress("mumbai");
		h1.setEmailid("cityhospital@gmail.com");
		h1.setContactno(4575854759L);
		h1.setAppointdate(04-2-2024);
		h1.setDrname("neha doctor");
		System.out.println("hospital name:"+h1.getName()+"hospital add:"+h1.getAddress()+"hospital email:"+h1.getEmailid()+"hospital number:"+h1.getContactno()+"appointdate:"+h1.getAppointdate()+"drname:"+h1.getDrname());;
	}

}
