package Javabasics;

import java.util.Arrays;

public class ArrayProblem5 
{
	public static void main (String[] args)
	{
		
		int []input=new int[4];
				input[0]=10;
				input[1]=20;
				input[2]=30;
				input[3]=40;
				System.out.println(Arrays.toString(input));
				
				int []reverse=new int[input.length];

				for(int i=0,j=input.length-1;i<input.length;i++,j--) 
				{
				reverse[j]=input[i];
				}
				
				System.out.println("Input Array is ->"+Arrays.toString(input));
				System.out.println("Output Array is ->"+Arrays.toString(reverse));				
	}
		
		
		}
	