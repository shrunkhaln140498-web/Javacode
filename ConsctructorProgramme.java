package Javabasics;

public class ConsctructorProgramme 
{
	ConsctructorProgramme () // this is constructor, yes it is non static
	{
		System.out.println("This is constructor 1");
	}
	ConsctructorProgramme (int a ) // this is constructor, yes it is non static
	{
		System.out.println("This is constructor 2");
	}
	ConsctructorProgramme (int a , double b) // this is constructor, yes it is non static
	{
		System.out.println("This is constructor 3");
	}
	ConsctructorProgramme (double b,int a) // this is constructor, yes it is non static
	{
		System.out.println("This is constructor 4");
	}
	
	public static void main(String[] args)
	{
		/*
		new ConsctructorProgramme();
		new ConsctructorProgramme(5000);
		new ConsctructorProgramme(4000, 99.99);
		new ConsctructorProgramme(85.74,3000);
		*/
		ConsctructorProgramme c1=new ConsctructorProgramme();
		ConsctructorProgramme c2=new ConsctructorProgramme(5000);
		ConsctructorProgramme c3=new ConsctructorProgramme(4000, 99.99);
		ConsctructorProgramme c4=new ConsctructorProgramme(85.74,3000);
		
		
	}

}
