package com.eb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eb.model.Menu;
import com.eb.model.Student;
@RestController
@RequestMapping
public class Controller {
	
   @RequestMapping("/info")
   public String disp() {
	   Student s1=new Student();
	   s1.setSid(11);
	   s1.setSname("Sam Dao");
	   s1.setSage(13);
	   return s1.getSid()+" "+s1.getSname()+" "+s1.getSage();
	  
   }
   @RequestMapping("/menu")
   public String show() {
	   Menu m1=new Menu();
	  m1.setMenuid(101);
	  m1.setMenu_name("biryani");
	  m1.setPrise(200);
	  m1.setQuantity(2);
	  int TotalBill=m1.getPrise()*m1.getQuantity();
	  return m1.getMenuid()+" "+m1.getMenu_name()+" "+m1.getPrise()+" "+m1.getQuantity()+" "+m1.getTotalBill();
   }
}
