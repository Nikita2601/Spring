package com.compare;

import java.util.Comparator;

public class Product implements Comparator<Product>{
private int pid;
private String pname;
private double prating;
public Product(int pid, String pname, double prating) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.prating = prating;
}

public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public double getPrating() {
	return prating;
}
public void setPrating(double prating) {
	this.prating = prating;
}
@Override
public int compare(Product o1, Product o2) {
	// TODO Auto-generated method stub
	return 0;
}
}
