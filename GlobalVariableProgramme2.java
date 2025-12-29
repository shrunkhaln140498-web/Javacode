package Javabasics;

public class GlobalVariableProgramme2 
{
	static int a=10; //this is global variable
	static int b=20; //this is global variable
	static void add()
	{
		int sum=a+b; //this is local variable
		System.out.println(sum);
	}
	static void sub()
	{
		int c=a-b; //this is local variable
		System.out.println(c);
	}
	static void mul()
	{
		int c=a*b; //this is local variable
		System.out.println(c);
	}
	static void div()
	{
		int c=a/b; //this is local variable
		System.out.println(c);
	}

public static void main (String[] args)
{
	add();
	sub();
	mul();
	div();
	
	
}
}
