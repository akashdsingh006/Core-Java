package com.interfaceInJava;

interface T1
{
	void method1(String str);
	 void method2();
	static void method3()
	{
		System.out.println("I am method 3");
	}
}
interface T2 
{
	void meth4();
	default void meth5()
	{
		System.out.println("I am meth 5");
	}
	default void meth6()
	{
		System.out.println("I am meth 6");
	}
}

class Demo implements T1,T2
{
	public void method1(String str)
	{
		System.out.println("I am implemented method1"+str);
	}

	@Override
	public void meth4() {
		// TODO Auto-generated method stub
		System.out.println("I am implemented meth 4");
	}

	//@Override
//	public void method2() {
//		// TODO Auto-generated method stub
//		System.out.println("I am implemented method2");
//	}
//	public void meth5()
	static void method3()
	{
		System.out.println("Over riden");
	}
}
public class Test 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d=new Demo();
		//T1 t1=d;
		T1.method3();
		d.meth5();
		d.meth4();
		d.method1("Akash Anand");
		
		//d.method2();
		
		d.method3();
		
		
		d.meth6();
		//d.meth5();
	}

}
