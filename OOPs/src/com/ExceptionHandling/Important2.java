package com.ExceptionHandling;

import java.util.Scanner;

class NegativeNumberErrorException extends Exception
{
	NegativeNumberErrorException(){
		
	}
	
	NegativeNumberErrorException(String s)
	{
		System.out.println("Negative num "+s);
	}
	public String toString()
	{
		return "Negative Number not allowed";
	}
}
public class Important2 {

	public static void main(String[] args) throws NegativeNumberErrorException
	{
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int l=in.nextInt();
		int b=in.nextInt();
		
		if(l<0 || b<0)
		{
			throw new NegativeNumberErrorException("");
		}
		
		int a=l*b;
		System.out.println(a);
	}

}
