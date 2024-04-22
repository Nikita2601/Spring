package com.compare;

import java.util.Comparator;

public class ProductName implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getPname().compareTo(o2.getPname());
	}
	

}
