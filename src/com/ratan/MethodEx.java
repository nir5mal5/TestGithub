package com.ratan;
class XYZ{}
class Emp{}
class ABC{}
class Student{}
public class MethodEx 
{
 public void m1(XYZ x,Emp e, Emp z)
 {
	System.out.println("method one"); 
 }
 public static void m3(ABC a)
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
		Student s1=new Student();
		MethodEx.m2(a);
		MethodEx.m2(new ABC(),new Student()); 
	}

}
