package com.eb.entity;

public class Student {
   private int stud_id;
   private String name;
   private Course course;
public int getStud_id() {
	return stud_id;
}
public void setStud_id(int stud_id) {
	this.stud_id = stud_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Course getCourse() {
	return course;
}
public void setCourse(Course course) {
	this.course = course;
}
   public void disp() {
   System.out.println("student Id:"+stud_id+"\n Student name:"+name);
   System.out.println("course");
   }
   }

