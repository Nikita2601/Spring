package com.designpattern;
class BOI implements Plan{
	public void getroi(double rate) {
		System.out.println("the rate of intrest:"+rate+"%");
	}
}
class SBI implements Plan{
	public void getroi(double rate) {
		System.out.println("the rate of intrest for SBI:"+rate+"%");
	}
}
class BOB implements Plan{
	public void getroi(double rate) {
		System.out.println("the rate of intrest for BOB:"+rate+"%");
	}
}

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOI b1=new BOI();
		b1.getroi(8.2);
		SBI s1=new SBI();
		s1.getroi(7.2);
		BOB b2=new BOB();
		b2.getroi(6.2);
	}

}
