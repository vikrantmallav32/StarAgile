package Controlflow;

import java.util.Scanner;

public class Simpleif {

	public static void main(String[] args) 
	{
		System.out.println("Program started");
		Scanner sc=new Scanner(System.in);
		sc.close();
		System.out.println("Enter Your Age : ");
		int age= sc.nextInt();
		if(age>=18)
		{
			System.out.println("Candidate is Valid for Voting");
		}
		System.out.println("Program End");
	
	}

}
