package Javabasics;

public class ExceptionHandling 
{
	public static void main (String[]args)
	{
	        try 
	        {
			int a=1/1;  //a=b/c where b and c has come from parent and grandparent class
			System.out.println(a);
			}
			catch(ArithmeticException a1)
			{
				System.out.println("Handled The exception");
			}
			finally
			{
				System.out.println("It will always execute");
			}				
}

}
