package com.menu.entity;

public class Menu {

	private int id;
	
	private String menuName;
	
	private int prise;
	
	private int quantity;

	@Override
	public String toString() {
		return "Menu [id=" + id + ", menuName=" + menuName + ", prise=" + prise + ", quantity=" + quantity + "]";
	}



	public Menu( String menuName, int prise, int quantity) {
		super();
	
		this.menuName = menuName;
		this.prise = prise;
		this.quantity = quantity;
	}



	public Menu(int id, String menuName, int prise, int quantity) {
		super();
		this.id = id;
		this.menuName = menuName;
		this.prise = prise;
		this.quantity = quantity;
	}



	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
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
