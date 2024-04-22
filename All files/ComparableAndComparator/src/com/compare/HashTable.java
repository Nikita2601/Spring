package com.compare;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hashtable<Integer,String>ht=new Hashtable<Integer,String>();
ht.put(35, "vijay");
ht.put(56, "neha");
ht.put(45, "ayush");
ht.put(26, "sujay");
System.out.println(ht);
for(Map.Entry m:ht.entrySet()) {
	System.out.println(m.getKey()+" "+m.getValue());
}
	}

}
