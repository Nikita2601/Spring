package com.designpattern;

public class selectNetworkPlan {
 public CellularPlan getPlan(String PlanType) {
	 if(PlanType==null) {
		 return null;
	 }
	 if(PlanType.equalsIgnoreCase("abcNetwork")) {
		 return new abcNetwork();
	 }
	 else if(PlanType.equalsIgnoreCase("xyzNetwork")) {
		 return new xyzNetwork();
	 }
	 return null;
 }
}
