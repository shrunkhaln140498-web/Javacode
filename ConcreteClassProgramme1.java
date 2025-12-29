package Javabasics;
abstract class AbstractClass1
{
	abstract void one();
	abstract void two();
}
abstract class AbstractClass2 extends AbstractClass1
{
	abstract void three();
	abstract void four ();
}

public class ConcreteClassProgramme1 extends AbstractClass2
{

	
	void three() 
	{
		
		System.out.println("Login is hidden 1");
	}

	
	void four() 
	{
		System.out.println("Login is hidden 2");
		
	}

	
	void one() 
	{
		System.out.println("Login is hidden 3");
		
	}

	
	void two() 
	{
		System.out.println("Login is hidden 4");
		
	}
	
}
