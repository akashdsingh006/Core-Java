package com.inheritence;

class MySchool
{
	void className()
	{
		System.out.println("This is class 9");
	}
	void blackBoard()
	{
		System.out.println("This is blacboard of class 9");
	}
}

class MyClass extends MySchool
{
	void className()
	{
		System.out.println("This is my class");
	}
	void bench()
	{
		System.out.println("This is my bench");
	}
}
public class Dynamic_Data_Dispatch {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		MySchool ms=new MyClass();
		ms.className();
		//ms.bench(); -> Cannot call this method as it is not present in MySchool class
	}

}
