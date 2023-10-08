package com.inheritence;

class Big
{
	void meth1()
	{
		System.out.println("I am Bigger Method 1");
	}
	void meth2(int a)
	{
		System.out.println("I am Bigger Meth 2---"+ a);
	}
}

class Small extends Big
{
	void meth3()
	{
		System.out.println("I am Small method 3");
	}
	void meth2()
	{
		System.out.println("I am Small Method 2");
	}
	void meth2(int k)
	{
		System.out.println("I am Small Method 2 with var"+ k*k*k);
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Small b=new Small();
		b.meth1();
		b.meth2(10);
		b.meth3();
	}

}
