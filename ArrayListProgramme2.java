package Javabasics;

import java.util.ArrayList;

public class ArrayListProgramme2 
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
		
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(4444);
		a2.add(5555);
		a2.add(666666);
		a2.add(77777);
		//a2.addAll(a1);
		System.out.println(a2);
		
		a2.addAll(0,a1);
		System.out.println(a2);

}
}
