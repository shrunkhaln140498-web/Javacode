package Javabasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListProgramme4 
{
	

	public static void main (String[] args)
	{
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(1478);
		a1.add(3698);
		a1.add(8521);
		a1.add(4563);
		a1.add(8741);
		System.out.println(a1);
		a1.add(0,5000);
		System.out.println(a1);
		
		Collections.sort(a1);
		System.out.println(a1);
		
}
}