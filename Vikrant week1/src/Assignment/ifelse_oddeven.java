package Assignment;

import java.util.Scanner;

public class ifelse_oddeven {

	public static void main(String[] args) 
	{
		System.out.println("Program started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Number : ");
		int a= sc.nextInt();
		if(a%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
		System.out.println("Program End");
	}

}
