package Javabasics;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceProperty2 
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
	
	/*
	boolean b1=m1.isEmpty();
	System.out.println(b1);
	
	m1.clear();
	System.out.println(m1);
	*/
	
	m1.remove(65201);
	System.out.println("After removing Pradhnya Lavhatre"+m1);
	
	m1.replace(6789, "Aniket");
	System.out.println("New M1 after replacing"+m1);
	
	boolean b3= m1.containsKey(1234);
	System.out.println(b3);
	boolean b4= m1.containsValue("Akshay");
	System.out.println(b4);
	
}
}