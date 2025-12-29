package Javabasics;

public class TypeCasting 
{
	/*
	""1. COnvert byte into int
	2. COnvert int into double
	3. COnvert double into int""
	*/
	
	public static void main(String[] args) 
	{
//		Problem 1:
			byte a=10;
				int b=a; //implicit syntax of Widening
				System.out.println(b);
				int b1=(int)a; //Explicit syntax of Widening
				System.out.println(b1);
				
		//		2. COnvert int into double
					int c=100;
					double d=c;
					System.out.println(d);//implicit syntax of Widening
				
					double d1=(double)c;
					System.out.println(d1);//Explicit syntax of Widening
				
				//	3. COnvert double into int""
					double pi=3.94;
					int pinewvalue=(int) pi;
					System.out.println(pinewvalue);
					
					
					
		
	}
	}
	


