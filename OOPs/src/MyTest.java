
class Parent
{
	Parent()
	{
		System.out.println("I am parent");
	}
}
class Child extends Parent
{
	Child()
	{
		//this(10);
		System.out.println("I am Child");
	}
	Child(int a)
	{
		this();
		System.out.println("I am child with param");
	}
}
class GrandChildren extends Child
{
	GrandChildren()
	{
		super(1);
		
		System.out.println("I am grand child");
	}
	void method()
	{
		//this();
	
	}
}

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GrandChildren gc=new GrandChildren();
	}

}
