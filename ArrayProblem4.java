package Javabasics;

import java.util.Arrays;

public class ArrayProblem4 
{
	public static void main (String[] args)
	{
		
		int []rollnoA=new int[4];
				rollnoA[0]=40;
				rollnoA[1]=45;
				rollnoA[2]=46;
				rollnoA[3]=51;
				
				System.out.println(Arrays.toString(rollnoA));


				int []rollnoB=new int[4];
				rollnoB[0]=40;
				rollnoB[1]=45;
				rollnoB[2]=46;
				rollnoB[3]=51;
				
				System.out.println(Arrays.toString(rollnoB));
				
				
				boolean b1=	Arrays.equals(rollnoA, rollnoB);
				if(b1==true)
				{
					System.out.println("The two given array are equal to each other");
				}
				else
				{
					System.out.println("The two given array are NOT equal to each other");
				}
								
	}
		}
	