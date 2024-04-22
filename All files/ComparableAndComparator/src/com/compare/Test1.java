package com.compare;

import java.util.ArrayList;
import java.util.Collections;

public class Test1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Movie>list=new ArrayList<Movie>();
list.add(new Movie(8.3,"RRR",2022));
list.add(new Movie(3.8,"Jawan",2023));
list.add(new Movie(5.3,"Pathan",2024));
list.add(new Movie(6.8,"Aai",2022));
Collections.sort(list);
System.out.println("Data after sorting");
for(Movie movie:list) {
	System.out.println(movie.getRating()+" "+movie.getName()+" "+movie.getYear());
}
ArrayList<Product>list1=new ArrayList<Product>();
list1.add(new Product(101,"speackers",3.5));
list1.add(new Product(105,"slipper",2.5));
list1.add(new Product(102,"kurta",6.5));
list1.add(new Product(104,"caps",4.5));
list1.add(new Product(103,"headphone",9.5));
ProductRatings pr=new ProductRatings();
Collections.sort(list1,pr);
for(Product p:list1) {
System.out.println(p.getPid()+" "+p.getPname()+" "+p.getPrating());
	}
ArrayList<Product>list2=new ArrayList<Product>();
list2.add(new Product(10,"speackers",3.0));
list2.add(new Product(15,"iphone",2.5));
list2.add(new Product(102,"vivo",7.5));
list2.add(new Product(104,"oppo",4.5));
list2.add(new Product(103,"headphone",9.5));
ProductName p2=new ProductName();
Collections.sort(list2,p2);
for(Product ls:list2) {
	System.out.println(ls.getPid()+" "+ls.getPname()+" "+ls.getPrating());
	
}
	}
}
