
 class Class_Basics {
	 
	static int a=1000;
	int b;
	int c=10;
	
	Class_Basics(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		System.out.println("Hi"+a+b+c);
		System.out.println(a+b+c+"Hello");
		System.out.println(a+b+"OKKK"+c);

	}
	void print()
	{
		System.out.println(a);
	}
}
 
class Learn
{
	int length;
	int breadth;
	public int area()
	{
		return length*breadth;
	}
}
class Test
{
	
	public static void main(String args[])
	{
		Class_Basics cb=new Class_Basics(10,20,30);
		
		//System.out.println(cb.a);
		cb.print();
		System.out.println(Class_Basics.a);
		System.out.println(cb.b);
		System.out.println(cb.c);
		
		Learn l=new Learn();
		System.out.println(l.getClass());
		System.out.println("Initial length"+l.length);
		l.length=10;
		l.breadth=20;
		System.out.println("Final Area"+l.area());
	}
}