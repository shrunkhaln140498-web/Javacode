package Javabasics;
class SuperClass
{
	void login()   //Overridden
	{
		System.out.println("Login with Email Id");
	}
}

public class SubClassAmazon extends  SuperClass
{
	void login()
	{
		super.login();
		System.out.println("Login with mobile No");
	}
	public static void main(String[] args)
	{
		SubClassAmazon s1=new SubClassAmazon();
		s1.login();
	}

}
