package Javabasics;

public class GlobalVariableProgramme3 
{
	 static int days;
	  double noofdays=365;
	static int a=10; //this is global variable
	static int b=20; //this is global variable
	static void add()
	{
		int sum=a+b; //this is local variable
		System.out.println(sum);
	}
	

public static void main (String[] args)
{
	add();
	System.out.println(a);
	System.out.println(b);
	GlobalVariableProgramme3 g1=new GlobalVariableProgramme3();
	System.out.println(g1.noofdays);
	System.out.println(days);
	
	
}
}
