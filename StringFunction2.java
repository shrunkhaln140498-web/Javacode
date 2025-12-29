package Javabasics;

public class StringFunction2 
{
	public static void main(String[] args)
	{
		String a="   Shrunkhal    Ajay Meshram  ";
		System.out.println(a);
		System.out.println(a.trim());
		
		String b="Shrunkhal Ajay Mesharm";
		System.out.println(b.substring(7));
		System.out.println(b.substring(13));
		
		System.out.println(b.substring(7,10));
		System.out.println(b.substring(0,10));
		
		System.out.println(b.contains("school"));
		
		System.out.println(b.replace("Ajay", "Suresh"));
		
		String c="School";
		System.out.println(c.replace('h', 'H'));
	}

}
