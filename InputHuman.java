package Javabasics;

import java.util.Scanner;

public class InputHuman 
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name= s1.next();
		System.out.println("Please enter the byte no");
		byte b1= s1.nextByte();
		System.out.println("Please enter short");
		short s2=  s1.nextShort();
		System.out.println("Please enter double number");
		double b2=  s1.nextDouble();
		System.out.println("Please enter float number");
		float f1=  s1.nextFloat();
		
		s1.close();
		
		
		
		
		
		
	}

}
