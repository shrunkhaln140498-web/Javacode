package Javabasics;

public class StringFunction8 
{
	static int countofalpha=0;
	static int countofspace=0;
	static int countofnumeric=0;

	

public static void main (String[] args)
{
		String input="manish &^%$   1234567";
	System.out.println("Inout is ->"+input);
	for(int i=0;i<=input.length()-1;i++)
	{
	boolean b1=	Character.isAlphabetic(input.charAt(i));
	boolean b2= Character.isWhitespace(input.charAt(i));
	boolean b3=	Character.isDigit(input.charAt(i));
	
	
			if(b1==true)
			{
				countofalpha++;
			}
			if(b2==true)
			{
				countofspace++;
			}
			if(b3==true)
			{
				countofnumeric++;
			}
			
			
	}
	System.out.println("The number of alphabets in the given String is -> "+countofalpha);
	System.out.println("The number of spaces in the given String is -> "+countofspace);
	System.out.println("The number of numeric in the given String is -> "+countofnumeric);
	int countofspecialchacters=input.length()-(countofalpha+countofspace+countofnumeric);
	System.out.println("The number of special characters in the given String is -> "+countofspecialchacters);
		
								
}}
