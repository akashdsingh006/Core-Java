package com.interfaceInJava;

interface A1{
	void meth1();
	void meth2();
}

interface B1 extends A1
{
	 void m3();
}

class Res implements B1
{
	public void meth1()
	{
		System.out.println("Meth1");
	}
		@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("I am m3");
	}
	
}
public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Res r=new Res();
		r.meth1();
		r.m3();
	}

}
