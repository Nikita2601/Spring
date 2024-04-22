package com.eb.model;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
@Entity
@Table(name="Products")
public class Product {

	@Id
	@GeneratedValue(generator="foreigngen")
	@GenericGenerator(strategy="foreign",name="foreigngen",parameters=@Parameter(name="property",value="customer"))
	
	private int id;
	
	@Column(name="productName")
	private String pname;
	
	@Column(name="productQuantity")
	private int qty;
	
	@Column(name="ProductPrise")
	private int prise;
	
	@OneToOne(mappedBy="product")
	private Customer customer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getPrise() {
		return prise;
	}

	public void setPrise(int prise) {
		this.prise = prise;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
