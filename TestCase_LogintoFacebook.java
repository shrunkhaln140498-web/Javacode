package Javabasics;

public class TestCase_LogintoFacebook 
{
	TestCase_LogintoFacebook (int a)
	{
		System.out.println("Constructor 1");
	}
	TestCase_LogintoFacebook (double a)
	{
		this(5);
		System.out.println("Constructor 2");
	}
	TestCase_LogintoFacebook (char a)
	{
		this(96.36);
		System.out.println("Constructor 3");
	}
	TestCase_LogintoFacebook ()
	{
		this('a');
		System.out.println("Constructor 4");
	}
	
	public static void main(String[]args)
	{
		new TestCase_LogintoFacebook ();
	}

}
