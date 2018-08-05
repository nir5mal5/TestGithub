package com.ratan;

public class VariableEx 
{//instance variable
	int a=10;
	int b=20;
	static void m1()
	{
		VariableEx v=new VariableEx();
		System.out.println(v.a);
		System.out.println(v.b);
	}//method completed object destroyed.
	static void m2()
	{
		VariableEx x =new VariableEx();
		System.out.println(x.a);
		System.out.println(x.b);
		
		
		
	}
	

	public static void main(String[] args)
	{
		VariableEx.m1();
		VariableEx.m2();
	}

}
