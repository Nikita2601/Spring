package com.eb.main;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.eb.dao.ProductDao;
import com.eb.model.Product;


public class App {

	public static void main(String[] args) {
		

		System.out.println("*******Welcome to Product Management System******");
      Scanner sc=new Scanner(System.in);
      
      int choice=0;
      do {
    	  System.out.println("press 1-Add Product"); 
    	  System.out.println("press 2-Read All Product Details");
    	  System.out.println("press 3-Update Product");
    	  System.out.println("press 4-Delete  Product");
    	  System.out.println("press 5-Read Product Id wise");
    	  System.out.println("press 6-Exit");
    	  System.out.println("Enter your choice");
    	  choice=sc.nextInt();
    	  ProductDao dao=new ProductDao();
    	  Product pp=new Product();
    	  switch(choice) {
    	  case 1:
    		  //Product(String pname, int quantity, int prise)
    		  System.out.println("Enter product name:");
    		  String pname=sc.next();
    		  System.out.println("Enter product quantity:");
    		  int qty=sc.nextInt();
    		  System.out.println("Enter product prise:");
    		  int prise=sc.nextInt();
    		  Product p=new Product(pname,qty,prise);
    		  dao.insert(p);
    		  System.out.println("product added successfully");
    		  break;
    	  case 2:
    		System.out.println("Product details are:");
    		  List<Product> productList = dao.getProductList();
    			for (Product pp1 : productList) {
    				System.out.println(pp1.getPname());
    				System.out.println(pp1.getPrise());
    				System.out.println(pp1.getQuantity());
    				
    			}
    		  break;
    	  case 3:
    		  System.out.println("Enter id which u want update:");
    		  
    		  int id=sc.nextInt();
    		  Product product=dao.getProductById(id);
    	
    		  System.out.println("Enter which product name u want update");
    		  pname=sc.next();
    		 
	        		product.setPname(pname);
    		  System.out.println("Enter which product prise u want update");
    		  prise=sc.nextInt();
    		  
	        		product.setPrise(prise);
    		  
    		  System.out.println("Enter which product quantity u want update");
    		  qty=sc.nextInt();
    		
	        		product.setQuantity(qty);
    		dao.updateProduct(product);
    		 System.out.println("record updated successfully");
    		 break;
    	  case 4:
    		  System.out.println("Enter which id u want delete:");
    		  id=sc.nextInt();
    		  dao.deleteProduct(id);
    		  System.out.println("Id deleted successfully");
    	  case 5:
    		  System.out.println("Enter which id u want read:");
    		  id=sc.nextInt();
    		  System.out.println(dao.getProductById(id));
    	  break;
    	  case 6:
    		  System.out.println("Bye Bye Shop is closed");
    		 break;
    		 default:
    			 System.out.println("wrong choice");
    	  }	  
      }while(choice!=6);
      
	
	}

}
