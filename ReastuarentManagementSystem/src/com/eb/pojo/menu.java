package com.eb.pojo;

public class menu {
  
  private String menuName;
  private String menuType;
  public menu() {
	super();
	// TODO Auto-generated constructor stub
}
public menu( String menuName, String menuType, int prise, int quantity) {
	super();
	
	this.menuName = menuName;
	this.menuType = menuType;
	this.prise = prise;
	this.quantity = quantity;
}
@Override
public String toString() {
	return "menu [menuid=  menuName=" + menuName + ", menuType=" + menuType + ", prise=" + prise
			+ ", quantity=" + quantity + "]";
}


public String getMenuName() {
	return menuName;
}
public void setMenuName(String menuName) {
	this.menuName = menuName;
}
public String getMenuType() {
	return menuType;
}
public void setMenuType(String menuType) {
	this.menuType = menuType;
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
private int prise;
  private int quantity;
}
