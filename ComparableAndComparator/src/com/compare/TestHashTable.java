package com.compare;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class TestHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Hashtable<Integer,HashTable1>l1=new Hashtable<Integer,HashTable1>();
		HashTable1 x1=new HashTable1(101,"c++","bajarne strousstruo",500);
		HashTable1 x2=new HashTable1(102,"c","neha",800);
		HashTable1 x3=new HashTable1(103,"java","bill jameys",505);
		l1.put(101, x1);
		l1.put(102, x2);
		l1.put(103, x3);
		for(Map.Entry<Integer,HashTable1>book:l1.entrySet() ) {
				int key=book.getKey();
				HashTable1 b=book.getValue();
				System.out.println("Book Details are:");
				System.out.println("=======================================");
				System.out.println("Book Id:"+b.getBookid()+" \n Book Auther "+b.getBookAuther()+" \n Book Name "+b.getBookname()+" \n Book Prise "+b.getBookprise());
		}
		
	}

}
