package Javabasics;

public class StringFunction5 
{
	public static void main(String[] args)
	{
		String input="madam";
		String reverse="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			reverse=reverse+c1;
		}
		System.out.println(reverse);
		
		if(input.equals(reverse))
		{
			System.out.println("The given string is Palindrome");
		}
		else
		{
			System.out.println(" Not a Palindrome");
		}
		
		

}
}
