package com.Lambda.Expressions;


interface MyLam
{
	void display(String s);
}
public class Lambda {
	static void reverse(String s)
	{
		StringBuffer str=new StringBuffer(s);
		str.reverse();
		System.out.println(str);
	}
	
	void rev(String s)
	{
		StringBuilder str=new StringBuilder(s);
		str.reverse();
		System.out.println(str);
	}
	public static void main(String[] args) {
		
		MyLam m= System.out::println;
		m.display("Hello");
		
		MyLam m1=Lambda::reverse;
		m1.display("Akash -----");
		
		Lambda ld=new Lambda();
		MyLam m2=ld::rev;
		m2.display("World ------------");
		
		
	}

}
