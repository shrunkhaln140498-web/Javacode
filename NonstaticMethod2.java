package Javabasics;

public class NonstaticMethod2
{
	void add()
	{
		System.out.println("Addition");
	}
	public static void main(String[] args)
	{
		//step1
		NonstaticMethod2 n1=new NonstaticMethod2(); //this is how we create object
		
		//step2
		n1.add(); //calling its non static method
	}

}
