package Javabasics;

public class StringFunction6 
{
	static int countofalpha=13;
	private static boolean b1;
	public static void main(String[] args)
	{
		String input="K v no 2  Banglore";
		int size= input.length();
		System.out.println(size);
		
		for(int i=0;i<=input.length()-1;i++)
		{
			boolean b1=Character.isAlphabetic(input.charAt(i));
			System.out.println(b1);
		}
		
		if(b1==true)
		{
			countofalpha++;
		}

	System.out.println("The number of alphabet in the given string is ->"+countofalpha);
}}
