package Javabasics;

public class AccessSpecifierCase1 
{
	public static void add()
	{
		System.out.println("Addition");
	}
	protected static void sub()
	{
		System.out.println("Addition");
	}
	static void mul()
	{
		System.out.println("Addition");
	}
	private static void div()
	{
		System.out.println("Addition");
	}
	public static void main(String[] args)
	{
		add();
		sub();
		mul();
		div();
	}

}
