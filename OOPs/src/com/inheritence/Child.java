package com.inheritence;

class c1
{
	c1()
	{
		System.out.println("C1 constructor");
	}
}
class c2 extends c1
{
	c2()
	{
		System.out.println("C2 constructor");
	}
}
class c3 extends c2
{
	c3()
	{
		System.out.println("C3 constructor");
	}
}
public class Child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c1 ob=new c2();
		
	}

}
