package com.inheritence;

class Circle
{
	private double radius;
	Circle()
	{
		radius=0.0;
	}
	Circle(double r)
	{
		radius=r;
	}
	double area()
	{
		return (3.14)*radius*radius;
	}
}

class Cylinder extends Circle
{
	private double height;
	Cylinder(double h)
	{
		height=h;
	}
	double volume()
	{
		double a=5;
		return (3.14)*height*a*a;
	}
}
public class Basic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cylinder c1=new Cylinder(10);
		
		System.out.println(c1.volume());
	}

}
