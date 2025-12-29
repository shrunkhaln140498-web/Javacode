package Javabasics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListProgramme3 
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
		System.out.println("Forward Iteration using Iterator");
		Iterator<Integer> i1= a1.iterator();
		
		
		while(i1. hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("Forward Iteration using List of Iterator");
	ListIterator<Integer> i2=	a1.listIterator();
	
	while(i2.hasNext());
	{
		System.out.println(i2.next());
	}
	
	System.out.println("Backward Iteration using List of Iterator");	
	
	while(i2.hasPrevious());
	{
		System.out.println(i2.previous());
	}
}
}
