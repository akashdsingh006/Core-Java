package com.ExceptionHandling;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		int c;
		try {
			c=a/2;
			System.out.println(c);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally {
			System.out.println("Kya re popde");
		}
	}

}
