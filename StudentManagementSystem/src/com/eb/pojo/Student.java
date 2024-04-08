package com.eb.pojo;

public class Student {
 
 private  String studentName;
 private String studentPhone;
 private String studentCity;


public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentPhone() {
	return studentPhone;
}
public void setStudentPhone(String studentPhone) {
	this.studentPhone = studentPhone;
}
public String getStudentCity() {
	return studentCity;
}
public void setStudentCity(String studentCity) {
	this.studentCity = studentCity;
}
@Override
public String toString() {
	return "Student [ studentName=" + studentName + ", studentPhone=" + studentPhone
			+ ", studentCity=" + studentCity + "]";
}
public Student( String studentName, String studentPhone, String studentCity) {
	super();
	
	this.studentName = studentName;
	this.studentPhone = studentPhone;
	this.studentCity = studentCity;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
 
}
