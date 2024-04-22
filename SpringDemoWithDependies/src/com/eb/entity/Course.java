package com.eb.entity;

public class Course {
 private int co_id;
 private String co_name;
 private String duration;
 private int fees;
public int getCo_id() {
	return co_id;
}
public void setCo_id(int co_id) {
	this.co_id = co_id;
}
public String getCo_name() {
	return co_name;
}
public void setCo_name(String co_name) {
	this.co_name = co_name;
}
public String getDuration() {
	return duration;
}
public void setDuration(String duration) {
	this.duration = duration;
}
public int getFees() {
	return fees;
}
public void setFees(int fees) {
	this.fees = fees;
}
@Override
public String toString() {
	return "Course [co_id=" + co_id + ", co_name=" + co_name + ", duration=" + duration + ", fees=" + fees + "]";
}
 
}
