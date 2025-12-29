package Javabasics;

public class StudentDetails2 
{
		int age;
	    String name;
	    double salary;
	    void details(int age,String name,double salary)
	    {
	            System.out.println("Age of the person is:"+age);
	            System.out.println("Name of the person is:"+name);
	            System.out.println("Salary of the person is:"+salary);
	            this.age=age;//syntax of this keyword
	            this.salary=salary;
	            this.name=name;
	            
	    }
	public static void main(String[] args) 
	{
	    StudentDetails s1=new StudentDetails();
	    s1.details(45, "Ram", 111.11);
	    System.out.println(s1.age);
	    System.out.println(s1.name);
	    System.out.println(s1.salary);
	    
	}
		
}