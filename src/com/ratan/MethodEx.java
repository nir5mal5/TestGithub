package com.ratan;
class XYZ{}
class Emp{}
class ABC{}
class Student{}
public class MethodEx 
{
 public void m1(XYZ x,Emp e)
 {
	System.out.println("method one"); 
 }
 public static void m2(ABC a,Student s)
 {
	 System.out.println("method two");
 }
	public static void main(String[] args)
	{
		MethodEx m=new MethodEx ();
		XYZ x=new XYZ();
		Emp e=new Emp();
		//m.m1(newXYZ(),new EMP());
		
		m.m1(x, e);
		ABC a=new ABC();
		Student s=new Student();
		MethodEx.m2(a, s);
		MethodEx.m2(new ABC(),new Student()); 
	}

}
