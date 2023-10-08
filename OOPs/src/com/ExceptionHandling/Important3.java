package com.ExceptionHandling;


public class Important3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		meth1(10,0);
	}
	
	public static void meth1(int a, int b)throws ArithmeticException {
	    try {
	        if (b == 0) {
	            throw new ArithmeticException("Divide by zero");
	        }
	        System.out.println(a / b);
	    } catch (ArithmeticException e) {
	        // Handle the exception or perform error recovery actions
	        System.out.println("An error occured "+ e);
	    }
	}

}
