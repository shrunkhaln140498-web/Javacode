package Javabasics;
abstract class AbstractClass
{
	abstract void add();  //abstract method 1
	abstract void sub();  //abstract method 2
	 void mul()  //concrete method method 1
	 {
		 System.out.println("Exposing the logic 1");
	 }
	 static void div()   //concrete method method 2
	 {
		 System.out.println("Exposing the logic 2");
	 }
}

public class ConcreteClassProgramme extends AbstractClass
{
	static void mod()
	{
		System.out.println("This logic will remain with us");
	}
	public static void main(String[] args)
	{
		
	}

	void add() 
	{
		System.out.println("This logic will remain with us");
	}

	
	void sub() 
	{
		System.out.println("This logic will remain with us");
	}

}
