package com.Arrylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylistdemo {

	public static void main(String[] args) {
		
		ArrayList<Integer>a1=new ArrayList<>();
		
		a1.add(20);
		a1.add(10);
		a1.add(5);
		a1.add(30);
		System.out.println(a1);
		//sort data
		
		Collections.sort(a1);
		System.out.println(a1);
		System.out.println("find out index no of value 20:"+a1.indexOf(20));//index no
		System.out.println("find out value from index no 1:"+a1.get(1));//value
		ArrayList<Integer>a2=new ArrayList<>();
		a2.add(100);
		a2.add(50);
		a2.add(69);
		a2.add(49);
		a1.addAll(a2);
		System.out.println(a1);
		a1.add(100);
		System.out.println(a1);
		
		//for loop
		System.out.println("Using  for loop");
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		System.out.println("Using Advance for loop");
		//advance for loop
		for(Integer j:a1) {
			System.out.println(j);
		}
		//using Iterator class
		System.out.println("Using Iterator class");
		Iterator<Integer>i1=a1.iterator();
		
		while(i1.hasNext()) {
			 System.out.println(i1.next());
		}
		a1.remove(2);
		System.out.println(a1);
		a1.removeAll(a2);
		System.out.println(a1);
		a1.clear();
		System.out.println(a1);
		if(a1.isEmpty()) {
			System.out.println("Array is Empty");
		}
		else {
			System.out.println(a1);
		}
		a1.add(1000);
		if(a1.isEmpty()) {
			System.out.println("Array is Empty");
		}
		else {
			System.out.println(a1);
		}
	}

}
