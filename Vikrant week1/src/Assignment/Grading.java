package Assignment;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) 
	{
		System.out.println("Program started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks Obtained :- ");
		int a=sc.nextInt();
		if (a>=95)
		{
			System.out.println("Grade Obtained = A++");
		}
		else if(90<=a && a<95)
		{
			System.out.println("Grade Obtained = A");
		}
		else
		{
			System.out.println("Grade Obtained = B");
		}
	}

}
