package com.spring2.entity;

public class Student {
  private int Stud_id;
  private String stud_name;
  private int stud_age;
  private long stud_number;
  private String address;
public int getStud_id() {
	return Stud_id;
}
public void setStud_id(int stud_id) {
	Stud_id = stud_id;
}
public String getStud_name() {
	return stud_name;
}
public void setStud_name(String stud_name) {
	this.stud_name = stud_name;
}
public int getStud_age() {
	return stud_age;
}
public void setStud_age(int stud_age) {
	this.stud_age = stud_age;
}
public long getStud_number() {
	return stud_number;
}
public void setStud_number(long stud_number) {
	this.stud_number = stud_number;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public void show() {
	System.out.println("Student Id:"+Stud_id+"\n Student Name:"+stud_name+
			"\n Student Age:"+stud_age+"\n Student Number:"+stud_number+"\n Student Address:"+address);
}

}

