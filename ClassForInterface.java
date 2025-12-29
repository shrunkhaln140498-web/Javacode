package Javabasics;
interface Growtechmindslogic
{
	void mango(); //Abstract Method 1
	void apple(); //Abstract Method 2
}

public class ClassForInterface implements Growtechmindslogic
{
	public static void main(String[] args)
	{
		
	}

	
	public void mango() 
	{
		System.out.println("real logic 1");
		
	}

	
	public void apple() 
	{
		System.out.println("real logic 2");
		
	}

}
