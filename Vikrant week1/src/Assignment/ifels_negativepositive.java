package Assignment;

import java.util.Scanner;

public class ifels_negativepositive {

	public static void main(String[] args) 
	{
		System.out.println("Program started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number : ");
		int a= sc.nextInt();
		if(a<0)
		{
			System.out.println("Number is Negative");
		}
		else
		{
			System.out.println("Number is Positive");
		}
		System.out.println("Program End");

	}

}
