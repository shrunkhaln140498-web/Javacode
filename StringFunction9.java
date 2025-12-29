package Javabasics;

public class StringFunction9 
public static void main(String args[]);
{
	
}
{
	String a="water";
	//check if the given string starts with w
boolean b1=	a.matches("w(.*)");           //SQL like operator
	System.out.println(b1);
	//check if the given string ends with r
boolean b2=			a.matches("(.*)r");
System.out.println(b2);
//check if the given string has 5 letters in it
boolean b3=a.matches(".....");
	System.out.println(b3);
	//check if the given string as ""ate"" in it

	boolean b4=	a.matches("(.*)ate(.*)");
	System.out.println(b4);"	
	}
