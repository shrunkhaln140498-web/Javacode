package Javabasics;

public class StringFunction3 
{
	public static void main(String[] args)
	{
		String a="Shrunkhal Ajay Meshram";
		
		System.out.println(a.replaceAll("[a-z]", ""));
		
		System.out.println(a.replaceAll("[A-Z]", ""));
		
		String b="Shrunkhal 8";
		System.out.println(b.replaceAll("[0-9]", ""));
		
		int size= a.length();
		System.out.println(size);		
	}

}
