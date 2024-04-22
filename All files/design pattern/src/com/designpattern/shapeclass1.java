package com.designpattern;
class circle implements shape{
	public void getshape(String shape) {
		System.out.println("the shape is :"+shape);
	}
}
class square implements shape{
	public void getshape(String shape) {
		System.out.println("the shape is :"+shape);
	}
}
class triangle implements shape{
	public void getshape(String shape) {
		System.out.println("the shape is :"+shape);
	}
}
public class shapeclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c1=new circle();
		c1.getshape("circle");
		square s1= new square();
		s1.getshape("square");
		triangle t1=new triangle();
		t1.getshape("triangle");
	}

}
