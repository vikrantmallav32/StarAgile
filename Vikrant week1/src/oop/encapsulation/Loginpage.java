package oop.encapsulation;

public class Loginpage 
{
	private String Username;
	private String Password;
	
	
	
	public String getUsername() {
		return Username;
	}



	public void setUsername(String username) {
		Username = username;
	}



	public String getPassword() {
		return Password;
	}



	public void setPassword(String password) {
		Password = password;
	}



	//Business Logic
	public void doLogin(String un,String psw)
	{
		System.out.println("User Login Successfully");
		System.out.println("User Login with Name: "+un);
	}

}
