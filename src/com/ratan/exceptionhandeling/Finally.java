package com.ratan.exceptionhandeling;

public class Finally {
public static void main(String[]args)
{
	//System.out.println(10/0);
	//if controll doesnt enter in try block finally block doesent execute
	try
	{
		//2nd case finally block not execute
		//System.exit(0);
		System.out.println("try");
	}
	catch(ArithmeticException ae)
	{
		System.out.println("catch");
	}
	finally
	{
		System.out.println("finally");
	}
}
}
