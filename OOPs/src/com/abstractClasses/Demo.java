package com.abstractClasses;

abstract class User
{
	void name()
	{
		System.out.println("This is my Name");
	}
	abstract void age();
	abstract void roll();
	
}

class Data extends User
{
	void name()
	{
		System.out.println("My name is Akash");
	}
	void age()
	{
		System.out.println(10);
	}
	void roll()
	{
		System.out.println(23);
	}
	int marks()
	{
		return 99;
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data us=new Data();
		us.name();// over-riding
		us.age();
		us.roll();
		
		System.out.println(us.marks());
	}

}
