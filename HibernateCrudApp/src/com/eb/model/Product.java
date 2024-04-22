package com.eb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product  {
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", quantity=" + quantity + ", prise=" + prise + "]";
	}

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pid;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String pname, int quantity, int prise) {
		super();
		this.pname = pname;
		this.quantity = quantity;
		this.prise = prise;
	}

	@Column(name = "pname")
	private String pname;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "prise")
	private int prise;

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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrise() {
		return prise;
	}

	public void setPrise(int prise) {
		this.prise = prise;
	}
	
	
}
	