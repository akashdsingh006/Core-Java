package com.ExceptionHandling;


public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {10,0,5,3,7};
		try {
			
			try {
				System.out.println(A[10]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e.toString());
				
			}
			
			int a=A[0]/A[1];
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("Hello exception");
		}
		
	}

}
