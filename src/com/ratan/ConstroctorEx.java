package com.ratan;

public class ConstroctorEx
{
int eid;   //0
String ename; //null
float esal;   //0.0
Object Emp(int eid,String ename,float esal) //local variable
{//conversion of local values to instance values

this.eid =eid;
this.ename =ename;
return this.esal =esal;

}
public void disp()
{
	
	System.out.println("emp id ="+eid);
	System.out.println("emp name ="+ename);
	System.out.println("emp sal ="+esal);
}
	public static void main(String[] args) 
	{
		
		//Emp e1= new Emp(100,"ratan",10000);
		//	e1.disp();
		//Emp e2 = new Emp(105,"durga",12000);
		//	e2.disp();
	}

}
