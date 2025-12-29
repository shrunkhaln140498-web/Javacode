package Javabasics;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceProgramme 
{
   public static void main(String[] args)
   {
	   List<Character> l1= new ArrayList<Character>();
	   l1.add('S');
	   l1.add('A');
	   l1.add('M');
	   l1.add('R');
	   l1.add('R');
	   l1.add('A');
	   System.out.println(l1);
	   Character c1= l1.get(0);
	   System.out.println(c1);
	   }
}
