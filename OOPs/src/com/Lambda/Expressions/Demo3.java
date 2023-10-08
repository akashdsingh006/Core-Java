package com.Lambda.Expressions;

@FunctionalInterface
interface Data
{
	String getData(int i);
}
public class Demo3 {
	
	static int t=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k=0;
		Data d=(i)->{
			if(i%2==0 && i!=0)
				return "Even";
			else if(i%2!=0)
				return "Odd";
			//k++;
			t++;
			return "Zero"+t;
		};
		
		System.out.println(d.getData(0));
	}

}
