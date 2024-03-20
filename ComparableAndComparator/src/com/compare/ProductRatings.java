package com.compare;

import java.util.Comparator;

public class ProductRatings implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if(o1.getPrating()<o2.getPrating()) {
			return -1;
		}
		else if(o1.getPrating()>o2.getPrating()) {
			return 1;
		}
		else {
			return 0;
		}
		 
	}
	

}
