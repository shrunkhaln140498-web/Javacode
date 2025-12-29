package Javabasics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProperty 
{
   public static void main(String[] args)
   {
	   Set<Integer> s1= new HashSet<Integer>();
	   s1.add(45);
	   s1.add(55);
	   s1.add(65);
	   s1.add(75);
	   s1.add(85);
	   s1.add(95);
	   s1.add(null);
	   System.out.println(s1);
	   
	   Iterator<Integer> i1= s1.iterator();
	   while(i1.hasNext())
	   {
		   System.out.println(i1.next());
	   }
	  
	   }
}
