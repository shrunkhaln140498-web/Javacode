package Javabasics;

public class SwitchCaseinJava2
{
	public static void main(String[] args)
	{
		switch(100)
		{
		case 1: System.out.println("Chrome Browser");
		       break;
		case 2: System.out.println("Edge Browser");
	       break;
		case 3: System.out.println("Safari Browser");
	       break;
		case 4: System.out.println("Mozilla Browser");
	       break;
	       
	       default:
	    	      System.out.println("Sorry your browser selection is wrong");
		}
	}

}
