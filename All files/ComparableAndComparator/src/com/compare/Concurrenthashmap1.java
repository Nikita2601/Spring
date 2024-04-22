package com.compare;

import java.util.concurrent.ConcurrentHashMap;

public class Concurrenthashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentHashMap<String,Integer>map=new ConcurrentHashMap<String,Integer>();
		map.put("colorcode", 101);
		map.put("A", 105);
		map.put("B", 107);
		System.out.println(map);
		System.out.println(map.get("A"));
		map.putIfAbsent("C", 110);
		System.out.println(map);
		map.remove("colorcode");
		System.out.println(map);
		map.replace("A", 115);
		System.out.println(map);
	}

}
