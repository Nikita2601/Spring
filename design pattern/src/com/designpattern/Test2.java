package com.designpattern;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		selectNetworkPlan s2=new selectNetworkPlan();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the network for which u want generate bill");
		String networkName=sc.next();
		System.out.println("enter the number of minute:");
		int min=sc.nextInt();
	CellularPlan p=s2.getPlan(networkName);
	System.out.println("BIll Amount for"+networkName+"of"+min);
	p.getRate();
	p.processBill(min);
	}

}
