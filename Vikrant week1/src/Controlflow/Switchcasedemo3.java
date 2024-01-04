package Controlflow;

import java.util.Scanner;

public class Switchcasedemo3 
{
	public static void main(String[] args)
	{
		
		//String class have conversion method
		//toLowercase()====>to convert all character in lower case
		//toUppercase()====>to convert all character in upper case
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Browser Name :-");
		String bname=sc.nextLine();
		switch (bname.toLowerCase()) {
		case "chrome":
			System.out.println("Test Case is Executing on Chrome");
			break;
		case "firefox":
			System.out.println("Test Case is Executing on Chrome");
			break;
		case "edge":
			System.out.println("Test Case is Executing on Chrome");
			break;
			
		default:
			System.out.println("Enter Valid Browser");
			break;
		}
	}

}
