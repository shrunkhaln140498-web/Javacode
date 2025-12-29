package Javabasics;

import java.util.Enumeration;
import java.util.Vector;

public class LegacyProgramme 
{
public static void main(String[] args)
{
	Vector v1=new Vector();

	v1.add(41);
	v1.add(31);
	v1.add(21);
	v1.add(11);
	System.out.println(v1);
	
	Enumeration e1= v1.elements();
	System.out.println("Forward Interation using Enumeration");
	while(e1.hasMoreElements())
	{
		System.out.println(e1.nextElement());
	}
}
}
