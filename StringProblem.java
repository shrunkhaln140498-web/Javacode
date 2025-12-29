package Javabasics;

public class StringProblem 
{

	

	public static void main(String[] args) 
	{
		String a="ram";//string pool area
		String b="ram";//string pool area
	/*	boolean b1=		a.equals(""ram"");
				System.out.println(b1);
				if(a==b)
				{
					System.out.println(""Equal"");
				}
				else
				{
					System.out.println(""Not Equal"");
				}*/
		String a1=new String("ram");//heap momory
		boolean b2=	a.equals(a1);
			System.out.println(b2);
			if(a==a1)
			{
				System.out.println("Equal");
			}
			else
			{
				System.out.println("Not Equal");
			}
			
		
		
		
	}
	
	
}
