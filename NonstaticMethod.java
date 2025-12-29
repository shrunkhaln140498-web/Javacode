package Javabasics;

public class NonstaticMethod
{
	void add(int a)
	{
		int sum=a+10;
		System.out.println(sum);
	}
	void add()
	{
		int a=100;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	static void sub()
	{
		int a=100;
		int b=20;
		int subtraction=a-b;
		System.out.println(subtraction);
	}
	static void sub(int a)
	{
		int b=20;
		int suntraction=a-b;
		System.out.println(suntraction);
	}
	
	public static void main(String[] args)
	{
		sub();
		sub(200);
		NonstaticMethod n1=new NonstaticMethod(); //this is how we create an object
		n1.add();//this is how we call its non static method
		n1.add(100);
	}

}
