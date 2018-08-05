package com.ratan;

public class Test
{//instance variable
	int a=10;
	int b=20;
	//ststic variable 
	static int c=30;
	static int d=40;
	public void m1()//instance method
	
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(Test.c);
		System.out.println(Test.d);
	}
	public static void m2()//static method
	{
		Test t = new Test();
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(Test.c);
		System.out.println(Test.d);
	}

	public static void main(String[] args)
	{
		Test t = new Test();
		t.m1();
		Test.m2();

	}

}
