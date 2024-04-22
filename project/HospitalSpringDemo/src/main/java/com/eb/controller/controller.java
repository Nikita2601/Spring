package com.eb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eb.model.Hospital;
@RestController
@RequestMapping
public class controller {

	@RequestMapping("/info")
		public String show() {
		Hospital h1=new Hospital();
		h1.setName("city hospital");
		h1.setAddress("mumbai");
		h1.setEmailid("cityhospital@gmail.com");
		h1.setContactno(4575854759L);
		h1.setAppointdate(04-2-2024);
		h1.setDrname("neha doctor");
	     return h1.getName()+" "+h1.getAddress()+" "+h1.getEmailid()+" "+
		" "+h1.getContactno()+" "+h1.getAppointdate()+" "+h1.getDrname();
		
		}

}
