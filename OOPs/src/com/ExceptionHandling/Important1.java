package com.ExceptionHandling;

public class Important1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		meth1();
	}
	public static void meth1()
	{
		try {
			int ans=area(-10,5);
			System.out.println(ans);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static int area(int l,int b) throws Exception
	{
		if(l<0 || b<0)
			throw new Exception("Negative Value not Possible");
		
		int a=l*b;
		return a;
	}
}
