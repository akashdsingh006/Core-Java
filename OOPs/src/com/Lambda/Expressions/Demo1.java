package com.Lambda.Expressions;

interface MyLambda
{
	void display();
}


class UserLambda 
{
	public void callLambda(MyLambda m)
	{
		m.display();
	}
}


public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserLambda ul=new UserLambda();
		ul.callLambda(()->{System.out.println("Hello Lambda Expression");});
	}

}
