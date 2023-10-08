package com.innerClasses;

abstract class My
{
	abstract void display();
}

interface A
{
	void get(String a);
}

interface B
{
	String getData();
}
public class Anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		My m=new My()
		{
			void display()
			{
				System.out.println("Hello Java World");
			}
		};
		
		m.display();
		
		A data= i ->{
			System.out.println("Akash Anand is good boy " +i);
		};
		data.get("Punku");
		
		B b=()->{
			return "India is my Country";
		};
		
		System.out.println(b.getData());
	}

}
