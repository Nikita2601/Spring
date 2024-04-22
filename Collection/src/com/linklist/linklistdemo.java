package com.linklist;

import java.util.LinkedList;

public class linklistdemo {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String>l1=new LinkedList<>();
		
		l1.add("Red");

		l1.add("white");
		l1.add("white");
		
		System.out.println(l1);
		
		l1.addFirst("Golden");
		l1.addLast("perl");
		l1.add(2, "gray");
		System.out.println(l1);
		l1.set(3, "burgundy");
		System.out.println(l1);
		LinkedList<String>l2=new LinkedList<>();
		l2.add("apple");
		l2.add("mango");
		l2.add("stobery");
		l1.addAll( l2);
		System.out.println(l1);
		//bysdefaul remove 1st element
		l1.remove();
		System.out.println(l1);
		l1.removeFirst();	
		System.out.println(l1);
		l1.removeLast();
		System.out.println(l1);
		l1.remove(2);
		System.out.println(l1);
		l1.add("gray");
		l1.add("gray");
		System.out.println(l1);
		l1.removeFirstOccurrence("gray");
		System.out.println(l1);
		l1.removeLastOccurrence("gray");
		System.out.println(l1);
	}


	}


