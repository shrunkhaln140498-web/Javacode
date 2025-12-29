package Javabasics;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceProperty 
{
public static void main(String[] args)
{
	Map<Integer,String> m1= new HashMap<Integer,String>();
	m1.put(1234, "shrunkhal");
	m1.put(4567, "Anshuman");
	m1.put(6789, "Chandrashekhar");
	m1.put(9874, "Mahesh");
	m1.put(8521, "Akshay");
	m1.putIfAbsent(65201, "Pradhnya Lavhatre");
	System.out.println(m1);
	
	Map<Integer,String> m2= new HashMap<Integer,String>();
	m2.put(8521, "Rani");
	m2.put(7412, "Kajal");
	m2.put(9632, "Sakshi");
	m2.put(3574, "Pooja");
	System.out.println(m2);
	
	m2.putAll(m2);
	
	System.out.println("Updated map m2 is->"+m2);
}
}
