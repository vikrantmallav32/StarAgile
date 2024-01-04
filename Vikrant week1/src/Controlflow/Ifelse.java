package Controlflow;

import java.util.Scanner;

public class Ifelse 
{
	public static void main(String[] args)
	{
		System.out.println("Program Started");
		Scanner sc=new Scanner(System.in);
		sc.close();
		System.out.println("Enter Value of A : ");
		System.out.println("Enter Value of B : ");
		int a= sc.nextInt();
		int b= sc.nextInt();
		//int a=100, b=150;
		
		if(a>b)
			{
				System.out.println("A is Greter Than B");
			}
		else
			{
				System.out.println("A is less than B");
			}
		System.out.println("Program End");
	}
}
