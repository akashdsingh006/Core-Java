package com.innerClasses;

class Outer
{
	 int x=10;
	class Inner
	{
		int y=20;
		void display()
		{
			System.out.println(x);
			System.out.println(y);
		}
	}
	
	void show()
	{
		Inner i=new Inner();
		i.display();
	}
}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o=new Outer();
		//o.show();
		System.out.println("Variable x="+o.x);
		
		Outer.Inner i=new Outer().new Inner();
		System.out.println(i.y);
		i.display();
		
	}

}
