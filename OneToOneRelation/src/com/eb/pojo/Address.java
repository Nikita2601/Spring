package com.eb.pojo;

public class Address {
 private int id;
 private String addressLine;
 private String city;
 private int pinCode;
 private User user;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAddressLine() {
	return addressLine;
}
public void setAddressLine(String addressLine) {
	this.addressLine = addressLine;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPinCode() {
	return pinCode;
}
public void setPinCode(int pinCode) {
	this.pinCode = pinCode;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
 
}
