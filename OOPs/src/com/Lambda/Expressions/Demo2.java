package com.Lambda.Expressions;

interface MyInterface
{
	void display();
}

class Test {
    int num = 10;

    void meth1() {
        int count = 15;
        MyInterface m = () -> {
        	num++;
            System.out.println("Instance Var= " + num);
            System.out.println("Local Var= " + count);
            
            
        };
        m.display();
    }
}


public class Demo2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.meth1();
	}
}
