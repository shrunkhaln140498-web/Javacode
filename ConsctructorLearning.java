package Javabasics;

public class ConsctructorLearning 
{
	ConsctructorLearning () // this is constructor, yes it is non static
	{
		System.out.println("This is constructor 1");
	}
	public static void main(String[] args)
	{
		ConsctructorLearning c1=new ConsctructorLearning ();
		ConsctructorLearning c2=new ConsctructorLearning ();
		ConsctructorLearning c3=new ConsctructorLearning ();
		ConsctructorLearning c4=new ConsctructorLearning ();
		
		new ConsctructorLearning ();
		
	}

}
