package com.eb.pojo;

public class Bank1 {
 private long Acc_number;
 private String Acc_holder_name;
 private String Address;
 private long Contact_number;
 private long Balanace;

 public long getAcc_number() {
	return Acc_number;
}
public void setAcc_number(long acc_number) {
	Acc_number = acc_number;
}
public String getAcc_holder_name() {
	return Acc_holder_name;
}
public void setAcc_holder_name(String acc_holder_name) {
	Acc_holder_name = acc_holder_name;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public long getContact_number() {
	return Contact_number;
}
public void setContact_number(long contact_number) {
	Contact_number = contact_number;
}
public long getBalanace() {
	return Balanace;
}
public void setBalanace(long balanace) {
	Balanace = balanace;
}
@Override
public String toString() {
	return "Bank1 [Acc_number=" + Acc_number + ", Acc_holder_name=" + Acc_holder_name + ", Address=" + Address
			+ ", Contact_number=" + Contact_number + ", Balanace=" + Balanace + "]";
}
public Bank1(long acc_number, String acc_holder_name, String address, long contact_number, long balanace) {
	super();
	Acc_number = acc_number;
	Acc_holder_name = acc_holder_name;
	Address = address;
	Contact_number = contact_number;
	Balanace = balanace;
}
public Bank1() {
	super();
	// TODO Auto-generated constructor stub
}
}










