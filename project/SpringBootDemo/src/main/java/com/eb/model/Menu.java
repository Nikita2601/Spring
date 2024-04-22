package com.eb.model;

public class Menu {
 private int menuid;
 private String Menu_name;
 private int prise;
 private int quantity;
 private int TotalBill;
public int getTotalBill() {
	return TotalBill;
}
public void setTotalBill(int totalBill) {
	TotalBill = totalBill;
}
public int getMenuid() {
	return menuid;
}
public void setMenuid(int menuid) {
	this.menuid = menuid;
}
public String getMenu_name() {
	return Menu_name;
}
public void setMenu_name(String menu_name) {
	Menu_name = menu_name;
}
public int getPrise() {
	return prise;
}
public void setPrise(int prise) {
	this.prise = prise;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
}
