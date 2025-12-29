package Javabasics;

import java.util.Arrays;

public class ArrayProblem3 
{
	public static void main (String[] args)
	{
		int []rollnoA=new int[4];
				rollnoA[0]=40;
				rollnoA[1]=45;
				rollnoA[2]=46;
				rollnoA[3]=51;
				System.out.println(Arrays.toString(rollnoA));

				
				int []rollnoB =new int[4];

				for(int i=0;i<rollnoA.length;i++)
				{
				rollnoB[i]=	rollnoA[i];
				}
				/*i=0, rollnoB[0]=rollnoA[0];
				 * i=1, rollnoB[1]=rollnoA[1];
				 * i=2, rollnoB[2]=rollnoA[2];
				 * i=3, rollnoB[3]=rollnoA[3];
				 * 
				 */

				System.out.println("Input Array is ->"+Arrays.toString(rollnoA));
				System.out.println("Output Array is ->"+Arrays.toString(rollnoB));
						
	}
		}
	