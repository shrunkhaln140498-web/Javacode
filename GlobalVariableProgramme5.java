package Javabasics;

public class GlobalVariableProgramme5 
{
	 int days=30; //this is global
	 static double weight=301.9; //this is also global
	
	

public static void main (String[] args)
{
	weight=302.5;
	System.out.println(weight);
	GlobalVariableProgramme5 g1=new GlobalVariableProgramme5();
	System.out.println(g1.days=31);
}
}
