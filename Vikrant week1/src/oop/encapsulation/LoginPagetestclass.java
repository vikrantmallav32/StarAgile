package oop.encapsulation;

public class LoginPagetestclass {

	public static void main(String[] args) 
	{
		Loginpage user1=new Loginpage();
		user1.setUsername("Amit");
		user1.setPassword("amit123");
		user1.doLogin(user1.getUsername(),user1.getPassword());
		
		System.out.println("************************");
				
		Loginpage user2=new Loginpage();
		user2.setUsername("Pooja");
		user2.setPassword("pooja@123");
		user2.doLogin(user2.getUsername(),user2.getPassword());


	}

}
