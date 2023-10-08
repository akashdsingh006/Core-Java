package com.interfaceInJava;


interface a{
	void m1();
	default void m2()
	{
		System.out.println("M2");
	}
	static void m3()
	{
		System.out.println("M3");
	}
	void m4();
}

interface b
{
	void m5();
	void m6();
	abstract void m7();
}

class Outputs implements a,b
{
	public void m1()
	{
		System.out.println("Outputs -- M1");
	}
	public void m5()
	{
		System.out.println("Outputs -- M5");
	}
	public void m6()
	{
		System.out.println("Outputs -- M6");

	}
	
	@Override
	
	public void m2()
	{
		System.out.println("Overriden data m2");
		a.super.m2();
	}
}
public class InterFace_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outputs o=new Outputs();
		o.m1();
		o.m2();
		o.m5();
		o.m6();
		a.m3();
		
		
	}

}
