package Javabasics;

public class StringBufferProgramme 
{
	public static void main(String[] args)
	{
		StringBuffer s1=new StringBuffer("Shrunkhal Ajay Meshram");
		        //     s1.delete(7, 12);
		         //    System.out.println(s1);
		
	//	s1.replace(0, 6,"Anshuman");
	//	System.out.println(s1);
		
		StringBuffer s2=new StringBuffer("Student is Chandrashekhar");
		       s2.insert(8, "name ");
		       System.out.println(s2);
		       
		       StringBuffer s3=new StringBuffer("Automation");
		 //                   s3.reverse();
		 //                   System.out.println(s3);
		       
		     String output=  s3.substring(3);
		       System.out.println(output);
		       String output1=s3.substring(3,6);
		       System.out.println(output1);
	}

}
