package Javabasics;
class  ScreenShotCode
{
ScreenShotCode()
{
	System.out.println("This is constructor 3");
}
}
class BaseClassParent extends ScreenShotCode
{
BaseClassParent()
{
	System.out.println("This is constructor 2");
}
}
public class TestCase1_LogintoAmazon extends BaseClassParent
{
	TestCase1_LogintoAmazon ()
	
	{
		System.out.println("This is constructor 1");
	}
	
    public static void main(String[] args)
    
   {
       new TestCase1_LogintoAmazon();
   }
}
