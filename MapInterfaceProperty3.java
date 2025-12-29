package Javabasics;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterfaceProperty3 
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
	
	System.out.println("Iterating key with KeySet:");
	for(Integer i1 :m1.keySet())
	{
		System.out.println(i1);
	}
	System.out.println("Iterating values with values:");
	for(String i2 :m1.values())
	{
		System.out.println(i2);
	}
	System.out.println("Iterating key and values pair with EnterySet:");
	for(Entry<Integer, String> i3: m1.entrySet())
	{
		System.out.println(i3);
	}
	
	System.out.println("Iterating key and values pair with iterator:");
	Set<Entry<Integer,String>> s2= m1.entrySet();
	Iterator<Entry<Integer,String>> i5= s2.iterator();
	while(i5.hasNext())
	{
		System.out.println(i5.next());
	}
}
}