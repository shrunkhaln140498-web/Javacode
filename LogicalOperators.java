package Javabasics;

public class LogicalOperators 
{
	public static void main(String[] args)
	{
		int age=20;
		char gender='m';
				
				if(age>=18 && gender=='m')
				{
					System.out.println("you can apply this job");
				}
				
				if(!(age>=18 && gender=='m'))
				{
					System.out.println("you can apply this job");
				}
				if(!(age>=10 && gender=='m'))
				{
					System.out.println("you can Not apply this job");
				}
				if(gender=='f' || gender=='m')
				{
					System.out.println("Person can go & vote");
				}
				if(!(gender=='f' || gender=='c'))
				{
					System.out.println("Person can go & vote");
				}
	}

}
