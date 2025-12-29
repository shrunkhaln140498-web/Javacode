package Javabasics;

public class GoogleProgramme extends GoogleAuth
{
	static void mul()
	{
		System.out.println("Multiply");
	}
	void div()
	{
		System.out.println("Division");
	}
	public static void main(String[] args)
	{
		add();
		mul();
		GoogleProgramme g1=new GoogleProgramme();
		g1.div();
		g1.sub();
		
	}

}
