package Javabasics;

public class SensitiveInfo
{
	
		private String emailid="contact@grotechminds.com";
		public String getEmailid()
		{
			return emailid;
		}
		public void setEmailid(String emailid)
		{
			this.emailid=emailid;
		}
		
		private String password="contact@123";
		
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		private int age=18;
		public int getAge()
		{
			return age;
		}
		public void setAge(int age)
		{
			this.age=age;
		}	
	}
	public class LogicGoogle
	{
	public static void main(String[] args) 
	{
		SensitiveInfo s1=new SensitiveInfo();
		s1.setEmailid("stbymkt@gmail.com");
		System.out.println(s1.getEmailid());
		
		s1.setPassword("stbymkt123");
		System.out.println(s1.getPassword());
		
		
		s1.setAge(56);
		System.out.println(s1.getAge());

	}
	

}
